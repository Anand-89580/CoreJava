package com.app.fruits;

public class Orange extends Fruit {

	public Orange() {
		// TODO Auto-generated constructor stub
	}
	
	public Orange(String name,String color,double weight) {
		super(name,color,weight);
	}

	public Orange(String name,String color,double weight, boolean isFresh) {
		super(name,color,weight,isFresh);
	}
 
	@Override
	public String taste() {
		return "sour";
	}

}
