package que1;
import java.util.*;

public class Manager implements Emp {
	private double basicSalary;
	private double dearanceAllowance;
	Scanner sc = new Scanner(System.in);
	public Manager() {
		super();
	}

	public Manager(double basicSalary, double dearanceAllowance) {
		super();
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getDearanceAllowance() {
		return dearanceAllowance;
	}

	public void setDearanceAllowance(double dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}
	public void accept() {
		System.out.println("Enter basic salary: ");
		this.basicSalary = sc.nextDouble();
		System.out.println("Enter dearance allowance: ");
		this.dearanceAllowance = sc.nextDouble();
	}
	
	public String toString() {
		return "Manager [basicSalary=" + basicSalary + ", dearanceAllowance=" + dearanceAllowance + "]";
	}

	@Override
	public double getSal() {
	// TODO Auto-generated method stub
	return basicSalary+dearanceAllowance;
	}

	@Override
	public double calcIncentives() {
		// TODO Auto-generated method stub
		double totalSalary = 0.20*basicSalary;
		return totalSalary;
	}

}
