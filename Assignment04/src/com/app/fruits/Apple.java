package com.app.fruits;

public class Apple extends Fruit{
	
	public Apple() {	
	} 
	
	public Apple(String name,String color,double weight) {
		super(name,color,weight);
	}
	
	public Apple(String name,String color,double weight, boolean isFresh) {
		super(name,color,weight,isFresh);
	}
 
	@Override
	public String taste() {
		return "sweet and sour";
	}
	
	
}
