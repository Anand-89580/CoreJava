package question04;

import java.util.Scanner;

enum TrafficLight {RED,GREEN, YELLOW}
public class Traffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  in =new Scanner(System.in);
		int choice;
		do {
			menu();
			System.out.print("Enter your choice : ");
			choice =in.nextInt();
			work(choice); 
		} while (choice!=0);
		
	}
	
	static void menu() {
	
		System.out.println("0. Exit ");
		System.out.println("1. Stop ");
		System.out.println("2. Wait ");
		System.out.println("3. Go ");
		
		
	}
	
	static void work(int choice) {
		
		while(choice!=0) {
			switch (choice) {
			case 1: {
				int time =LightToBeDisplayed();
				System.out.println(" Stop!  the Signal is  "  + TrafficLight.RED + " for " + time + " min" );
				return;
		
			}
			
			case 2: {
				int time =LightToBeDisplayed();
				System.out.println(" Wait! the Signal is  "  + TrafficLight.YELLOW + " for " + time + " min" );
				return;
				
			
			}
			case 3: {
				int time =LightToBeDisplayed();
				System.out.println(" Go the Signal is  "  + TrafficLight.GREEN + " for " + time + " min" );
				
				return;
			}
			default:
				System.out.println("---------------Invalid choice------------- ");
				break;
			}
		}
	}
	
	static int LightToBeDisplayed() {
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the duration of the light : ");
		int duration =in.nextInt();
		return duration; 
	}

}
