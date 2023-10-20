package que3;
import java.util.*;
import java.util.function.BinaryOperator;

interface Arithmatic {
	double calc(double a,double b);
}

public class Que3Main{
	static void calculate(double num1,double num2,Arithmatic op){
		double result = op.calc(num1,num2);
		System.out.println("Result: "+result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x,y;
		int choice;
		do {
			System.out.println("0. Exit.");
			System.out.println("1. Add.");
			System.out.println("2. Multiply.");
			System.out.println("3. Divide.");
			System.out.println("2. Substract.");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter num1: ");
				x = sc.nextDouble();
				System.out.println("Enter num2: ");
				y = sc.nextDouble();
				calculate(x,y,(a,b)->a+b);
				break;
			case 2:
				System.out.println("Enter num1: ");
				x = sc.nextDouble();
				System.out.println("Enter num2: ");
				y = sc.nextDouble();
				calculate(x,y,(a,b)->a*b);
				break;
			case 3:
				System.out.println("Enter num1: ");
				x = sc.nextDouble();
				System.out.println("Enter num2: ");
				y = sc.nextDouble();
				calculate(x,y,(a,b)->a/b);
				break;
			case 4:
				System.out.println("Enter num1: ");
				x = sc.nextDouble();
				System.out.println("Enter num2: ");
				y = sc.nextDouble();
				calculate(x,y,(a,b)->a-b);
				break;
			}
			
		} while (choice != 0);
		System.out.println("Thank you for using");

	}

}
