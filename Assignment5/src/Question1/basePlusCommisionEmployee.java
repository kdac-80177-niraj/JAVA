package Question1;
import java.util.*;
public class basePlusCommisionEmployee extends Employee{
	Scanner sc = new Scanner(System.in);
	private double grossSales;
	private double commisionRate;
	private double baseSalary;
	private double totalSalary;

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

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}
	public basePlusCommisionEmployee() {
	}

	public basePlusCommisionEmployee(String firstName, String lastName, int SSN, double grossSales,
			double commisionRate, double baseSalary, double totalSalary) {
		super(firstName, lastName, SSN);
		this.grossSales = grossSales;
		this.commisionRate = commisionRate;
		this.baseSalary = baseSalary;
		this.totalSalary = totalSalary;
	}
	public void acceptData() {
		super.acceptData();
		System.out.println("Enter gross-sales: ");
		this.grossSales = sc.nextDouble();
		System.out.println("Enter commision rate: ");
		this.commisionRate = sc.nextDouble();
		System.out.println("Enter base salary: ");
		this.baseSalary = sc.nextDouble();
	}
	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		this.totalSalary = this.baseSalary+(this.grossSales*this.commisionRate);
	}
	public void displayData() {
		super.displayData();
		System.out.println("Gross sales: "+this.grossSales);
		System.out.println("Commision rate: "+this.commisionRate);
		System.out.println("Base salary: "+this.baseSalary);
		System.out.println("Commisioned Employee Total Salary: "+this.totalSalary);
	}
	
}

