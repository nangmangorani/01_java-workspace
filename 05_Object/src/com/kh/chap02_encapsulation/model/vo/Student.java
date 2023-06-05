package com.kh.chap02_encapsulation.model.vo;

public class Student { // 나만의 자료형
	
	// 필드부
	// 접근제한자 자료형 변수명
	//public String name; -> 지나가던 개도 관리가능하니까..
	private String name;
	private int age;
	private double height;
	private int korScore;
	private int mathScore;
	
	/*
	 * 메소드
	 * [표현법]
	 * 접근제한자 [예약어] 반환형 메소드명([매개변수]) {
	 * .. 실행할 코드
	 * 
	 * }
	 */
	
//	public void method1(int a) { // 매개변수 : 전달되는 변수
//		int b = 10; // 일반 변수
//		
//	}
	
	// - setter 메소드
	// 해당 필드에 대입시키고자 하는 값을 전달받아서 해당 필드에 대입시켜주는 기능의 메소드
	
//	public void setName(String newName) {
//		//System.out.println(newName);
//		name = newName;
//		
//	}
	
	public void setName(String name) { // 관례적인 표현
		//name = name; 색이없다. 매개변수 name = 매개변수 name; 이라고 쓴거
					// 필드명과 매개변수명이 동일한 시점에서 해당 메소드영역에서 만들어진 변수가 우선순위가 높음
		// 필드 name = 매개변수 name; 원함
		this.name = name; 
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore; 
	}
	
	// - getter 메소드
	// 해당 필드에 담긴 값을 '반환'해주는 역할을 수행
	
	public String getName() { //매개변수 비워도됨!, void아니고 어떤 자료형을 던져줄지 써야함.
		return name; // 파란거맞네!!
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public int getKorScore() {
		return korScore;
	}
	
	public int getMathScore() {
		return mathScore;
	}
	
	

}
