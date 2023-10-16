package Que1;
import java.util.*;
public class Manager extends Employee {
	private int bonus;
	Scanner sc = new Scanner(System.in);
	
	public Manager() {
		super();
	}

	public Manager(int bonus) {
		super();
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public void accept() {
		super.accept();
		System.out.println("Enter bonus: ");
		this.bonus = sc.nextInt();
	}
	public void display() {
		super.display();
		System.out.println("Bonus: "+this.bonus);
	}
	public int totalSalary() {
		int sal = super.getEsalary();
		int managerSal = this.bonus + sal;
		System.out.println("Total salary is: "+managerSal);
		return managerSal;
	}
	
	
}
