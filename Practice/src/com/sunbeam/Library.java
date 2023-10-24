package com.sunbeam;
import java.util.*;
public class Library {
	private String name;
	private int ISBN;
	Scanner sc = new Scanner(System.in);
	
	public Library() {
		super();
	}
	
	public Library(String name, int iSBN) {
		super();
		this.name = name;
		ISBN = iSBN;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public void accept() {
		System.out.println("Enter Book Name: ");
		this.name = sc.next();
		System.out.println("Enter ISBN: ");
		this.ISBN = sc.nextInt();
	}

	@Override
	public String toString() {
		return "Library [name=" + name + ", ISBN=" + ISBN + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ISBN, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		return ISBN == other.ISBN && Objects.equals(name, other.name);
	}

	

	
	
	
}
