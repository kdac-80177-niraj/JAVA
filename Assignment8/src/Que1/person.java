package Que1;
import java.util.*;
abstract public class person {
	Scanner sc = new Scanner(System.in);
	private String ename;
	private String eaddress;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public person(String ename, String eaddress) {
		super();
		this.ename = ename;
		this.eaddress = eaddress;
	}
	public person() {
		super();
		this.ename = "";
		this.eaddress = "";
	}
	
	abstract public int totalSalary();
	public void accept() {
		System.out.println("Enter name: ");
		this.ename = sc.next();
		System.out.println("Enter city: ");
		this.eaddress = sc.next();
	}
	public void display() {
		System.out.println("Name: "+this.ename);
		System.out.println("City: "+this.eaddress);
	}
}
