package Question1;
import java.util.*;
public class hourlyEmployee extends Employee {

	private int hourlyWage;
	private int hoursWorked;
	private double totalSalary;
	
	public double getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(int totalSalary) {
		this.totalSalary = totalSalary;
	}
	Scanner sc = new Scanner(System.in);
	
	public int getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public hourlyEmployee(String firstName, String lastName, int SSN, int hourlyWage, int hoursWorked,double totalSalary) {
		super(firstName, lastName, SSN);
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
		this.totalSalary = totalSalary;
	}
	public hourlyEmployee() {
		
	}
	public void acceptData() {
		super.acceptData();
		System.out.println("Enter hourly wages: ");
		this.hourlyWage = sc.nextInt();
		System.out.println("Enter total hours worked: ");
		this.hoursWorked = sc.nextInt();
	}
	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		if(this.hoursWorked <= 40) {
			this.totalSalary = this.hourlyWage*this.hoursWorked;
		}else if (this.hoursWorked>40){
			this.totalSalary = 40*this.hourlyWage+(this.hoursWorked-40)*this.hourlyWage*1.5;
		}
		
	}
	public void displayData() {
		super.displayData();
		System.out.println("Hourly wages: "+this.hourlyWage);
		System.out.println("Total hours worked: "+this.hoursWorked);
		System.out.println("Hourly Employee Salary is: "+this.totalSalary);
	}
	
}
