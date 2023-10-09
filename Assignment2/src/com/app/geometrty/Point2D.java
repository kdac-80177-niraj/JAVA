package com.app.geometrty;
import java.util.*;
import java.lang.Math;
public class Point2D {
	int x,y;
	Scanner sc = new Scanner(System.in);
	public Point2D() {
		
	}
	public Point2D(int x, int y) {
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
	public String getDetails() {
		return "(" + x + ", " + y + ")";
	}
	public Boolean isEqual(Point2D p1,Point2D p2) {
		if(p1.x == p2.x && p1.y == p2.y)
			return true;
		else
			return false;
	}
	public void addDistance(Point2D p1,Point2D p2) {
		double distX,distY,distance;
		distX = p2.x - p1.x;
		distY = p2.y - p1.y;
		distance = Math.sqrt(Math.pow(distX,2)+Math.pow(distY, 2));
		System.out.println("Distance between points is: "+distance);
		
	}
	
	
}
