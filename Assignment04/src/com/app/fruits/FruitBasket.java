package com.app.fruits;


import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {
		
		
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the size(No. of Fruits) of Basket = ");
		int size=in.nextInt();
		int counter=0;
		Fruit[] basket=new Fruit[size];
		
		int choice;
		do {
			menu();
			System.out.print("Enter your choice : ");
			choice =in.nextInt();
			counter = Fruitdriver(choice,basket,counter);
		} while (choice!=0);
		
		
		
		
		
	}
	
	
	public static void menu() {
		
		Scanner in =new Scanner(System.in);
		System.out.println("0. Exit ");
		System.out.println("1. Add Mango ");
		System.out.println("2. Add Orange ");
		System.out.println("3. Add Apple ");
		System.out.println("4. Display names of all fruits in the basket ");
		System.out.println("5. Display name, color, weight, taste of all fresh fruits, in the basket ");
		System.out.println("6. Display tastes of all stale (not fresh) fruits in the basket");
		System.out.println("7 . Mark a fruit as state (not fresh - false)");
		System.out.println("8 . Mark All fruit as state (not fresh - false)");
		
	}
	
	
	
	public static int Fruitdriver(int choice,Fruit[] arr,int counter) {
		Scanner in =new Scanner(System.in);

				
			switch (choice) {
			
			case 1: {   
				
				if(counter < arr.length) {
					
					
					
					String name = "Mango";
					String color = "yellow";
					System.out.print("Enter the weight of Mango = ");
					double weight = in.nextDouble();
					
					arr[counter]=new Mango(name.trim(),color,weight);
				
					counter++; 
					System.out.println("----------------------------------------------------");
					System.out.println("Mango Fruit Added Successfully");
					System.out.println("----------------------------------------------------");
				}else {
					System.out.println("----------------------------------------------------");
					System.out.println("Basket is Full you can't Add ");
					System.out.println("----------------------------------------------------");
				}
				
				break;	
			}
			
            case 2: {   
				
				if(counter < arr.length) {
					
					
					String name = "Orange";
			
					String color = "orange";
					System.out.print("Enter the weight of Orange = ");
					double weight = in.nextDouble();
					
					arr[counter]=new Orange(name.trim(),color,weight);
				
					counter++; 
					System.out.println("----------------------------------------------------");
					System.out.println("Orange Fruit Added Successfully");
					System.out.println("----------------------------------------------------");
				}else {
					System.out.println("----------------------------------------------------");
					System.out.println("Basket is Full you can't Add ");
					System.out.println("----------------------------------------------------");
				}
				
				break;	
			}
           case 3: {   
				
				if(counter < arr.length) {
				
					
					String name = "Apple";
					
					String color = "red";
					System.out.print("Enter the weight of Apple = ");
					double weight = in.nextDouble();
					
					arr[counter]=new Apple(name.trim(),color,weight);
				
					counter++; 
					System.out.println("----------------------------------------------------");
					System.out.println("Apple Fruit Added Successfully");
					System.out.println("----------------------------------------------------");
				}else {
					System.out.println("----------------------------------------------------");
					System.out.println("Basket is Full you can't Add ");
					System.out.println("----------------------------------------------------");
				}
				
				break;	
			}
           case 4 :{
        	   System.out.println("----------------------------------------------------");
        	   System.out.println("Total Fruits are ->" + counter);
        	   for(Fruit fruit : arr) {
       
        		   if(fruit.getName()!=null) {
        			   
        			   System.out.println("Fruit Name is => "  + fruit.getName());
        		   }else {
        			  
        			   System.out.println("Fruit name is empty ");       			
        		   }
        		  
        	   }
        	   System.out.println("----------------------------------------------------");
        	   break;
           }
           
           case 5 :{
        	   System.out.println("----------------------------------------------------");
        	   System.out.println("Total Fruits are ->" + counter);
        	   for(Fruit fruit : arr) {
        		   
        		   if(fruit.toString()!=null || fruit.getIsFresh() !=false || fruit.taste()!=null) {
        			  
        			   System.out.println(fruit.toString());
        			
        			  
        		   }else {
        			 
        			   System.out.println("The Fruits are empty ");
        			   
        		   }
        		  
        	   }
        	   System.out.println("----------------------------------------------------");
        	   break;
           }
           
           case 6 :{
        	   System.out.println("----------------------------------------------------");
        	   boolean stale=false;
        	   
        	   for(Fruit fruit : arr) {
        		   
        		   if( fruit.getIsFresh() ==false) {
        			   
        			   System.out.println("The Fruit -> "+ fruit.getName()+" "  +fruit.taste());
        			   stale=true;
        			  
        		   }
        			   
        	   }
        	   if(!stale) {
        		   System.out.println("All fruits are fresh ");
        	   }
        	   
        	   System.out.println("----------------------------------------------------");
        	   break;
           }
           
           case 7 :{
        	   System.out.println("----------------------------------------------------");
        	   boolean found=false;
        	   
        	   int i=0;
        	   for(Fruit fruit : arr) {
        		   System.out.println(i+" "+fruit);  
        		   i++;
        	   }
        	   System.out.println("----------------------------------------------------");
        	   
        	   System.out.print("Enter the name to select the fruit = ");
        	   String fruitName=in.next().trim();
        	   for(Fruit fruit : arr) {
        		   if(fruit.getName().equals(fruitName)) {
        			   
        			   fruit.setIsFresh(false);
        			   found=true;
        			   System.out.println("Fruit Marked as stale ");
        		   }
        	   }    
        	   
        	   if(!found) {
        		 
        			   System.out.println("Invalid name cannot found selected fruit ");
        		 
        	   }
        	   
        	   System.out.println(); 
        	   break;
           }
           
           case 8 :{
        	   System.out.println("----------------------Displayed-----------------------------");
        	   boolean found =false;
        	   int i=0;
        	   for(Fruit fruit : arr) {
        		   if(fruit.taste().equals("sour")) {
        			   System.out.println(i+" "+fruit);  
            		   i++;
        		   }
        	   }
        	   System.out.println("------------------------Marking---------------------------");
        	   for(Fruit fruit : arr) {
        		   if(fruit.taste().equals("sour")) {
        			   fruit.setIsFresh(false); 
        			   found=true;
        			   System.out.println("Marked sour fruits as stale !");
        		   }
        	   }
        	   
        	  if(!found) {
   
       			   System.out.println("No sour fruits found");
        	  }
     	        	   
        	   System.out.println(); 
        	   break;
           }
           
           
			
			default:
				System.out.println("Invalid choice ");
				break;
			}
			 return counter;
	}

}
