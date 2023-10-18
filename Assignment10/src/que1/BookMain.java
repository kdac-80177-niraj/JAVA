package que1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = new Scanner(System.in);
		List<BookDetails> list = new ArrayList<>();
		do {
			System.out.println("0.Exit.");
			System.out.println("1. Add new book in list.");
			System.out.println("2. Display all books in forward order using random access.");
			System.out.println("3. Search a book with given isbn");
			System.out.println("4. Delete a book at given index.");
			System.out.println("5. Delete a book with given isbn.");
			System.out.println("6. Reverse the list");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("Exiting......");
				break;
			case 1:
				BookDetails b = new BookDetails();
				BookDetails key1 = new BookDetails();
				b.accept();
				key1.setISBN(b.getISBN());
				if(list.contains(key1)) {
					int index = list.indexOf(b);
					list.get(index).setQuantity(list.get(index).getQuantity() + b.getQuantity());
					System.out.println("Book added");
				}else {
					list.add(b);
				}
				break;
			case 2:
				for(int i = 0 ; i < list.size() ; i++) {
					b = list.get(i);
					System.out.println(b);
				}
				break;
			case 3:
				BookDetails key3 = new BookDetails();
				System.out.println("Enter ISBN: ");
				String index = sc.next();
				key3.setISBN(index);
				if(list.contains(key3))
					System.out.println("Found at index: "+list.indexOf(key3));
				else
					System.out.println("Not Found");
				break;
			case 4: 
				System.out.println("Enter index: ");
				int index1 = sc.nextInt();
				if (index1 < list.size()) {
					list.remove(index1);
				}
				break;
			case 5:
				System.out.println("Enter ISBN: ");
				String ISBN = sc.next(); 
				BookDetails key4 = new BookDetails();
				key4.setISBN(ISBN);
				if(list.contains(key4)) {
					int index2 = list.indexOf(key4);
					list.remove(index2);
				}else {
					System.out.println("Book with given ISBN not found");
				}
				break;
			case 6:
				ListIterator<BookDetails> itr = list.listIterator(list.size());
				while(itr.hasPrevious()) {
					BookDetails b4 = itr.previous();
					System.out.println(b4);
					
				}
				break;
			}
			
		} while (choice!= 0);
		

	}

}
