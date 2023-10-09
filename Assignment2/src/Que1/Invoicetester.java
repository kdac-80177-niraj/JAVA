package Que1;
import java.util.Scanner;

public class Invoicetester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Invoice in = new Invoice();
		in.accept();
		in.display();
		in.calculateBill();
	}

}