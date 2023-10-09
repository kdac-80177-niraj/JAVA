package com.app.geometry;
import java.util.*;
import java.lang.Math;
public class point2D {
	int x,y;
	Scanner sc = new Scanner(System.in);
	public point2D() {
		this.x = 1;
		this.y = 1;
		
	}
	public point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void accept() {
		System.out.println("Enter x co-ordinate: ");
		this.x = sc.nextInt();
		System.out.println("Enter y co-ordinate: ");
		this.y = sc.nextInt();
	}
	public void getDetails() {
		System.out.println("x: "+this.x+" y: "+this.y);
		//return "(" + x + ", " + y + ")";
	}
	public Boolean isEqual(point2D p1,point2D p2) {
		if(p1.x == p2.x && p1.y == p2.y)
			return true;
		else
			return false;
	}
	public void addDistance(point2D p1,point2D p2) {
		double distX,distY,distance;
		distX = p2.x - p1.x;
		distY = p2.y - p1.y;
		distance = Math.sqrt(Math.pow(distX,2)+Math.pow(distY, 2));
		System.out.println("Distance between points is: "+distance);
		
	}
	
	
}
