package que6;
import java.util.*;
public class Student {
	private int roll;
	private String name;
	private String city;
	Scanner sc = new Scanner(System.in);
	public Student() {
		super();
	}
	public Student(int roll, String name, String city) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void accept() {
		System.out.println("Enter Roll: ");
		this.roll = sc.nextInt();
		System.out.println("Enter Name: ");
		this.name = sc.next();
		System.out.println("Enter City: ");
		this.city = sc.next();
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
}
