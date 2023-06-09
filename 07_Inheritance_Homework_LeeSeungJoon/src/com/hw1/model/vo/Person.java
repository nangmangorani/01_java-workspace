package com.hw1.model.vo;

public class Person {
	protected String name;
	private int age;
	private double heigth;
	private double weigth;
	
	public Person() {}
	
	public Person(int age, double heigth, double weigth) {
		
		this.age = age;
		this.heigth = heigth;
		this.weigth = weigth;
	}
	
	// getter setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	
	public String toString() {
		return "name : " + name + ", age : " + age + ", height : " + heigth + ", weight : " + weigth; 
	}
	
	
	
}
