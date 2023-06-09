package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product {
	
	// 세 클래스 모두 공통적으로 가지고 있는 요소들 (필드, 메소드) 만을 기술
	private String brand; // private로 하면 super.brand = brand할 때 안됨! protected로 해줭
	private String pCode;
	private String pName;
	private int price;
	
	// 생성자
	public Product() {}
	
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	// getter setter 메소드
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	
	public String getpCode() {
		return pCode;
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public String getpName() {
		return pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	// 전체출력 메소드
	public String information() {
		return brand + ", " + pCode + ", " + pName + ", " + price;
	}
	

}
