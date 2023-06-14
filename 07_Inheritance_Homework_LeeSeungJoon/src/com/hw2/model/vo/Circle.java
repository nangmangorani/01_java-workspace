package com.hw2.model.vo;

public class Circle extends Point{

	private int radius;
	
	public Circle() {}
	
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		super.draw();
		System.out.printf(", 면적 : %.1f, 둘레 : %.1f\n",Math.PI * radius * radius, Math.PI * radius *2);
		System.out.println();
	}
	// %d 정수 %f 실수 %s 문자열 %c 문자
	
	
}
