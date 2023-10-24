package com.sunbeam;
import java.io.Serializable;
import java.util.*;
public class Books extends Library implements Serializable{
	private String author;
	private double price;
	private String dateOfIssue;
	private String dateOfRecollected;
	Scanner sc = new Scanner(System.in);
	public Books() {
		super();
	}
	public Books(String name,int isbn,String author, double price, String dateOfIssue, String dateOfRecollected) {
		super();
		super.setName(name);
		super.setISBN(isbn);
		this.author = author;
		this.price = price;
		this.dateOfIssue = dateOfIssue;
		this.dateOfRecollected = dateOfRecollected;
	}
	public String getName() {
		return super.getName();
	}
	public void setName(String name) {
		super.setName(name);
	}
	public int getISBN() {
		return super.getISBN();
	}
	public void setISBN(int isbn) {
		super.setISBN(isbn);
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public String getDateOfRecollected() {
		return dateOfRecollected;
	}
	public void setDateOfRecollected(String dateOfRecollected) {
		this.dateOfRecollected = dateOfRecollected;
	}
	public void accept() {
		super.accept();
		//Library l1 = new Library(this.getName(),this.getISBN());
		System.out.println("Enter author: ");
		this.author = sc.next();
		System.out.println("Enter Price: ");
		this.price = sc.nextDouble();
		System.out.println("Enter date of issue: ");
		this.dateOfIssue = sc.next();
		System.out.println("Enter date of book submitted: ");
		this.dateOfRecollected = sc.next();
	}
	@Override
	public String toString() {
		return "Books [Name= " + getName() + ", ISBN= " + getISBN() + ", author=" + author + ", price=" + price + ", dateOfIssue=" + dateOfIssue + ", dateOfRecollected="
				+ dateOfRecollected +"]";
	}

	@Override
	/*public boolean equals(Object obj) {
		Books other=(Books)obj;
		if(this==other)
			return true;
		if(this==null)
			return false;
		if(this.author.equals(other.author))
			return true;
		return false;
	}*/
	public boolean equals(Object obj) {
		Books other = (Books)obj;
		if(this == obj)
			return true;
		if(this==null)
			return false;
		return this.getISBN() == other.getISBN() || this.getName().equals(other.getName());
	}
}
