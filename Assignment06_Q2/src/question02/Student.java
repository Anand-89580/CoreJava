package question02;

public class Student  {
	private int roll;
	 private String name;
	 private String city;
	 private double marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int roll,String name,String city,double marks) {
		this.roll=roll;
		this.name=name;
		this.city=city;
		this.marks=marks;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getRoll() {
		return roll;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public double getMarks() {
		return marks;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		
		return " RollNo->"+roll+"  Name->"+name +"  City->"+city + "  Marks->"+marks +"%";
	}
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj == null) {
//			return false;
//		}
//		if(this ==obj ) {
//			return true;
//		}
//		if( ! ( obj instanceof Student ) ) {
//			return false;
//		}
//		Student other = (Student) obj;
//		
//		return this.getRoll()==other.getRoll();
//	}
	
//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		return this.roll-o.roll;
//	}
}

