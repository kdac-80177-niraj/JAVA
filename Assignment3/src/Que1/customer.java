package Que1;

import java.util.Scanner;

public class customer {
	int accountNumber;
	int beginBalance;
	int itemsCharged;
	int creditsApplied;
	int creditLimit=3000;
	int newBalance;
	Scanner sc = new Scanner(System.in);
	public customer() {
		
	}
	public customer(int accountNumber, int beginBalance, int itemsCharged, int creditsApplied, int creditLimit) {
		this.accountNumber = this.accountNumber;
		this.beginBalance = this.beginBalance;
		this.itemsCharged = this.itemsCharged;
		this.creditsApplied = this.creditsApplied;
		this.creditLimit = this.creditLimit;
	}
	
	public void accept() {
		System.out.println("Enter account number: ");
		this.accountNumber = sc.nextInt();
		System.out.println("Enter begining balance: ");
		this.beginBalance = sc.nextInt();
		System.out.println("Enter total items charged: ");
		this.itemsCharged = sc.nextInt();
		System.out.println("Enter credits applied: ");
		this.creditsApplied = sc.nextInt();
		
	}
	public void display() {
		System.out.println("Account number: "+this.accountNumber);
		System.out.println("Balance at begining of month: "+this.beginBalance);
		System.out.println("Total items charged: "+this.itemsCharged);
		System.out.println("Credits applied: "+this.creditsApplied);
		System.out.println("Credit limit: "+this.creditLimit);
		System.out.println("New balance is: "+this.newBalance);
	}
	public void status() {
		this.newBalance = this.beginBalance+this.creditLimit;
		this.newBalance = this.beginBalance - this.itemsCharged + this.creditsApplied;
		if(newBalance < 0) {
			System.out.println("Credit limit exceeded");
		}else {
			System.out.println("Remaining balance is: "+newBalance);
		}
	}
		
}
