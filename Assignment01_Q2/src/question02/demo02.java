package question02;

import java.util.Scanner;

public class demo02 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		try {
			System.out.print("Enter num1 : ");
			
//			if(!in.hasNextDouble()) {
//				System.out.println("First num is not a double value please enter correct ");
//			}
				double num1=in.nextDouble();
		
			System.out.print("Enter num2 : ");
//			if(!in.hasNextDouble()) {
//				System.out.println("Second num is not a double value please enter correct ");
//			}
			double num2=in.nextDouble();
			System.out.println(isDouble(num1,num2));
		}catch(Exception e) {
			System.out.println("Please enter valid double value");
		}
		
		
		in.close();
	}
	
	static double isDouble(double n1,double n2) {

		return (n1+n2)/2.0;
		
	}
	
}
