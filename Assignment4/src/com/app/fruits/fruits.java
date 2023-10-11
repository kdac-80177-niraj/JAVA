package com.app.fruits;
import java.util.*;
public class fruits {
		Scanner sc = new Scanner(System.in);
		String color;
		double weight;
		String name;
		Boolean isFresh;
		public fruits() {
		
		}
		public fruits(String name, Boolean isFresh) {
			super();
			this.name = name;
			this.isFresh = isFresh;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Boolean getIsFresh() {
			return isFresh;
		}
		public void setIsFresh(Boolean isFresh) {
			this.isFresh = isFresh;
		}
		
		public void acceptData() {
			System.out.println("Enter fruit color: ");
			this.color = sc.next();
			System.out.println("Enter fruit weight: ");
			this.weight = sc.nextDouble();
		}
		
		@Override
		public String toString() {
			return "fruits name=" + name + ", weight=" + weight + ", color=" + color + ", isFresh=" + isFresh ;
		}
		public String taste() {
			return "no specific tase";
		}
}


