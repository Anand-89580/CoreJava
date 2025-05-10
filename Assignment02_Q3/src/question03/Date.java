package question03;

public class Date {
	private int day;
	private int month;
	private int year;
	
	Date(){
		
	}
	
	Date(int day,int month,int year){
		
		if(day>0 && day<32) {
			this.day=day;
		}else {
			System.out.println("Day should be between 1 to 31 ");
		}
		
		if(month>0 && month<13) {
			this.month=month;
		}else {
			System.out.println("Month should be between 1 to 12 ");
		}
		
		if(year>0) {
			this.year=year;
		}else {
			System.out.println("Year can't be negative");
		}	
	}
	
	
	public void setDay(int day) {
		if(day>0 && day<32) {
			this.day=day;
		}else {
			System.out.println("Day should be between 1 to 31 ");
		}
	}
	
	public int getDay() {
		return day;
	}
	
	public void setMonth(int month) {
		if(month>0 && month<13) {
			this.month=month;
		}else {
			System.out.println("Month should be between 1 to 12 ");
		}
	}
		
	public int getMonth() {
		return month;
	}
	
	
	public void setYear(int year) {
		if(year>0) {
			this.year=year;
		}else {
			System.out.println("Year can't be negative nor zero");
		}
	}
		
	public int getYear() {
		return year;
	}
	
	
	public void displayDate() {
		
		if( (day>0 && day<32 ) &&  (month>0 && month<13) && (year>0) ) {
			System.out.println("---------------------------------------------");
			System.out.println(" Date is " +day+"/"+month+"/"+year);
			System.out.println("---------------------------------------------");
		}
		
		
		
	}
	
}
