package que1;
import java.util.*;

public class Labor implements Emp{
	private int hour,rate;
	Scanner sc = new Scanner(System.in);
	public Labor() {
		super();
	}
	
	public Labor(int hour, int rate) {
		super();
		this.hour = hour;
		this.rate = rate;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	public void accept() {
		System.out.println("Enter Hour: ");
		this.hour = sc.nextInt();
		System.out.println("Enter rate: ");
		this.rate = sc.nextInt();
	}

	@Override
	public double getSal() {
	// TODO Auto-generated method stub
		int totalSal = this.hour*this.rate;
		return totalSal;
	}

	@Override
	public double calcIncentives() {
		// TODO Auto-generated method stub
		if(this.hour>300)
			return 0.05*this.hour*this.rate + this.hour*this.rate;
		else 
			return this.hour*this.rate;	
	}
	
	

}
