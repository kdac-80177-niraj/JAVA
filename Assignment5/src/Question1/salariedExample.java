package Question1;
import java.util.*;
public class salariedExample extends Employee {
	Scanner sc = new Scanner(System.in);
	private double weeklySalary;

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public salariedExample() {
		
	}
	public salariedExample(String firstName, String lastName, int SSN, double weeklySalary) {
		super(firstName, lastName, SSN);
		this.weeklySalary = weeklySalary;
	}
	public void acceptData() {
		super.acceptData();
		System.out.println("Enter Employee Weekly Salary: ");
		this.weeklySalary = sc.nextDouble();	
	}
	public void calculateSalary() {
		System.out.println("Employee weekly salay is: "+this.weeklySalary);
	}
	public void displayData() {
		super.displayData();
		System.out.println("Employee weekly salary is: "+this.weeklySalary);
	}
}
