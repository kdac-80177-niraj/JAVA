package Que2;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		try {
			c.accept();
			System.out.println(c.toString());
		} catch (DiameterNegativeError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
