package que5;
import java.util.Objects;
import java.util.Scanner;
public class Book /*implements Comparable<Book> */{
	private int ISBN;
	private double price;
	private String authorName;
	private int quantity;
	Scanner sc = new Scanner(System.in);
	@Override
	public String toString() {
		return "BookDetails [ISBN=" + ISBN + ", price=" + price + ", authorName=" + authorName + ", quantity="
				+ quantity + "]";
	}
	public Book() {
		super();
	}
	public Book(int iSBN, double price, String authorName, int quantity) {
		super();
		ISBN = iSBN;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void accept() {
		System.out.println("Enter ISBN: ");
		this.ISBN = sc.nextInt();
		System.out.println("Enter Price: ");
		this.price = sc.nextDouble();
		System.out.println("Enter Author: ");
		this.authorName = sc.next();
		System.out.println("Enter Quantity: ");
		this.quantity = sc.nextInt();
	}
	/*public int hashCode() {
		int hash = Objects.hash(this.ISBN);
		return hash;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(obj instanceof Book) {
			Book book = (Book)obj;
			if(this.ISBN == book.ISBN)
				return true;
		}
		return false;
	}
	@Override
	public int compareTo(Book obj) {
		// TODO Auto-generated method stub
		int diff = Integer.compare(this.ISBN, obj.ISBN);
		return diff;
	}*/
	
}