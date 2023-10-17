package que4;
import java.util.*;
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = new Scanner(System.in);
		List<BookDetails> list = new ArrayList<>();
		do {
			System.out.println("0.Exit.");
			System.out.println("1. Add new book in list.");
			System.out.println("2. Display all books in forward order.");
			System.out.println("3. Delete at book given index.");
			System.out.println("4. Check if book with given isbn is in list or not.");
			System.out.println("5. Delete all books in list.");
			System.out.println("6. Display number of books in list.");
			System.out.println("7. Sort all books by price in desc order.");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("Exiting......");
				break;
			case 1:
				BookDetails b = new BookDetails();
				b.accept();
				list.add(b);
				break;
			case 2:
				for(BookDetails b1 : list) {
					System.out.println(b1);
				}
				break;
			case 3:
				int index;
				System.out.println("Enter book location to delete: ");
				index = sc.nextInt();
				for(int i = 0 ; i < list.size() ; i++) {
					if(index == i) {
						list.remove(index);
					}
				}
				break;
			case 4: 
				int ISBN = sc.nextInt();
				BookDetails key = new BookDetails();
				key.setISBN(ISBN);
				if(list.contains(key))
					System.out.println("Found");
				else
					System.out.println("Not Found");
				break;
			case 5:
				list.clear();
				break;
			case 6:
				System.out.println("Total books: "+list.size());
				break;
			case 7:
				class BookSort implements Comparator<BookDetails>{
					public int compare(BookDetails b1, BookDetails b2) {
						
						int diff = -Double.compare(b1.getPrice(), b2.getPrice());
						return diff;
					}	
				}
				
				BookSort book = new BookSort();
				list.sort(book);
				
				System.out.println("Books in descending order..");
				for (BookDetails bookDetails : list) {
					System.out.println(bookDetails);
				}
				
				
			}
			
		} while (choice!= 0);
		

	}

}
