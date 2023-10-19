package que5;
import java.util.*;
import java.util.Map.Entry;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(1001,200,"Niraj",20);
		Book b2 = new Book(1002,300,"Rutik",30);
		Book b3 = new Book(1003,400,"Pranav",40);
		Book b4 = new Book(1004,500,"Sourabh",50);
		Book b5 = new Book(1005,600,"Abhishek",50);
		Map<Integer, Book> map = new HashMap<>();
		map.put(b1.getISBN(), b1);
		map.put(b3.getISBN(), b3);
		map.put(b4.getISBN(), b4);
		map.put(b5.getISBN(), b5);
		map.put(b2.getISBN(), b2);
		
		System.out.println("Map size: "+map.size());
		
		Set<Integer> keys = map.keySet();
		System.out.println("Keys: "+keys);
		
		Collection<Book> values = map.values();
		System.out.println("Values"+values);
		
		Set<Entry<Integer,Book>> entries = map.entrySet();
		for (Entry<Integer, Book> entry : entries) {
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}
		
		System.out.println(map.toString());
		System.out.println("Enter ISBN to search: ");
		Scanner sc = new Scanner(System.in);
		Integer isbn = sc.nextInt();
		Book f = map.get(isbn);
		if(f == null)
			System.out.println("Not found");
		else
			System.out.println(f);
		//cannot add null values or it will give NullPointerException
		//use comparable for sorting and removing duplicates also
		//output will be in sorted manner
		//TreeSet is not using equals() and hashCode() for any purpose
	}

}
