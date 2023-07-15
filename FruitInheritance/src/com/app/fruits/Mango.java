package com.app.fruits;

public class Mango extends Fruit {

	public Mango(String color, String name, double weight) {
		super(color, name, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		
		return "sweet";
	}
	public void pulp() {
		System.out.println(this.getName()+" "
				+this.getColor()+"create pulp");
	}
}
