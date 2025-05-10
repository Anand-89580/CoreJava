package question01;


public class Invoice {
	private String partno;
	private String description;
	private int quantity;
	private double price;
	
	Invoice() {
		// TODO Auto-generated constructor stub
	}
	
	Invoice(String partno,String description,int quantity,double price ){
		this.partno=partno;
		this.description=description;
		if(quantity>0) {
			 this.quantity=quantity;
		 }else {
			 this.quantity=0;
		 }
		if(price >0) {
			 this.price=price;
		 }else {
			 this.price=0.0;
		 }

	}
	
	 public void setPartNo(String partno) {
		this.partno=partno;
	}
	 public String getPartNo() {
		 return partno;
	 }
	 
	 public void setDescription(String description) {
			this.description=description;
	}
	 
	 public String getDescription() {
			 return description;
	 }
	 
	 public void setQuantity(int quantity) {
		 if(quantity>0) {
			 this.quantity=quantity;
		 }else {
			 this.quantity=0;
		 }
			
	}
	 
	 public int getQuantity() {
			 return quantity;
	 }
	 
	 public void setPrice(double price) {
		 if(price >0) {
			 this.price=price;
		 }else {
			 this.price=0.0;
		 }
			
	}
	 
	 public double getPrice() {
			 return price;
	 }
	 
	 public void amount() {
		 System.out.println("Total amount = Rs " +getPrice()*getQuantity());
	 }
	 
	 public void display() {
		 System.out.println("Partno. = "+ this.partno  );
		 System.out.println( "Description = "+ description );
		 System.out.println("Qunatity = "+ quantity);
		 System.out.println("Price = " + price+ " Rs");
	 }
	 
	 
}

