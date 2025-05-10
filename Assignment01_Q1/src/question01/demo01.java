package question01;

import java.util.Scanner;

public class demo01 {

	public static void main(String[] args) {
		 Scanner in =new Scanner(System.in);
	     System.out.print("Enter the num : ");
	     
	     int n=in.nextInt();
	     System.out.println("Given num is  : " + n);
//	     String b =Integer.toBinaryString(n);
	     System.out.println("Binary is " + Integer.toBinaryString(n));
	     System.out.println("Octal is " + Integer.toOctalString(n));
	     System.out.println("Hexadecimal is " + Integer.toHexString(n));
	     in.close();
	}
}
