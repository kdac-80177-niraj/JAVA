
public class Que1 {
	public static <T extends Number> T findMin(T[] arr) {
		T min = arr[0];
		for(int i = 0 ; i < arr.length-1 ; i++) {
			if(min.doubleValue()>arr[i+1].doubleValue()) {
				min = arr[i+1];
			}
		}
		
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {2,5,1,4,3};
		int min = findMin(arr);
		System.out.println("Smallest number: "+min);
		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		Double min2 = findMin(arr2);
		System.out.println("Smallest number: "+min);
	}

}
