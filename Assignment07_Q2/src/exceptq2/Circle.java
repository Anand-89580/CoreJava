package exceptq2;

public class Circle{
	private double myX;
	private double myY;
	private double myDiameter;
	
	public Circle() throws CustomException{
		this(0, 0, 100);
	}
	
	public Circle(double myX,double myY,double myDiameter) throws CustomException {
		 this.myX=myX;
		 this.myY=myY;
		 if(myDiameter>0) {
			 this.myDiameter=myDiameter;
		 }else {
			 throw new CustomException("The diameter should be non-negative");
		 }
		 
	}
	
	public void setMyX(double myX) {
		this.myX = myX;
	}

	public void setMyY(double myY) {
		this.myY = myY;
	}
	public void setMyDiameter(double myDiameter) throws CustomException {
		if(myDiameter>0) {
			 this.myDiameter=myDiameter;
		 }else {
			 throw new CustomException("The diameter should be non-negative");
		 }
	}
	
	public double getMyX() {
		return myX;
	}
	
	public double getMyY() {
		return myY;
	}
	public double getMyDiameter() {
		return myDiameter;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " myX= "+myX + " myY= "+myY + " myDiamter= "+ myDiameter;
	}
	
}
