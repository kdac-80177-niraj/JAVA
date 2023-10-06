import java.util.Scanner;

public class assignment13 {

	public static int menu() {
		int choice;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("0. Exiting");
		System.out.println("1. Dosa.");
		System.out.println("2. Idli");
		System.out.println("3. Samosa");
		System.out.println("4. Vadapav");
		System.out.println("5. Pav-Bhaji");
		System.out.println("6. Calculate Bill");
		System.out.println("Enter Your Choice: ");
		choice = sc1.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int price, quantity;
		int bill = 0;
		int choice;

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 0:
				System.out.println("Exiting..........");
				break;
			case 1:
				System.out.println("Enter Quanity: ");
				quantity = sc.nextInt();
				price = 50 * quantity;
				bill = bill + price;
				System.out.println("Thank you, your order is being prepared....");
				break;
			case 2:
				System.out.println("Enter Quanity: ");
				quantity = sc.nextInt();
				price = 40 * quantity;
				bill = bill + price;
				System.out.println("Thank you, your order is being prepared....");
				break;
			case 3:
				System.out.println("Enter Quanity: ");
				quantity = sc.nextInt();
				price = 10 * quantity;
				bill = bill + price;
				System.out.println("Thank you, your order is being prepared....");
				break;
			case 4:
				System.out.println("Enter Quanity: ");
				quantity = sc.nextInt();
				price = 15 * quantity;
				bill = bill + price;
				System.out.println("Thank you, your order is being prepared....");
				break;
			case 5:
				System.out.println("Enter Quanity: ");
				quantity = sc.nextInt();
				price = 80 * quantity;
				bill = bill + price;
				System.out.println("Thank you, your order is being prepared....");
				break;
			case 6:
				System.out.println("Total bill is: " + bill);
				break;
			default:
				System.out.println("wrong choice......");
			}
		}
	}

}
