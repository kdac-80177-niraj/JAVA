import java.util.Scanner;

public class assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1: ");
		num1 = sc.nextDouble();
		System.out.println("Enter num2: ");
		num2 = sc.nextDouble();
		System.out.println("Accepted num1: " + num1);
		System.out.println("Accepted num2: " + num2);
		double average = (num1 + num2) / 2;
		System.out.println(average);

	}
}
