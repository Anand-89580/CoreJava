package exceptionq1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  in = new Scanner(System.in);
		try {
			CheckMessage c1 = new CheckMessage();
			
			System.out.print("Enter The user value here : ");
			String uservalue = in.nextLine();
			

			c1.setMessage(uservalue);
			String str = c1.getMessage();
			
			System.out.println("The msg is " + str);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
