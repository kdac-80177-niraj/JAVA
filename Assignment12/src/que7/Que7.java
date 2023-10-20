package que7;

import java.util.Random;
import java.util.stream.Stream;

public class Que7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Stream<Integer> strm = Stream.generate(()->r.nextInt(100)).limit(10);
		Integer sum = strm.reduce(1, (x,y)->x+y);
		System.out.println("Sum: "+sum);
	}

}
