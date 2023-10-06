import java.util.Scanner;

public class assignment141 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter size: ");
		size = sc.nextInt();
		
		 for(int i = size ; i > 0 ; i--) { 
			 for(int j = 1 ; j < i ; j++) {
				 System.out.print(" "); 
				 } 
			 for(int k = i-1 ; k < size ; k++) {
				 System.out.print(" *"); 
				 } 
			 System.out.println(); } 
	}
}
