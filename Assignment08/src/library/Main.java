package library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {
	private static List<Book> list =new ArrayList<>();
	private static Scanner in =new Scanner(System.in);

	public static void main(String[] args) {
		String[] isbn = new String[1];
		Book[] books =getBooks();
		int choice;
		 while ((choice=menu())!=0) {
			 switch (choice) {
			 
			case 1: 
				addBooks(books);
				break;
			case 2 :
				
				displayInForward(new ByIsBncomparator());
				break;
			case 3 :
				displayInBackward (new Revcomparator());
				break;
			case 4 :

				 accept(isbn);
				 boolean check = deleteBook(isbn[0]);
				 
				 if( check) {
					 System.out.println("Deleted Successfully ");
				 }else {
					 System.out.println(" Book Not found ");
				 }
			
				break;	
				
			default:
				System.out.println("Invalid Exception ");
				break;
			}
		 }
		
		

	}

	public static int menu() {
		System.out.println("0. Exit");
		System.out.println("1. Add new book in list");
		System.out.println("2. Display all books in forward order");
		System.out.println("3. Display all books in reverse order");
		System.out.println("4. Delete a book at given index");
		System.out.print("Enter your choice : ");
		return in.nextInt();
	}
	
	
	public static Book[] getBooks() {
		Book[] book = {
				new Book("A", "Anil", 450.7, 2),
				new Book("C", "Nitin", 550, 6),
				new Book("E", "Kamlesh", 699.9, 1),
				new Book("F", "Ram", 442.9, 4),
				new Book("D", "Mukesh", 549.9, 5),
				new Book("B", "Shyam", 300.0, 3),
		};
		return book;
		
	}
	
	public static void addBooks(Book[] books) {
		for (Book en : books) {
			list.add(en);
		}
		System.out.println("Books added Successfully! ");
	}
	
	public static void displayInForward( Comparator<Book> cmp ) {

		list.sort(cmp);
		for( Book en : list ) {
			System.out.println(en);
		}
	}
	public static void displayInBackward( Comparator<Book> cmp ) {
		list.sort(cmp);
		for( Book en : list ) {
			System.out.println(en);
		}
	}
	
	public static String accept(String[] isbn) {
		System.out.print("Enter isbn : ");
		isbn[0]=in.next().trim().toUpperCase();
		return isbn[0]; 
	}
	
	public static boolean deleteBook(String isbn) {
	
		Book book=new Book();
		book.setIsbn(isbn);
	
		if(list.contains(book)) {
			list.remove(book);

			return true;
		}
		return false;
		
		
	}
	
	
} 

class ByIsBncomparator implements Comparator<Book>{
	
	@Override
	public int compare(Book o1, Book o2) {
		
		return o1.getIsbn().compareTo(o2.getIsbn());
	}
}

class Revcomparator implements Comparator<Book>{
	
	@Override
	public int compare(Book o1, Book o2) {
		
		return - o1.getIsbn().compareTo(o2.getIsbn());
	}
}