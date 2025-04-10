package com.operator;

abstract class shape {
	
	abstract void draw();
}

class Circle extends shape{
	
	void draw()
	{
		System.out.println("circle");
	}

}

public class Abstraction {
	public static void main(String[]args) {
		shape s1 = new Circle();
		s1.draw();
	}
}
