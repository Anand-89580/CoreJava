package question02;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
	
	public static void main(String[] args) {
	
		Student[] s1 =getStudents();
		
		Arrays.sort(s1 , new CityMarksNameComparator() );
		
		for (Student student : s1) {
			System.out.println(student);
		}

	}
	
	static Student[] getStudents() {
		Student[] s1 ={
				new Student(5, "Anand", "Mumbai", 89.8),
				new Student(1, "Paresh", "Pune", 85.6),
				new Student(4, "Gaurav", "Pune", 91.42),
				new Student(2, "Akash", "Pune", 90),
				new Student(3, "Kalpesh", "Mumbai", 91.46)
		};
		return s1;
	}

}

class StudRollComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		int diff =o1.getRoll()-o2.getRoll();
		return diff;
	}
	
}


class CityMarksNameComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		int diff = - o1.getCity().compareTo(o2.getCity());
		if(diff==0) {
			diff = -Double.compare(o1.getMarks(), o1.getMarks());
			if(diff==0) {
				diff = o1.getName().compareTo(o2.getName());
				
			}
			
		}
		
		return diff;
	} 
	
}








