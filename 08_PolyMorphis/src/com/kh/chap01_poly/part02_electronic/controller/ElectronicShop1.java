package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

//다형성을 적용하기 전
public class ElectronicShop1 {
	
	// 용산 전자상가에 있는 가게
	// 필드부
	// private int price; // 기본자료형
	
	// 3개의 제품을 마련할 자리만들기
	private Desktop desk; // 내가 만든 자료형도 필드부에 쓸 수 있음.
	private NoteBook note; // 객체생성은 안되고 텅 비어있음
	private Tablet tab;
	
	// 이건 실제로 객체 생성이 된 것은 아님
	// 필드가 메모리상에 확보되는 순간 -> 객체가 생성되는 순간
	
	// 동일한 클래스에 동일한 메소드 명으로 여러개 만들어져있는것 -> 오버로딩
	// 단, 매개변수명은 달라야함.
	// 오버로딩이 적용 돼있음.
 	public void insert(Desktop d) { // Desktop d = new Desktop(...);
 		desk = d;
 	}
 	
 	public void insert(NoteBook n) { // Notebook n = new Notebook(...);
 		note = n;
 	}
	
 	public void insert(Tablet t) { // Tablet t = new Tablet();
 		tab = t;
 	}
 	
 	// 조회
 	// 모르겠으면 일단 반환형을 void로 => 나중에 수정하면됨ㅋ
 	public Desktop selectDesktop() {
 		return desk;
 	}
 	
 	public NoteBook selectNoteBook() {
 		return note;
 	}
 	
 	public Tablet selectTablet() {
 		return tab;
 	}
 	
 	// insert처럼 select도 같은 이름으로 하면 안되는 이유는?
 	// 매개변수가 없기 때문에 불가능함. => 오류남
 	
 	// 현재는 메소드가 총 6개!
 	// 다형성 적용하면? 2개~3개로 줄이기 가능!!
 	
 	
 	
}












