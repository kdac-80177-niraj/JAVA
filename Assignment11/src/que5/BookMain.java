package que5;
import java.util.*;
import java.util.Map.Entry;

import que6.Student;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer,Book> map = new HashMap<>();
		int choice;
		do {
			System.out.println("0. Exit.");
			System.out.println("1. Add.");
			System.out.println("2. Display.");
			System.out.println("3. Search.");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("Exiting.........");
				break;
			case 1:
				Book b = new Book();
				b.accept();
				map.put(b.getISBN(), b);
				break;
			case 2:
				Set<Entry<Integer,Book>> entries = map.entrySet();
				for (Entry<Integer, Book> entry : entries) {
					System.out.println(entry.getKey()+"--"+entry.getValue());
				}
				break;
			case 3:
				System.out.println("Enter ISBN to search: ");
				Integer isbn = sc.nextInt();
				Book f = map.get(isbn);
				if(f == null)
					System.out.println("Not found");
				else
					System.out.println(f);
				break;
			default:
				System.out.println("Wrong choice....please try again...");
				break;
			}
		} while (choice != 0);
		System.out.println("Thank you for using");
	}
	}
		//cannot add null values or it will give NullPointerException
		//use comparable for sorting and removing duplicates also
		//output will be in sorted manner
		//TreeSet is not using equals() and hashCode() for any purpose
