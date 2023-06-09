package com.kh.chap02_inherit.model.vo;

public class Car extends Vehicle{
	private int tire;
	
	public Car() {}
	
	public Car(String name, double mileage, String kind, int tire) {
		super(name,mileage,kind);
		this.tire = tire;
	}
	

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}
	
	public String information() {
		return super.information() + ", tire : " + tire; 
	}
	
	@Override // 오버라이딩된 메소드라고 알려주는 용도, 어노테이션(생략가능)
	public void howToMove() { // 이름 이상하게 하면 오류남
		System.out.println("바퀴를 굴려 움직인다.");
	}
	
	@Override
	public String toString() {
		return "아무말";
	}
	
}
