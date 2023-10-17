package que4;
import java.util.*;
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = new Scanner(System.in);
		ArrayList<BookDetails> c = new ArrayList<>();
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
				c.add(b);
				break;
			case 2:
				for(BookDetails b1 : c) {
					System.out.println(b1);
				}
				break;
			case 3:
				int index;
				System.out.println("Enter book location to delete: ");
				index = sc.nextInt();
				for(int i = 0 ; i < c.size() ; i++) {
					if(index == i) {
						c.remove(index);
					}
				}
				break;
			case 4: 
				int isbn;
				System.out.println("Enter ISBN you want to check: ");
				isbn = sc.nextInt();
				for(int i = 0 ; i < c.size() ; i++) {
					if(c.contains(isbn))
						System.out.println("Book present at index "+i);
					else
						System.out.println("Book not found");
				}
				break;
			case 5:
				c.clear();
				break;
			case 6:
				System.out.println("Total books: "+c.size());
				break;
			case 7:
				class BookSort implements Comparator<BookDetails>{

					@Override
					public int compare(BookDetails b1, BookDetails b2) {
						// TODO Auto-generated method stub
						int diff = -Double.compare(b1.getPrice(), b2.getPrice());
						return diff;
					}	
				}
				
				BookSort b3 = new BookSort();
				Arrays.sort(c,b3);
			}
			
		} while (choice!= 0);
		

	}

}
