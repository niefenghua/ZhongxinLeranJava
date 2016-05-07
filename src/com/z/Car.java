package com.z;

public class Car {
	
	String brand;
	
	

	private Car() {
		
	}
	
	public static Car getInstance() {
		return new Car();
	}

	

}
