package que3;
import java.util.*;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Employee> LL = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("0.Exit.");
			System.out.println("1. Add");
			System.out.println("2. Delete");
			System.out.println("3. Find");
			System.out.println("4. Sort");
			System.out.println("5. Edit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				Employee e = new Employee();
				e.accept();
				LL.add(e);
				break;
			case 2:
				System.out.println("Enter id to delete: ");
				int id = sc.nextInt();
				Employee key = new Employee();
				key.setId(id);
				if(LL.contains(key)) {
					int index = LL.indexOf(key);
					LL.remove(index);
				}
				break;
			case 3:
				System.out.println("Enter id to find: ");
				int id1 = sc.nextInt();
				Employee key1 = new Employee();
				key1.setId(id1);
				if(LL.contains(key1)) {
					int index = LL.indexOf(key1);
					System.out.println(LL.get(index));
				}
				break;
			case 4:
				class LinkedListComparator implements Comparator<Employee>{

					@Override
					public int compare(Employee e1, Employee e2) {
						// TODO Auto-generated method stub
						int diff = -(e1.getId() - e2.getId());
						return diff;
					}
					
				}
				LinkedListComparator llComp = new LinkedListComparator();
				LL.sort(llComp);
				
				System.out.println("After Sorting by id: ");
				for (Employee employee : LL) {
					System.out.println(employee);
				}
				break;
			case 5:
				System.out.println("Enter id to be modified: ");
				int id2 = sc.nextInt();
				Employee key3 = new Employee();
				key3.setId(id2);
				int index = LL.indexOf(key3);
				if(index == -1) {
					System.out.println("Employee not found");
				}else {
					Employee oldEmp = LL.get(index);
					System.out.println("Employee found: "+oldEmp);
					System.out.println("Enter new Employee information: ");
					Employee newEmp = new Employee();
					newEmp.accept();
					LL.set(index, newEmp);
					
				}
				
			}
		}while(choice != 0);
	}

}
