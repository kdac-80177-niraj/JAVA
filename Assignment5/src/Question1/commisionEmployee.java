package Question1;
import java.util.*;
public class commisionEmployee extends Employee {
	private double grossSales;
	private double commisionRate;
	private double totalCommisionSalary;
	private double totalSalary;
	public double getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}
	Scanner sc = new Scanner(System.in);
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommisionRate() {
		return commisionRate;
	}
	public void setCommisionRate(double commisionRate) {
		this.commisionRate = commisionRate;
	}
	public double getTotalCommisionSalary() {
		return totalCommisionSalary;
	}
	public void setTotalCommisionSalary(double totalCommisionSalary) {
		this.totalCommisionSalary = totalCommisionSalary;
	}
	public commisionEmployee(String firstName, String lastName, int SSN, double grossSales, double commisionRate,
			double totalCommisionSalary,double totalSalary) {
		super(firstName, lastName, SSN);
		this.grossSales = grossSales;
		this.commisionRate = commisionRate;
		this.totalCommisionSalary = totalCommisionSalary;
		this.totalSalary = totalSalary;
	}
	public commisionEmployee() {
		
	}
	public void acceptData() {
		super.acceptData();
		System.out.println("Enter gross-sales: ");
		this.grossSales = sc.nextDouble();
		System.out.println("Enter commision rate: ");
		this.commisionRate = sc.nextDouble();
	}
	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		this.totalSalary = this.commisionRate*this.grossSales;	
	}
	public void displayData() {
		super.displayData();
		System.out.println("Gross sales: "+this.grossSales);
		System.out.println("Commision rate: "+this.commisionRate);
		System.out.println("Commisioned Employee Total Salary: "+this.totalSalary);
	}
	
	
}
