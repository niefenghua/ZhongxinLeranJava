package com.z.ShapeFactory;

public class TestShapeFactory {

	public static void main(String[] args) {
		
		ShapeFactory sf = new ShapeFactory();
		sf.getShape("Retangle").draw();
		sf.getShape("Square").draw();
		sf.getShape("Triangle").draw();

	}

}
