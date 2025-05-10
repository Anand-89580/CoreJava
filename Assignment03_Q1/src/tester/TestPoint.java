package tester;

import com.app.geometry.Point2D;

public class TestPoint {
	public static void main(String[] args) {
		Point2D p1 =new Point2D(2,3);
		Point2D p2=new Point2D(5,7);
		p1.getDetails();
		p2.getDetails();

		if(p1.equals(p2)) {
			System.out.println(" p1 & p2 are located at the same position");
		}else {
			
		double ans = p1.calculateDistance(p2);
			System.out.println("Distance = " +ans);
		}
	}
}
