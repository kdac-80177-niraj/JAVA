package paper2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

public class ProjectMain {

	public static Date parseDate(String str) {
		Date d = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			d = sdf.parse(str);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		return d;
	}
	
	public static String toSting(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String s = sdf.format(d);
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Projects>set = new HashSet<>();
		List<Projects> list = new ArrayList<Projects>();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("1. Add New Project.");
			System.out.println("2. Display All Projects.");
			System.out.println("3. Delete Project By ID.");
			System.out.println("4. Copy All Projects From Set To ArrayList.");
			System.out.println("5. Display All Projects From List.");
			System.out.println("6. Sort Project by Start Date and Display.");
			System.out.println("7. Find project with Max team size using Collections.max()");
			System.out.println("8. Count all Projects of \"Java\" technology using Stream API");
			System.out.println("9.  Find total number of people for all projects using Stream API.");
			System.out.println("10. Store into a file.");
			System.out.println("11. Read from file.");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 0: 
				System.out.println("Terminated.........");
			case 1:
				System.out.println("Enter Project ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Project Title: ");
				String title = sc.nextLine();
				System.out.println("Enter Team Size: ");
				int size = sc.nextInt();
				System.out.println("Enter Start Date(yyyy-MM-dd): ");
				String startDate = sc.next();
				Date utilDate = parseDate(startDate);
				System.out.println("Enter technology.");
				String technology = sc.next();
				set.add(new Projects(id,title,size,utilDate,technology));
				System.out.println("New project details added.");
				break;
			case 2:
				for (Projects p : set) {
					System.out.println(p);
				}
				break;
			case 3:
				System.out.println("Enter Project Id to delete: ");
				int id1 = sc.nextInt();
				Projects p = new Projects();
				p.setId(id1);
				if(set.contains(p)) {
					set.remove(p);
				}else {
					System.out.println("Id not found");
				}
				break;
			case 4:
				for (Projects projects : set) {
					list.add(projects);
				}
				break;
			case 5:
				for (Projects projects : list) {
					System.out.println(projects);
				}
				break;
			case 6:
				class DateComparator implements Comparator<Projects>{

					@Override
					public int compare(Projects p1, Projects p2) {
						// TODO Auto-generated method stub
						int diff = p1.getStartDate().compareTo(p2.getStartDate());
						return diff;
					}
					
				}
				DateComparator dc = new DateComparator();
				list.sort(dc);
				for (Projects projects : list) {
					System.out.println(projects);
				}
				break;
			case 7:
				Projects maxTeam = Collections.max(set, (p1,p2)->Integer.compare(p1.getTeamSize(), p2.getTeamSize()));
				System.out.println("Team with maximum team size: "+maxTeam.toString());
				break;
			case 8:
				Stream<Projects> strm = list.stream();
				strm
				.filter(p1 -> p1.getTechnology().equals("java"))
				.count();
				
				System.out.println("Number of java projects: "+strm);
				break;
			case 9:
				int totalPeoples = set.stream()
					.mapToInt(Projects::getTeamSize)
					.sum();
				System.out.println("Total peoples: "+totalPeoples);
				break;
			case 10:
				try(FileOutputStream fout = new FileOutputStream("Projects.txt")) {
					try(ObjectOutputStream oout = new ObjectOutputStream(fout)){
						oout.writeObject(list);
					}
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
			case 11:
				List<Projects> pro = new ArrayList<>();
				try(FileInputStream fin = new FileInputStream("Projects.txt")) {
					try(ObjectInputStream oin = new ObjectInputStream(fin)){
						pro = (List<Projects>) oin.readObject();
						System.out.println(pro);
					}
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;
			default:
				System.out.println("Wrong choice");
			}
		} while (choice != 0);
	}

}
