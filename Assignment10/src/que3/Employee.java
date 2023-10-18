package que3;
import java.util.*;
public class Employee {
	private String name;
	private int id;
	private double salary;
	Scanner sc = new Scanner(System.in);
	public Employee() {
		super();
	}
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void accept() {
		System.out.println("Enter name: ");
		this.name = sc.next();
		System.out.println("Enter id: ");
		this.id = sc.nextInt();
		System.out.println("Enter salary: ");
		this.salary = sc.nextDouble();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e = (Employee)obj;
		int diff = this.getId() - e.getId();
		if(diff == 0)
			return true;
		else
			return false;
	}
	
}
