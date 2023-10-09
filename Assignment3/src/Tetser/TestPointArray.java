package Tetser;
import com.app.geometry.*;
import java.util.*;
import java.util.Scanner;
import com.app.geometry.point2D;
import java.lang.Math;

public class TestPointArray {
	
	public static int menu() {
		int choice;
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Display details of specific points: ");
		System.out.println("2. Display all points: ");
		System.out.println("3. Calculate distance: ");
		System.out.println("4. Exit");
		System.out.println("Enter choice: ");
		choice = scan.nextInt();
		return choice;
	}

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		int size;
		System.out.println("how many no of points to plot: ");
		size = sc1.nextInt();
		point2D arr1[] = new point2D[size];
		
		System.out.println("Enter the codinate x");
		for(int i = 0 ; i < size ; i++) 
		{
			System.out.println("Enter co-ordinates of "+i+" index");
			System.out.println("Enter x: ");
			int x = sc1.nextInt();
			System.out.println("Enter y: ");
			int y = sc1.nextInt();
			arr1[i] = new point2D(x,y);
		}
		
		int choice;
		while((choice = menu())!=4) {
			switch(choice) {
			case 1: 
				int index;
				System.out.println("Enter index you want search: ");
				index = sc1.nextInt();
				if(index < size) {
					arr1[index].getDetails();
				}else {
					System.out.println("index not found");
				}
				break;
			case 2: 
				for(point2D arr2:arr1) {
					arr2.getDetails();
				}
				break;
			case 3:
				int find1,find2;
				System.out.println("Enter index 1 for points: ");
				find1 = sc1.nextInt();
				System.out.println("Enter index 2 for points: ");
				find2 = sc1.nextInt();
				if(find1<size && find2 < size) {
					if(arr1[find1].getX() == arr1[find2].getX() && arr1[find1].getY() == arr1[find2].getY()) {
						System.out.println("Co-ordinates are equal");
					}else {
						int distX,distY;
						double dist;
						distX = arr1[find2].getX()-arr1[find1].getX();
						distY = arr1[find2].getY()-arr1[find1].getY();
						dist = Math.sqrt(Math.pow(distX,2)+Math.pow(distY, 2));
						System.out.println("Distance between points is: "+dist);
					}
				}
			case 4:
				System.out.println("Exiting......");
				break;
			default:
				System.out.println("Wrong choice");
				break;
				
			}
		}
	}

}
