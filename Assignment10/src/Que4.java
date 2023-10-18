import java.util.*;

public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c = new ArrayList<>();//shows null as well as duplicate values(as many times occured)
		//Collection<String> c = new HashSet<>();//sort and shows only one value for duplicates
		//Collection<String> c = new LinkedHashSet<>(); //duplicate values allowed but showed only once
		//Collection<String> c = new TreeSet<>(); //null pointer exception for null
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());
	}

}
