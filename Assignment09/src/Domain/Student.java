package Domain;

public class Student implements Comparable<Student> {
	private int roll;
	private String name;
	private double marks;
	
	

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student (int roll, String name,double marks) {
		this.roll=roll;
		this.name=name;
		this.marks=marks;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public double getMarks() {
		return marks;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if( this == obj ) return true;
		if( ! (obj instanceof Student) ) return false;
		
		
		Student other = (Student)obj;
		
	if(this.roll==other.roll) {
		return true;	
	}
		return false;
		
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " RollNo=" + roll + "  Name="+ name +"   Marks="+marks ;
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.roll - o.roll;
	}
	
}

