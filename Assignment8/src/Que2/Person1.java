package Que2;

import java.util.Scanner;

public class Person1 implements Displayable {

	private String Name;
	private int age;
	Scanner sc = new Scanner(System.in);
	public Person1()
	{
		this.Name = "";
		this.age =0;
	}
	
	
	public Person1(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person1(String Name)
	{
		this.Name = Name;
	}
	void setName(String name)
	{
		this.Name = name;
	}
	String getName()
	{
		System.out.println("Enter Name = ");
		this.Name = sc.nextLine();
		return this.Name;
	}

	public Person1(int age) {
		super();
		this.age = age;
	}

	public void acceptPerson()
	{
		System.out.println("Enter Name = ");
		this.Name = sc.next();
	}
	public void displayData() {
		System.out.println("Name = "+this.Name);
		System.out.println("Age = "+this.age);
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + "]";
	}
	
}
