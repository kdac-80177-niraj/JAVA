package Que2;
import java.util.*;
public class Employee {
	String fname;
	String lname;
	double salary;
	Scanner sc = new Scanner(System.in);
	public Employee() {
		this.fname = "";
		this.lname = "";
		this.salary = 100.0;
	}
	public Employee(String fname, String lname, double salary) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void acceptEmployee() {
		System.out.println("Enter first name: ");
		this.fname = sc.next();
		System.out.println("Enter last name: ");
		this.lname = sc.next();
		System.out.println("Enter salary: ");
		this.salary = sc.nextDouble();
		if(this.salary < 0) {
			this.salary = 0.0;
		}
	}
	public void incrementSalary() {
		double percent;
		double incSalary;
		System.out.println("Enter percentage you want to increase: ");
		percent = sc.nextInt();
		incSalary =this.salary + this.salary*(percent/100);
		System.out.println("increased salary is: "+incSalary);
	}
	public void display() {
		System.out.println("Employee name: "+this.fname +" "+  this.lname);
		System.out.println("Salary: "+this.salary);
	}
}
