package que6;
import java.util.*;
import java.util.stream.Stream;

public class que6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find factorial: ");
		long num = sc.nextInt();
		Stream <Integer> strm = Stream.iterate(1, x->x+1).limit(num);
		long result = strm.reduce(1, (x,y)->x*y);
		System.out.println("Result: "+result);
	}

}
