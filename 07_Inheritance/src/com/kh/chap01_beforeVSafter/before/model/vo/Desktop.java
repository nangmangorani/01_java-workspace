package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {
	
	// 필드
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private boolean allInOne;
	
	// 생성자
	public Desktop() {}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
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
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public boolean isAllInOne() { // boolean get은 is로 써줘야함.
		return allInOne;
	}
	
	public String information() {
		return brand + ", " + pCode + ", " + pName + ", " + price + ", " + allInOne;
	}
	
}
