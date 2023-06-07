package com.hw1.model.vo;

public class Product {
	
	private String productId; // 상품아이디
	private String productName; // 상품명
	private String productArea; // 생산지
	private int price; // 가격
	private double tax; // 부가세 비율
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	
	public String getProductArea() {
		return productArea;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double getTax() {
		return tax;
	}
	
	public String information() {
		return productId + " " + productName + " " + productArea + " "
				+ price + " " + tax;
	}
	
	public Product() {
		
	}
	
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	public int calculate(int price, double tax) {
		return price + (int)(price * tax);
	}
	
	
	
	
	
	
	
}
