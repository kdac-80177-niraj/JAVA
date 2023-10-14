package Que2;
import java.util.*;
public class Circle {
	private int x1,y1,x2,y2,diameter;
	Scanner sc = new Scanner(System.in);
	
	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public Circle(int x1, int y1, int x2, int y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public Circle() {
		this.x1 = 0;
		this.x2 = 0;
		this.y1 = 0;
		this.y2 = 0;
	}
	public void accept() throws DiameterNegativeError{
		System.out.println("center for 1st circle: ");
		System.out.println("Enter x1: ");
		this.x1 = sc.nextInt();
		System.out.println("Enter y1: ");
		this.y1 = sc.nextInt();
		System.out.println("center for 2nd circle: ");
		System.out.println("Enter x2: ");
		this.x2 = sc.nextInt();
		System.out.println("Enter y2: ");
		this.y2 = sc.nextInt();
		System.out.println("Enter diameter: ");
		this.diameter = sc.nextInt();
		if(this.diameter < 0)
			throw new DiameterNegativeError("diameter cannot be negative");
	}

	@Override
	public String toString() {
		return "Circle [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + ", diameter=" + diameter + ", sc=" + sc
				+ "]";
	}

	
	
	
}
