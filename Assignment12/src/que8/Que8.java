package que8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Que8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer>strm = Stream.iterate(1, x->x+1).limit(10);
		strm.forEach(ele->System.out.println(ele));
		Stream<Integer>strm1 = Stream.iterate(1, x->x+1).limit(10);
		Integer sum = strm1.reduce(0, (a,e)->a+e);
		System.out.println(sum);
		IntStream s = IntStream.range(0, 11);
		System.out.println(s.sum());
		System.out.println(s);
		IntStream s2 = IntStream.range(0, 11);
		System.out.println(s2.summaryStatistics());
		IntStream s3 = IntStream.range(0, 11);
		System.out.println(s3.count());
		IntStream s4 = IntStream.range(0, 11);
		System.out.println(s4.max());
	}

}
