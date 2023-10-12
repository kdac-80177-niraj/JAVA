package Question1;
import java.util.Scanner;
abstract public class Employee {
	private String firstName;
	private String lastName;
	private int SSN;
	public Employee(String firstName, String lastName, int SSN) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
	}
	
	public Employee() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}
	Scanner sc = new Scanner(System.in);
	public void acceptData() {
		System.out.println("Enter first name: ");
		this.firstName = sc.next();
		System.out.println("Enter last name: ");
		this.lastName = sc.next();
		System.out.println("Enter SSN: ");
		this.SSN = sc.nextInt();
	}
	public void displayData() {
		System.out.println("Employee First Name: "+this.firstName);
		System.out.println("Employee Last Name: "+this.lastName);
		System.out.println("Employee SSN: "+this.SSN);
	}
	abstract public void calculateSalary();
	
}
