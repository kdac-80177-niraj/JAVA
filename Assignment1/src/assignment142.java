import java.util.Scanner;

public class assignment142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows;
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();
		
		for(int i = 1 ; i <= rows ; i++) {
			for(int j = i ; j < rows ; j++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k <= 2*i-1 ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
        }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();

		}
	}
}
