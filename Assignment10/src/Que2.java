
import java.util.*;
public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String>list = new ArrayList<>();
		list.add("Create a list of strings. Find the string with highest length using Collections.max().");
		list.add("Delete a book with given isbn.");
		list.add("Create a list of strings. Find the string with highest length using Collections.max().Delete a book with given isbn.");
		
		//String max = Collections.max(list,Comparator.comparingInt(String::length));
		//System.out.println(max);
		/*int size1 = list.get(0).length();
		String max = list.get(0);
		for(int i = 1 ; i < list.size() ; i++) {
			if(size1<list.get(i).length()) {
				max = list.get(i);
			}
		}*/
		class StringComparator implements Comparator<String>{

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				int diff = s1.length()-s2.length();
				
				return diff;
			}
		}
			
			StringComparator stringcomp = new StringComparator();
			String max = Collections.max(list,stringcomp);
			System.out.println(max);


}
}
