package question02;


public class Employee {
	private String fname;
	private String lname;
	private double salary;
	
	Employee() {
		// TODO Auto-generated constructor stub
	}
	
	Employee(String fname,String lname,double salary){
		this.fname=fname;
		this.lname=lname;
		if(salary<0) {
			System.out.println("Salary can't be negative ");
		}else {
			this.salary=salary;
		}
		
	}
	
	public void setFname(String fname) {
		this.fname=fname;
	}
	
	public String getFname() {
		return fname;
	}
	public void setLname(String lname) {
		this.lname=lname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setSalary(double salary) {
		if(salary<0) {
			System.out.println("Salary can't be negative ");
		}else {
			this.salary=salary;
		}
		
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void yearlySal() {
		System.out.println("Yearly salary  = Rs "+ (12 * salary));
	}
	
	public void raiseYearlySal() {
		double raise =salary * 0.1;
		double total= salary + raise;
		System.out.println("Raise 10% yearly salary   = Rs "+ (12 * total));
	}
	
	public void display() {
		System.out.println("First name = " + fname);
		System.out.println("Last name = " + lname);
		System.out.println("Salary = Rs " + salary);
		yearlySal();
	}
	
	
}
