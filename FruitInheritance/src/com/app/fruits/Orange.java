package com.app.fruits;

public class Orange extends Fruit {

	public Orange(String color, String name, double weight) {
		super(color, name, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		return "sweet n sour";
	}
	public void juice() {
		System.out.println(this.getName()+"create juice");
	}

}
