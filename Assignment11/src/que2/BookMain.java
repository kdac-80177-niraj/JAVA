package que2;
import java.util.*;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(1001,200,"Niraj",20);
		Book b2 = new Book(1002,300,"Rutik",30);
		Book b3 = new Book(1003,400,"Pranav",40);
		Book b4 = new Book(1004,500,"Sourabh",50);
		Book b5 = new Book(1005,600,"Abhishek",50);
		Book b6 = new Book(1005,700,"Kunal",60);
		Set<Book> set = new LinkedHashSet<>();
		set.add(b1);
		set.add(null);
		set.add(null);
		set.add(b3);
		set.add(b5);
		set.add(b4);
		set.add(b5);
		set.add(b2);
		set.add(b6); //duplicate value didn't added;
		
		/*for (Book book : set) {
			System.out.println(book);
		}*/
		
		Iterator<Book> itr = set.iterator();
		while(itr.hasNext()) {
			Book b = itr.next();
			System.out.println(b);
		}
		//without hashCode() it will take duplicate values
		//output will be insertion wise.
		//by using hashCode() duplicates were avoided
		//the output will stay in insertion wise manner.
	}

}
