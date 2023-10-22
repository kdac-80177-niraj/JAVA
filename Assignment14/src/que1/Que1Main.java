package que1;
import java.util.*;
import java.sql.SQLException;

public class Que1Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("0. Exit.");
			System.out.println("1. Add User.");
			System.out.println("2. Update User.");
			System.out.println("3. Party-Wise votes.");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				System.out.println("Exiting............");
				break;
			case 1:
				Canddidate c = new Canddidate();
				try(CandidateDao cd = new CandidateDao()){
					c.accept();
					int count = cd.AddCandidate(c);
					System.out.println("Rows added: "+count);
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
			case 2:
				Canddidate c1 = new Canddidate();
				try(CandidateDao cd = new CandidateDao()){
					System.out.println("Enter id to update: ");
					int id = sc.nextInt();
					c1.accept();
					int count = cd.updateCandidate(c1, id);
					System.out.println("Rows updated: "+count);
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					CandidateDao cd = new CandidateDao();
					List<PartyVotes> list = cd.partyWiseVotes();
					System.out.println("Completed1");
					list.forEach(a->System.out.println(a));
				} catch (Exception e) {
					// TODO: handle exception
				}
				break;
			default:
				System.out.println("Wrong choice.....");
				break;
			}
		} while (choice != 0);
		

	}

}
