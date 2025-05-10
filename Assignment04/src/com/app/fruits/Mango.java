package com.app.fruits;

public class Mango extends Fruit {

	public Mango() {
		// TODO Auto-generated constructor stub
	}
	public Mango(String name,String color,double weight) {
		super(name,color,weight);
	}

	public Mango(String name,String color,double weight, boolean isFresh) {
		super(name,color,weight,isFresh);
	}
 
	@Override
	public String taste() {
		return "sweet";
	}
}
