package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public abstract class Sports {
	
	private int people;
	
	public Sports() {}
	
	public Sports(int people) { 
		this.people = people; 
	}
	
	public int getPeople() { // 머리부
		return people; // 몸통부 => 이게 없으면 완벽한 메소드가 아님
	}
	
	public void setPeople(int people) {
		this.people = people;
	}
	
	@Override
	public String toString() {
		return "people : " + people;
	}
	
	// 메소드 안에 내용o -> 완벽
	// 메소드 안에 내용x -> 추상적
	
	// 추상메소드(미완성된 메소드) 만들기
	//public void rule(); // 머리부만 있음.. 몸통부 x -> 에러남
	
	public abstract void rule();
	// 미완성된 메소드가 있다는 소리는 이 클래스도 아직 미완성이라는것
	
	// 그럼 언제 완성하나요? => 해당 추상클래스를 상속 받는 자식에서 완성!!
	
	
	
	
}




