package paper1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

enum Size {
    S, M, L, XL
}

class Cloth {
    private static int idCounter = 1;
    private int id;
    private Date listingDate;
    private Date stockUpdateDate;
    private int stock;
    private Size size;
    private double price;

    public Cloth(Date listingDate, int stock, Size size, double price) {
        this.id = idCounter++;
        this.listingDate = listingDate;
        this.stockUpdateDate = new Date();
        this.stock = stock;
        this.size = size;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public Date getListingDate() {
        return listingDate;
    }

    public Date getStockUpdateDate() {
        return stockUpdateDate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
        this.stockUpdateDate = new Date();
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Listing Date: " + listingDate + " | Stock Update Date: " + stockUpdateDate
                + " | Stock: " + stock + " | Size: " + size + " | Price: " + price + " INR";
    }
}

public class FashionEcommerce {
    public static void main(String[] args) {
        List<Cloth> clothes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Fashion E-commerce Menu:");
            System.out.println("1. Add new Cloth");
            System.out.println("2. Update stock of a Cloth");
            System.out.println("3. Display Clothes having size S");
            System.out.println("4. Display Clothes which are out of stock");
            System.out.println("5. Remove clothes which are out of stock for last 3 months");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter listing date (yyyy-MM-dd): ");
                    String listingDateString = scanner.nextLine();
                    Date listingDate = new Date();
                    try {
                        listingDate = new SimpleDateFormat("yyyy-MM-dd").parse(listingDateString);
                    } catch (ParseException e) {
                        System.out.println("Invalid date format. Cloth not added.");
                        continue;
                    }

                    System.out.print("Enter initial stock: ");
                    int initialStock = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter size (S, M, L, XL): ");
                    Size size = Size.valueOf(scanner.nextLine());

                    System.out.print("Enter price (INR): ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    Cloth newCloth = new Cloth(listingDate, initialStock, size, price);
                    clothes.add(newCloth);
                    System.out.println("Cloth added successfully.");
                    break;

                case 2:
                    System.out.print("Enter the Cloth ID to update stock: ");
                    int clothId = scanner.nextInt();
                    scanner.nextLine();

                    Optional<Cloth> clothToUpdate = clothes.stream()
                            .filter(c -> c.getId() == clothId)
                            .findFirst();

                    if (clothToUpdate.isPresent()) {
                        System.out.print("Enter new stock quantity: ");
                        int newStock = scanner.nextInt();
                        scanner.nextLine();

                        clothToUpdate.get().setStock(newStock);
                        System.out.println("Stock updated successfully.");
                    } else {
                        System.out.println("Cloth not found.");
                    }
                    break;

                case 3:
                    List<Cloth> sizeSClothes = clothes.stream()
                            .filter(c -> c.getSize() == Size.S)
                            .collect(Collectors.toList());

                    if (sizeSClothes.isEmpty()) {
                        System.out.println("No clothes of size S available.");
                    } else {
                        System.out.println("Clothes of size S:");
                        sizeSClothes.forEach(System.out::println);
                    }
                    break;

                case 4:
                    List<Cloth> outOfStockClothes = clothes.stream()
                            .filter(c -> c.getStock() == 0)
                            .collect(Collectors.toList());

                    if (outOfStockClothes.isEmpty()) {
                        System.out.println("No clothes are out of stock.");
                    } else {
                        System.out.println("Out of stock clothes:");
                        outOfStockClothes.forEach(System.out::println);
                    }
                    break;

                case 5:
                    Date currentDate = new Date();
                    Calendar calendar = Calendar.getInstance();
                    calendar.add(Calendar.MONTH, -3);
                    Date threeMonthsAgo = calendar.getTime();

                    List<Cloth> removeClothes = clothes.stream()
                            .filter(c -> c.getStockUpdateDate().before(threeMonthsAgo))
                            .collect(Collectors.toList());

                    if (removeClothes.isEmpty()) {
                        System.out.println("No clothes to remove.");
                    } else {
                        removeClothes.forEach(clothes::remove);
                        System.out.println("Removed clothes that were out of stock for 3 months.");
                    }
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}