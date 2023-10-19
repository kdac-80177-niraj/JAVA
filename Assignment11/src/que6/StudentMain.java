package que6;
import java.util.*;
import java.util.Map.Entry;
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Student> map = new HashMap<>();
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0. Exit.");
			System.out.println("1. Add.");
			System.out.println("2. Display.");
			System.out.println("3. Search.");
			System.out.println("4. Display roll.");
			System.out.println("5. Display only details.");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("Exiting.........");
				break;
			case 1:
				Student s = new Student();
				s.accept();
				map.put(s.getRoll(), s);
				break;
			case 2:
				Set<Entry<Integer,Student>> entries = map.entrySet();
				for (Entry<Integer, Student> entry : entries) {
					System.out.println(entry.getKey()+ " -- " +entry.getValue());
				}
				break;
			case 3:
				System.out.println("Enter roll to search: ");
				Integer key = sc.nextInt();
				Student S = map.get(key);
				if(S == null)
					System.out.println("Not Found");
				else
					System.out.println(S);
				break;
			case 4:
				Set<Integer> keys = map.keySet();
				System.out.println("Rolls: "+keys);
				break;
			case 5:
				Collection<Student> details = map.values();
				System.out.println("Details: "+details);
				break;
			default:
				System.out.println("Wrong choice....please try again...");
				break;
			}
		} while (choice != 0);
		System.out.println("Thank you for using");
	}
	//if duplicates added then overrides the
	//first details and then shows updated details.

}
