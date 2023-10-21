package que3;
import java.util.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try(FileWriter f = new FileWriter("buff.txt");) {
			try(BufferedWriter bf = new BufferedWriter(f, 4)) {
				for(int i = 0 ; i < 4 ; i++) {
					System.out.println("Enter line: "+(i+1));
					String line = sc.nextLine();
					bf.write(line);
					bf.newLine();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		/*try(FileOutputStream fout = new FileOutputStream("buff.txt")) {
			try(BufferedOutputStream bout = new BufferedOutputStream(fout)) {
				try(DataOutputStream dout = new DataOutputStream(bout)) {
					for(int i = 0 ; i < 4 ; i++){
						System.out.println("Enter line "+(i+1));
						String line = sc.nextLine();
						dout.writeUTF("\n"+line);
					}
				} 
			} 
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		
		try(FileReader fr = new FileReader("buff.txt")) {
			try (BufferedReader br = new BufferedReader(fr,4)){
				System.out.println("File contents: ");
				for(int i = 0 ; i <= 4 ; i++) {
					System.out.println(br.readLine());
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		/*try(FileInputStream fin = new FileInputStream("buff.txt")) {
			try(BufferedInputStream bin = new BufferedInputStream(fin)) {
				try(DataInputStream din = new DataInputStream(bin)){
					for(int i = 0 ; i <= 4 ; i++) {
						System.out.println(din.readLine());
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}*/
	}

}
