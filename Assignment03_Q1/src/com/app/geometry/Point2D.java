package com.app.geometry;

import java.io.*;



public class Point2D {
	private double x;
	private double y;
	
	public Point2D() {
		// TODO Auto-generated constructor stub
	}
	
	public Point2D(double x,double y) {
		this.x=x;
		this.y=y;
	}

	 public String getDetails() {	
		 String str ="X-coordinate ="+ x + " " + "Y-coordinate "+ y + "\n";
//		 System.out.print(str);
		 
		 return str;
	 }
	  
	 
	 @Override
	public boolean equals(Object obj) {
		 if (this == obj) {
			 return true;
		 } 
			
		 if(obj == null || obj.getClass()!= this.getClass()) {
			 return false;
		 }
		  Point2D p1= (Point2D)obj;
		  
		  return (p1.x==this.x && p1.y==this.y);
	}
	 
	
	public double calculateDistance(Object obj) {
		
		  Point2D p2= (Point2D)obj;

		  double pointx=p2.x - this.x;
		  double pointy=p2.y - this.y;
//		  System.out.println("X cordiate of both : "+this.x + " " + p2.x);
//		  System.out.println( " Y- cordiate of both " +this.y + " " + p2.y);
		  
		  
		double powerx = Math.pow(pointx, 2);
		double powery = Math.pow(pointy, 2);
		
//		  System.out.println("Power of x-y " + powerx + " " + powery);
		double add=powerx+powery;
		double sqt=Math.sqrt(add);
//		 System.out.println("add " + add);
//		 System.out.println("ans " + sqt);
		
		return sqt;
	}
	 
}
