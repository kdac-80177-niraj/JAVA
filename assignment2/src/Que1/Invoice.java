package Que1;
import java.util.*;
public class Invoice {
	
	Scanner sc = new Scanner(System.in);
	String partNumber;
	String partDescription;
	int quantity;
	double price;
	int bill = 0;
	
	public Invoice() {
		this.partNumber = "1";
		this.partDescription = "";
		this.price = 1.1;
		this.quantity = 1;
	}
	
	public Invoice(String partNumber, String partDescription, int quantity, double price) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;		
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void accept() {
		System.out.println("Enter part number: ");
		this.partNumber = sc.nextLine();
		System.out.println("Enter price description: ");
		this.partDescription = sc.nextLine();
		System.out.println();
		System.out.println("Enter quantity");
		this.quantity = sc.nextInt();
		if(this.quantity<0)
			this.quantity = 0;
		System.out.println("Enter price: ");
		this.price = sc.nextInt();
	}
	public void display() {
		System.out.println("Part number: "+this.partNumber);
		System.out.println("Price description: "+this.partDescription);
		System.out.println("Quantity: "+this.quantity);
		System.out.println("Price of one part: "+this.price);
	}
	public void calculateBill() {
		this.bill += this.price*this.quantity;
		System.out.println("Total bill is: "+this.bill);
	}
	
}