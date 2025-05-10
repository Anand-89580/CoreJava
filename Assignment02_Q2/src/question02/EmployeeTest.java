package question02;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee emp1 =new Employee("Virat" , "Kohli ", 200);
		emp1.display();
		
		emp1.raiseYearlySal();
		
		System.out.println("-------------------------------------------------");
		
		Employee emp2 =new Employee();
		emp2.setFname("Rohit");
		emp2.setLname("Sharma");
		emp2.setSalary(100);
		emp2.display();
		
		emp2.raiseYearlySal();
		
	}
}
