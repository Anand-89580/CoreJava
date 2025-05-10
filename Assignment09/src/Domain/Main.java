package Domain;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

enum Stud{
	EXIT,ADD, DISPLAY,SEARCH,SORTROLL,SORTNAME,SORTMARKS
}

public class Main {
	private static List<Student> list =new ArrayList<>();
	private static Scanner in =new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] sid=new int[1];
		Stud choice;
		while( (choice=menu())!= Stud.EXIT) {
			switch (choice) {
			case ADD: {
				Student[] s1 =getStudent();
				addStudent(s1);
				break;
			}
			case DISPLAY: {
				displayAll();
				break;
			}
			case SEARCH: {
				displayAll();
				acceptId(sid);
				search(sid[0]);
				break;
			}
			case SORTROLL: {
				sortByRoll();
				break;
			}
			case SORTNAME: {
				sortByName();
				break;
			}
			case SORTMARKS: {
				sortByMarks();
				break;
			}
			default:
				System.out.println("Invalid choice ");
			}
		}

	}
	
	public static Student[] getStudent() {
		Student[] arr = {
				new Student(5, "Gaurav", 89.6),
				new Student(3, "Akash", 90.9),
				new Student(1, "Kalpesh", 85.0),
				new Student(4, "Paresh", 94.5),
				new Student(2, "Rohan", 88.9),
		};
		return arr;
	}
	
	public static Stud menu() {
		Stud[] val = Stud.values();
		for(Stud d : val) {
			System.out.println(d.ordinal() + ". " + d.name());
		}
		System.out.print("Enter your choice : ");
		return val[in.nextInt()];
	}
	
	public static void addStudent(Student[] arr) {
		for (Student student : arr) {
			list.add(student);
		}
		System.out.println();
		System.out.println("       Added SUCCEESSFULLY          ");
		System.out.println();
	}
	
	public static void displayAll() {
		if(list.isEmpty()) {
			System.out.println();
			System.out.println("ADD student to display All ");
			System.out.println();
		}
		
		Iterator<Student> trav =list.iterator();
		while(trav.hasNext()) {
			System.out.println( trav.next());
		}
	}
	
	public static int acceptId(int[]  sid) {
		System.out.print("Enter Student Roll NO.  : ");
		sid[0]=in.nextInt();
		return sid[0];
	}
	
	public static void search (int id ) {
		Student s1 =new Student();
		s1.setRoll(id);
		
		int idx =list.indexOf(s1);
		if(idx != -1) {
			System.out.println(list.get(idx));
		}else {
			System.out.println("Student not found ");
		}
		
	}
	
	public static void sortByRoll() {
		Collections.sort(list);
		displayAll();
	}
	public static void sortByName() {
		Collections.sort(list, (x,y) -> x.getName().compareTo(y.getName()));
		displayAll();
		
	}
	public static void sortByMarks() {
		Collections.sort(list, (x,y) -> Double.compare(x.getMarks(), y.getMarks()) );
		displayAll();
		
	}
	
	
}
