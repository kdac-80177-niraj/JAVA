package que5;
import java.util.*;

interface check<T>{
	boolean compare(T x,T y);
}
public class Que5 {

	static <T> int countIf(T[] arr,T key, check<T> c) {
		int count = 0;
		for (T t : arr) {
			boolean diff = c.compare(t, key);
			if(diff == true)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Double[] arr = {44.4, 77.7, 99.9, 22.2,50.1, 55.0, 66.0, 50.8};
		System.out.println("Enter a key to find count: ");
		Integer key = sc.nextInt();
		
		int cnt = countIf(arr,key,(x,y)->x==y);
		System.out.println("Count= "+cnt);
	}

}
