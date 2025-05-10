package com.app.fruits;


abstract public class Fruit {
	private String name;
	private String color;
	private double weight;
	private boolean isFresh =true;

	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	
	public Fruit(String name,String color,double weight){
		this.name=name;
		this.color=color;
		this.weight=weight;
	}
	public Fruit(String name,String color,double weight, boolean isFresh ){
		this.name=name;
		this.color=color;
		this.weight=weight;
		this.isFresh=isFresh;
	}
	
	public void setIsFresh(boolean isfresh) {
		this.isFresh=isfresh;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public void setWeight(double weight) {
		this.weight=weight;
	}
	
	
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public double getWeight() {
		return weight;
	}
	
	public boolean getIsFresh() {
		return isFresh;
	}
	
	@Override
	public String toString() {
		return " Name -> " + name +" ,  Color -> "+ color + " ,  Weight -> "+weight +" Kg , IsFresh -> " + isFresh ;
	}
	
	abstract public String taste();
	
	public void displayName(Fruit fruit) {
		System.out.println("Name of " + fruit+ " " + this.name);
	}
	
	@Override
	public boolean equals(Object Obj) {
		if(Obj==null) {
			return false;
		}
		if(Obj instanceof String) {
			String f2 =(String)Obj;
			String f1 =this.taste();
			return f1.equals(f2);
		}
	
		return false;
	}
	 

}
