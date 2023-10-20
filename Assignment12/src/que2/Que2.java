package que2;
import java.util.*;
import java.util.function.Predicate;
public class Que2 {

	public static int countIf(String[] arr,Predicate<String> cond) {
		int count = 0;
		for(String str : arr) {
			if(cond.test(str))
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"Nilesh", "Shubham", "Pratik", "Omkar", "Prashant"};
		/*int cnt = countIf(arr,new Predicate<String>() {
			public boolean test(String s) {
				return s.length() > 6;
			}
		});*/
		int cnt = countIf(arr,ele->ele.length()>6);
		System.out.println("Result: "+cnt);
	}

}
