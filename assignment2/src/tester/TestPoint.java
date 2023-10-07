package tester;
import com.app.geometrty.*;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D();
		System.out.println("Enter co-ordinates of first point");
		p1.accept();
		String point1 = p1.getDetails();
		System.out.println("Point 1 co-ordinaates: "+point1);
		System.out.println("Enter co-ordinates of second point");
		p2.accept();
		String point2 = p1.getDetails();
		System.out.println("Point 1 co-ordinaates: "+point2);
		if(p1.isEqual(p1, p2)) {
			System.out.println("Co-ordinates are equal.");
			p1.getDetails();
			p2.getDetails();
		}else {
			System.out.println("Co-ordinates are not equal.");
			p1.addDistance(p1, p2);
		}
	}

}
