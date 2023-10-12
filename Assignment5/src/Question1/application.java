package Question1;

public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new salariedExample();
		e1.acceptData();
		e1.calculateSalary();
		e1.displayData();
		
		Employee e2 = new hourlyEmployee();
		e2.acceptData();
		e2.calculateSalary();
		e2.displayData();
		
		Employee e3 = new commisionEmployee();
		e3.acceptData();
		e3.calculateSalary();
		e3.displayData();
		
		Employee e4 = new basePlusCommisionEmployee();
		e4.acceptData();
		e4.calculateSalary();
		e4.displayData();

	}

}
