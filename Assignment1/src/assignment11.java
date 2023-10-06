import java.util.Scanner;

public class assignment11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.println("Enter a number: ");
		num1 = sc.nextInt();
		System.out.println("Given number: " + num1);
		System.out.println("Binary Equivalent: " + Integer.toBinaryString(num1));
		System.out.println("Octal Equivalent: " + Integer.toOctalString(num1));
		System.out.println("Hexadecimal Equivalent: " + Integer.toHexString(num1));
		sc.close();
	}
}
