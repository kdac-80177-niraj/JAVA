package Que3;
import java.util.*;

public class dailyDriving {
	int milesPerDay;
	int costPerGallon;
	int avgPerGallon;
	int parkingFee;
	int tollPerDay;
	
	public dailyDriving() {}
	Scanner sc = new Scanner(System.in);
	public dailyDriving(int milesPerDay, int costPerGallon, int avgPerGallon, int parkingFee, int tollPerDay) {
		super();
		this.milesPerDay = milesPerDay;
		this.costPerGallon = costPerGallon;
		this.avgPerGallon = avgPerGallon;
		this.parkingFee = parkingFee;
		this.tollPerDay = tollPerDay;
	}
	public int getMilesPerDay() {
		return milesPerDay;
	}
	public void setMilesPerDay(int milesPerDay) {
		this.milesPerDay = milesPerDay;
	}
	public int getCostPerGallon() {
		return costPerGallon;
	}
	public void setCostPerGallon(int costPerGallon) {
		this.costPerGallon = costPerGallon;
	}
	public int getAvgPerGallon() {
		return avgPerGallon;
	}
	public void setAvgPerGallon(int avgPerGallon) {
		this.avgPerGallon = avgPerGallon;
	}
	public int getParkingFee() {
		return parkingFee;
	}
	public void setParkingFee(int parkingFee) {
		this.parkingFee = parkingFee;
	}
	public int getTollPerDay() {
		return tollPerDay;
	}
	public void setTollPerDay(int tollPerDay) {
		this.tollPerDay = tollPerDay;
	}
	
	public void accept() {
		System.out.println("Enter total km travelled today: ");
		this.milesPerDay = sc.nextInt();
		System.out.println("Enter cost per gallon: ");
		this.costPerGallon = sc.nextInt();
		System.out.println("Enter Average miles per gallon: ");
		this.avgPerGallon = sc.nextInt();
		System.out.println("Enter parking fees: ");
		this.parkingFee = sc.nextInt();
		System.out.println("Enter tolls per day: ");
		this.tollPerDay = sc.nextInt();
	}
	public void Calculate() {
		int totalCost = 0;
		totalCost = this.parkingFee + this.tollPerDay + (this.milesPerDay/this.avgPerGallon)*this.costPerGallon;
		System.out.println("Total cost without car pooling: "+totalCost);
		int carPool = 0;
		int numberPeople;
		System.out.println("Enter total number of peoples: ");
		numberPeople = sc.nextInt();
		carPool = (this.parkingFee + this.tollPerDay + (this.milesPerDay/this.avgPerGallon)*this.costPerGallon)/numberPeople;
		System.out.println("Total cost with car pooling: "+carPool);
		System.out.println("You can save $ "+(totalCost-carPool)+" by using car pool");
	}
	
	
}
