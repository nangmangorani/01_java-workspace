package com.kh.chap03_class.model.vo;

public class Product {
	// 클래스 선언구문에 작성가능한 접근제한자 (public, default) default는 따로 쓰는게아니라 public없으면 걍 default되는거임.
	// default로 하면 같은 패키지 내에서만 사용가능. / 다른 패키지에서는 해당 파일 사용불가 => 못찾음
	
	
	/*
	 * 순서!!
	 * 
	 * 필드(field)
	 * 
	 * 필드 == 멤버변수 == 인스턴스 변수
	 * 
	 * [표현법]
	 * 접근제한자 [예약어] 자료형 변수명;
	 * 
	 * 
	 */
	

	private String pName;
	private int price;
	private String brand;
	
	/*
	 * 생성자
	 * 객체를 생성하기 위한 일종의 메소드
	 * 
	 * [표현법]
	 * 접근제한자 클래스명([매개변수, 매개변수,...]) {
	 * 
	 * 
	 * }
	 * 
	 */
	
	//기본 생성자!!
	public Product() {
		
	}
	
	/*
	 * 메소드
	 * 기능을 처리하는 담당
	 * 
	 * [표현법]
	 * 접근제한자 [예약어 ex)static] 반환형 메소드명([매개변수]) {
	 * 
	 * 		//기능 구현
	 * }
	 */
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// 내가 생각할 때 유용할 것 같은 메소드도 자유롭게 생성가능
	
	// 모든 필드값들 다 합친 한 문자열을 반환해주는 메소드
	public String information() {
		// return pName, price, brand; String으로 뱉어야되니까 안됨.. return 하나만해야함
		return "pName : " + pName + ", price : " + price + ", brand : " + brand;
		
		
	}
	
	
	
	
	
	
}
