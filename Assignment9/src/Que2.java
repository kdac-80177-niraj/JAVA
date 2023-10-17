import java.util.Arrays;
import java.util.Comparator;

public class Que2 {

	static <T> void selectionSort(T[] arr,Comparator<T> c) {
		for(int i = 0 ; i < arr.length-1 ; i++) {
			for(int j = i+1 ; j <arr.length ; j++) {
				if(c.compare(arr[i], arr[j])>0) {
					T t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double arr[] = {22.1,33.2,14.1,7.3,98.1};
		
		System.out.println("Before Sort: ");
		for(Double d : arr) {
			System.out.println(d);
		}
		
		class ArrayComparator implements Comparator<Double>{

			@Override
			public int compare(Double d1, Double d2) {
				int diff = d1.compareTo(d2);
				return diff;
			}
			
		}
		
		ArrayComparator a1 = new ArrayComparator();
		selectionSort(arr,a1);
		
		System.out.println("After Sort: ");
		for(Double d : arr) {
			System.out.println(d);
		}
	}

}
