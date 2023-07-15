package com.app.fruits;

public class Apple extends Fruit {

	public Apple(String color, String name, double weight) {
		super(color, name, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		return "sweet";
	}
	public void jam() {
		System.out.println(this.getName()+" "+this.getWeight()+"create jam");
	}

}
