package Que3;
import java.util.*;
public class Date {
	int day,month,year;
	Scanner sc = new Scanner(System.in);
	public Date() {
		
	}
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void accept() {
		System.out.println("Enter day: ");
		day = sc.nextInt();
		System.out.println("Enter month: ");
		month = sc.nextInt();
		System.out.println("Enter year: ");
		year = sc.nextInt();
	}
	public void display() {
		System.out.println("Today is: "+this.day+"/"+this.month+"/"+this.year);
	}
	
}
