package que4;
import java.util.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class BookComparator implements Comparator<Book>{

			@Override
			public int compare(Book book1, Book book2) {
				// TODO Auto-generated method stub
				int diff = -Double.compare(book1.getPrice(), book2.getPrice());
				return diff;
			}
			
		}
		BookComparator bc = new BookComparator();
		
		Book b1 = new Book(1001,200,"Niraj",20);
		Book b2 = new Book(1002,300,"Rutik",30);
		Book b3 = new Book(1003,400,"Pranav",40);
		Book b4 = new Book(1004,500,"Sourabh",50);
		Book b5 = new Book(1005,600,"Abhishek",50);
		Book b6 = new Book(1005,600,"Kunal",60);
		TreeSet<Book> set = new TreeSet<>(bc);
		set.add(b1);
		/*set.add(null);
		set.add(null);*/
		set.add(b3);
		set.add(b5);
		set.add(b4);
		set.add(b5);
		set.add(b2);
		set.add(b6); //duplicate value didn't added;
		/*for (Book book : set) {
			System.out.println(book);
		}*/
		System.out.println("Using Iterator and Descending price: ");
		Iterator<Book> itr = set.iterator();
		while(itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b+", ");
		}
		System.out.println("Using Descending Iterator ");
		Iterator<Book> itr1 = set.descendingIterator();
		while(itr1.hasNext()) {
			Book s = itr1.next();
			System.out.println(s+", ");
		}
		
		Book b7 = new Book(1001,200,"Niraj",20);
		Book b8 = new Book(1002,300,"Rutik",30);
		Book b9 = new Book(1003,400,"Pranav",40);
		Book b10 = new Book(1004,500,"Sourabh",50);
		Book b11 = new Book(1005,600,"Abhishek",50);
		Book b12 = new Book(1005,700,"Kunal",60);
		TreeSet<Book> set2 = new TreeSet<>();
		set2.add(b1);
		/*set.add(null);
		set.add(null);*/
		set2.add(b8);
		set2.add(b7);
		set2.add(b9);
		set2.add(b10);
		set2.add(b11);
		set2.add(b12); 
		
		System.out.println("Using Comparable and avoiding duplicate id.");
		Iterator<Book> itr3 = set2.iterator();
		while(itr3.hasNext()) {
			Book s2 = itr3.next();
			System.out.println(s2+", ");
		}
	}

}
