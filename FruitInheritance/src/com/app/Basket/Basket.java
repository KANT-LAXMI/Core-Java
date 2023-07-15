package com.app.Basket;

import java.util.Scanner;

import com.app.fruits.*;

public class Basket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the basket size");
		Fruit[] basket = new Fruit[sc.nextInt()];
		int index = 0;
		int ch = 0;
		while (ch != 11) {
			System.out.println("enter your choice");
			ch = sc.nextInt();
			switch (ch) {

			case 1:
				System.out.println("enter mango details");
				if (index < basket.length) {
					basket[index++] = new Mango(sc.next(), sc.next(), sc.nextDouble());
				}
				break;
			case 2:
				System.out.println("enter apple details");
				if (index < basket.length) {
					basket[index++] = new Apple(sc.next(), sc.next(), sc.nextDouble());
				}
				break;
			case 3:
				System.out.println("enter orange details");
				if (index < basket.length) {
					basket[index++] = new Orange(sc.next(), sc.next(), sc.nextDouble());
				}
				break;
			case 4:
				for (Fruit f : basket) {
					if (f != null) {
						System.out.println(f.getName());
					}
				}
				break;
			case 5:
				for (Fruit f : basket) {
					if (f != null) {
						System.out.println(f);
					}

				}
				break;
			case 6:
				System.out.println("enter index");
				int id = sc.nextInt();
				for (int i = 0; i < index; i++) {
					if (i == id) {
						basket[i].setFresh(false);
						System.out.println("stale");
					}
				}
				break;
			case 7:
				for (Fruit f : basket) {
					if (f != null) {
						if (f.taste().equals("sour")) {
							f.setFresh(false);
							System.out.println("stale");
						}
					}
				}
				break;

			case 8:
				for (Fruit f : basket) {
					if (f != null) {
						if (f instanceof Mango) {
							((Mango) f).pulp();
						} else if (f instanceof Apple) {
							((Apple) f).jam();
						} else {
							((Orange) f).juice();
						}
					}
				}
				break;
			case 9:
				System.out.println("enter index");
				int id1 = sc.nextInt();
				for (int i = 0; i < index; i++) {
					if (id1 < index) {
						{
							if (basket[id1] instanceof Mango) {
								((Mango) basket[id1]).pulp();

							} else if (basket[id1] instanceof Apple) {
								((Apple) basket[i]).jam();

							} else {
								((Mango) basket[i]).pulp();

							}
						}
					} 
					}
					break;
					
					case 10:
						System.out.println("exiting");
					default:
						System.out.println("invalid choice");
					
					

				}

			}

		}
	
}
