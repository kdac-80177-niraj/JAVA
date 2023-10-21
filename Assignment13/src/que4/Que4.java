package que4;

import java.io.BufferedReader;
import java.io.FileReader;

public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
