package question03;

import java.util.Scanner;



public class demo03 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int choice;
		
		do {
			menu();
			System.out.print("Enter your choice : ");
			choice =in.nextInt();
			order(choice);
		}while (choice!=0);
		
		
		
		in.close();
	}
	
	static void menu() {
		System.out.println("------------Menu Items ---------");
		System.out.println("0. To exit");
		System.out.println("1. Dosa          - Rs30");
		System.out.println("2. Samosa          - Rs15");
		System.out.println("3. Idli Sambar          - Rs35" );
		System.out.println("4. Medu Wada          - Rs25");
		System.out.println("5. Vada Pav          - Rs10");
		System.out.println("6. Tea           - Rs12");
		System.out.println("7. Coffee          - Rs15");
		System.out.println("8. Pohe          - Rs25");
		System.out.println("9. Pani Puri          - Rs25");
		System.out.println("10. SPDP          - Rs50");
	}
	
	static void order(int choice) {
		
		while(choice!=0) {
			switch(choice) {
			case 1:{
				System.out.println();
				System.out.println("----------------------Dosa--------------");
				int quant= userQuantity();
				calculateBill("Dosa", 30, quant);
//				menu();
				return;
			}
			case 2:{
				System.out.println();
				System.out.println("----------------------Samosa--------------");
				int quant= userQuantity();
				calculateBill("Samosa", 15, quant);
//				menu();
				return;
			}
			case 3:{
				System.out.println();
				System.out.println("--------------------Idli Sambar--------------");
				int quant= userQuantity();
				calculateBill("Idli Sambar", 35, quant);
//				menu();
				return;
			}
			case 4:{
				System.out.println();
				System.out.println("--------------------Medu Wada--------------");
				int quant= userQuantity();
				calculateBill("Medu Wada", 25, quant);
//				menu();
				return;
			}
			
			case 5:{
				System.out.println();
				System.out.println("--------------------Vada Pav--------------");
				int quant= userQuantity();
				calculateBill("Vada Pav", 10, quant);
//				menu();
				return;
			}
			case 6:{
				System.out.println();
				System.out.println("--------------------Tea--------------");
				int quant= userQuantity();
				calculateBill("Tea", 12, quant);
//				menu();
				return;
				
			}
			case 7:{
				System.out.println();
				System.out.println("--------------------Coffee--------------");
				int quant= userQuantity();
				calculateBill("Coffee", 15, quant);
//				menu();
				return;
			}
			case 8:{
				System.out.println();
				System.out.println("--------------------Pohe--------------");
				int quant= userQuantity();
				calculateBill("Pohe", 25, quant);
//				menu();
				return;
			}
			case 9:{
				System.out.println();
				System.out.println("--------------------Pani Puri--------------");
				int quant= userQuantity();
				calculateBill("Pani Puri", 25, quant);
//				menu();
				return;
			}
			case 10:{
				System.out.println();
				System.out.println("--------------------SPDP--------------");
				int quant= userQuantity();
				calculateBill("SPDP", 50, quant);
//				menu();
				return;
			 }
			default:{
				System.out.println("Invalid choice ");
				return;
			}
			}
		}
		
		
		
		
	}
	
	static int userQuantity() {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter quantity : ");
		int quantity=in.nextInt();
		
		
		if(quantity>0) {
			return quantity;
		}
	
		return 1;
	}
	
	static void calculateBill(String str, int price , int quantity) {
		
			int total =price * quantity;
		
		System.out.println();
		System.out.println("***********************************************************************");
		System.out.println("Price of " + str + " is Rs" + price + " and quantity is " + quantity);
		System.out.println("Your total bill of " + str + " is  Rs " + total);
		System.out.println("Thank you visit again");
		System.out.println("***********************************************************************");
		System.out.println();
		
	}

	
}
