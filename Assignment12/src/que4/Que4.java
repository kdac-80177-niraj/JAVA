package que4;
import java.util.*;

interface check<T>{
	boolean compare(T x,T y);
}
public class Que4 {

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
		Integer[] arr = {44, 77, 99, 22,50, 55, 66, 50};
		Integer key = 50;
		
		int cnt = countIf(arr,key,(x,y)->x==y);
		System.out.println("Count= "+cnt);
	}

}
