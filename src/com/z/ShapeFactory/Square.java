package com.z.ShapeFactory;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println(">>"+" ----");
		System.out.println(">>"+"|    |");
		System.out.println(">>"+" ----");
	}

}
