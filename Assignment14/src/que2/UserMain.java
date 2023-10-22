package que2;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("0. Exit.");
			System.out.println("1. Create user.");
			System.out.println("2. Read user.");
			System.out.println("3. Update user.");
			System.out.println("4. Delete user.");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice){
				case 0:
					System.out.println("Exiting.....");
					break;
				case 1:
					User u = new User();
					try(UserDao ud = new UserDao()){
						u.accept();
						int count = ud.addUser(u);
						System.out.println("Rows affected: "+count);
					}catch(Exception e){
						e.printStackTrace();
					}
					break;
				case 2:
					System.out.println("***************************Users table***************************");
					try(UserDao ud = new UserDao()){
						ud.readUser();
					}catch(Exception e) {
						e.printStackTrace();
					}
					System.out.println("***************************************************************");
					break;
				case 3:
					System.out.println("Enter id to update: ");
					int id = sc.nextInt();
					User u1 = new User();
					try(UserDao ud = new UserDao()) {
						u1.accept();
						int count = ud.updateUser(u1, id);
						System.out.println("Rows updated: "+count);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					break;
				case 4:
					System.out.println("Enter id to delete: ");
					int id1 = sc.nextInt();
					try(UserDao ud = new UserDao()){
						ud.deleteUser(id1);
					}catch(Exception e) {
						e.printStackTrace();
					}
			}
		} while (choice != 0);
	}

}
