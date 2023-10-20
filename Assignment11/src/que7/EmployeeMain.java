package que1;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp[] arr = new Emp[3];
		arr[0] = new Manager(2000.50,300.80);
		arr[1] = new Labor(350,40);
		arr[2] = new clerk(50000);
		
		double total = Emp.calcTotalIncome(arr);
		System.out.println("Total Income: "+total);

	}

}
