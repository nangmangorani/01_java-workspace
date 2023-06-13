package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public class BasketBall extends Sports {

	// 자식클래스에 강제성을 부여하기 위함
	// basketball, football 이든 무조건 rule이 있으니 반드시 룰을 구현했으면 해서..
	
	// 추상메소드가 존재하는 추상클래스를 상속받는 순간
	// 부모클래스에 있던 추상메소드를 강제로 오버라이딩 해야됨.
	
	@Override
	public void rule() {
		System.out.println("공을 손으로 다뤄야함");
	}
	
	
	
	
	
	
}
