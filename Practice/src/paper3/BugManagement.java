package paper3;

import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.*;
public class BugManagement {
	public static Date parseDate(String str) {
		Date d = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			d = sdf.parse(str);
		} catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return d;
	}
	public static String toStringDate(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String s = sdf.format(d);
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Bug>list1 = new ArrayList<>();
		List<Member>list2 = new ArrayList<>();
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Add a new bug -- with current system time.");
			System.out.println("2. Update given bug status to 'closed' -- also change modified time to the current system time.");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				System.out.println("Terminated.........");
				break;
			case 1:
				System.out.println("Enter bug title: ");
				String title = sc.next();
				System.out.println("Enter bug description: ");
				String description = sc.nextLine();
				sc.nextLine();
				System.out.println("Enter bug Status: ");
				String status = sc.next();
				System.out.println("Enter member id bug assigned to: ");
				int assignedTo = sc.nextInt();
				System.out.println("Enter created time(yyyy-MM-dd): ");
				String created = sc.next();
				//Date createdDate = parseDate(created);
				System.out.println("Enter modified time: ");
				String modified = sc.next();
				//Date modifiedDate = parseDate(modified);
				Bug b = new Bug(title,description,status,assignedTo,created,modified);
				list1.add(b);
				System.out.println("Bug Added Succesfully.\n");
				try(BugDAO bd = new BugDAO()) {
					int cnt = bd.addBug(b);
					System.out.println("Rows Added: "+cnt);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
			case 2:
				break;
			}
		} while (choice != 0);
	}

}
