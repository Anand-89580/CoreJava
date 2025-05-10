package Credit;


import java.util.Scanner;

public class Calculator {
	private int accno;
	private  double balance;
	private double charged;
	private double credapplied;
	private double credit;
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	
	Calculator(int accno,double balance,double charged,double credapplied,double credit){
		this.accno=accno;
		this.balance=balance;
		this.charged=charged;
		this.credapplied=credapplied;
		this.credit=credit;
	}
	
	public void accept() {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Account No. = ");
		accno=in.nextInt();
		System.out.print("Enter Beginning Balance = ");
		balance=in.nextDouble();
		System.out.print("Enter Total Items Purchased Bill Amount = ");
		charged=in.nextDouble();
		System.out.print("Enter  Credits to be Applied = ");
		credapplied=in.nextDouble();
		System.out.print("Enter Allowed Credit Limit  = ");
		credit=in.nextDouble();
		in.close();
	}
	
	public void display() {
		System.out.println();
		System.out.println("Account No. = "+accno);
		System.out.println("Beginning Balance = "+balance);
		System.out.println("Total Items Purchased Bill Amount = "+charged);
		System.out.println("Credits to be Applied = "+credapplied);
		System.out.println("Allowed Credit Limit  = "+credit);
		
		calculateNewBalance();
	}
	
	public void calculateNewBalance() {
		double newBalance = balance +charged - credapplied;
//		System.out.println(newBalance);
		if(newBalance<credit) {
			System.out.println("-------------------------------------------------");
			System.out.println( "New Balance of Account No. "+accno +" = "  +newBalance);
			System.out.println("-------------------------------------------------");
		}else {
			System.out.println("-------------------------------------------------");
			System.out.println("For Account No. "+accno+" The Credit limit exceeded");
			System.out.println("-------------------------------------------------");
		}
	}
	
	

}
