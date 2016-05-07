package com.z.ShapeFactory;

public class ShapeFactory {
	
	public Shape getShape(String shapeName){
		Shape shape = null;
		if(shapeName.equals("Triangle")){
			shape = new Triangle();
		}
		if(shapeName.equals("Square")){
			shape = new Square();
		}
		if (shapeName.equals("Retangle")) {
			shape = new Retangle();
		}
		return shape;
	}
}
