package exceptq2;

public class Main {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub

		try {
			Circle c1 =new Circle();
			
			c1.setMyX(1);
			c1.setMyY(2);
			c1.setMyDiameter(0);
			System.out.println(c1);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
