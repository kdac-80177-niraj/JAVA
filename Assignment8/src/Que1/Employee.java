package Que1;
import java.util.*;
public class Employee extends person{
	private int empid;
	private int esalary; 
	Scanner sc = new Scanner(System.in);
	public Employee(String ename, String eaddress) {
		super(ename, eaddress);
		this.empid = 0;
		this.esalary = 500;
	}
	public Employee(String ename, String eaddress, int empid, int esalary) {
		super(ename, eaddress);
		this.empid = empid;
		this.esalary = esalary;
	}
	public Employee() {
		
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getEsalary() {
		return esalary*12;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	public int totalSalary() {
		this.esalary *= 12;
		System.out.println("Total salary is: "+this.esalary);
		return this.esalary;
	}
	public void accept() {
		System.out.println("Enter id: ");
		this.empid = sc.nextInt();
		System.out.println("Enter salary: ");
		this.esalary = sc.nextInt();
	}
	public void display() {
		System.out.println("Id: "+this.empid);
		System.out.println("Salary: "+this.esalary);
	}
}
