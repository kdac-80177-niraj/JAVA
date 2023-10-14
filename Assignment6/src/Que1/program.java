package Que1;
import java.util.*;
public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter About Yourself in 80 Words: ");
			line = sc.nextLine();
			if(line.length() > 80)
				throw new ExceptionLineTooLong("You can only enter 80 characters");
		}catch(ExceptionLineTooLong e) {
			e.printStackTrace();
		}finally {
			sc.close();
			System.out.println("Resources closed");
		}

	}

}
