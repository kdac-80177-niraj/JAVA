package Que2;

import java.util.*;

public class Date implements Displayable {
	int day;
	int month;
	int year;
	Scanner sc = new Scanner(System.in);
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date()
	{
		this.day=0;
		this.month=0;
		this.year=0;
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


	public void acceptData() {
		System.out.println("Enter Day = ");
		this.day = sc.nextInt();
		System.out.println("Enter Month = ");
		this.month = sc.nextInt();
		System.out.println("Enter Year = ");
		this.year = sc.nextInt();
	}
	
	@Override
	public void displayData() 
	{
		System.out.println("Day = "+this.day );
		System.out.println("Month = "+this.month );
		System.out.println("Year = "+this.year );
		
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
	
}
