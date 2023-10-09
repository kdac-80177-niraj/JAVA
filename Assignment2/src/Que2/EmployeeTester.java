package Que2;
import java.util.*;
public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee emp1 = new Employee();
		emp1.acceptEmployee();
		emp1.display();
		Employee emp2 = new Employee();
		emp2.acceptEmployee();
		emp2.display();
		emp2.incrementSalary();

	}

}
