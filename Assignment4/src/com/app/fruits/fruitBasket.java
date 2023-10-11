package com.app.fruits;
import java.util.*;
import com.app.fruits.*;
public class fruitBasket {
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("0. Exit.");
		System.out.println("1. Add Mango.");
		System.out.println("2. Add Orange.");
		System.out.println("3. Add Apple.");
		System.out.println("4. Display names of all fruits.");
		System.out.println("5. Display details of all fruits.");
		System.out.println("6. Display tastes of all stale(nonFresh) fruits.");
		System.out.println("7. Mark fruit as stale(not Fresh).");
		System.out.println("8. Mark all sour fruits.");
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of fruits you want to add: ");
		n = sc.nextInt();
		fruits basket[] = new fruits[n];
		int counter = 0;
		int choice;
		while((choice = menu())!=0) {
			switch(choice) {
			case 0:
				System.out.println("Exiting........");
				break;
			case 1:
				if(counter<n) {
						basket[counter] = new mango();
						basket[counter].acceptData();
						counter++;
				}else {
					System.out.println("Basket full.");
				}
				break;
			case 2:
				if(counter<n) {
						basket[counter] = new orange();
						basket[counter].acceptData();
						counter++;
					
				}else {
					System.out.println("Basket full.");
				}
				break;
			case 3:
				if(counter<n) {
						basket[counter] = new apple();
						basket[counter].acceptData();
						counter++;
				}else {
					System.out.println("Basket full.");
				}
				break;
			case 4:
				for(int i = 0 ; i < counter ; i++) {
					System.out.println(basket[i].getName());
					//basket[i].getName();
				}
				break;
			case 5:
				for(int i = 0 ; i < counter ; i++) {
					System.out.println(basket[i].toString()+" "+basket[i].taste());
				}
				break;
			case 6:
				for(int i = 0 ; i < counter ; i++) {
					if(!basket[i].isFresh) {
						System.out.println(basket[i].getName()+" "+basket[i].taste());
					}
				}
				break;
			case 7:
				System.out.println("Enter index of fruit you want to declare stale: ");
				int index = sc.nextInt();
				if(index < counter) {
					for(int i = 0 ; i < counter ; i++) {
						if(index == i) {
							basket[i].setIsFresh(false);
						}
					}
				}else
					System.out.println("Index not found try again.......");
				break;
			}
		}

	}

}
