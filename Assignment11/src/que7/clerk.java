package que1;
import java.util.*;
public class clerk implements Emp {
	private double salary;
	Scanner sc = new Scanner(System.in);
	public clerk() {
		super();
	}

	public clerk(double salary) {
		super();
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void accept() {
		System.out.println("Enter salary for clerk: ");
		this.salary = sc.nextDouble();
	}
	
	@Override
	public String toString() {
		return "clerk [salary=" + salary + "]";
	}

	@Override
	public double getSal() {
		// TODO Auto-generated method stub
		return this.salary;
	}

}
