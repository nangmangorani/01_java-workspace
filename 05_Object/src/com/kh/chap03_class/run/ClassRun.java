package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {
		
		Product a = new Product();
		a.setpName("이클립스");
		a.setPrice(2000);
		a.setBrand("몰라요");
		
		Product b = new Product();
		b.setpName("추파춥스");
		b.setPrice(300);
		b.setBrand("모르죠");
		
		Product c = new Product();
		c.setpName("호올스");
		c.setPrice(2200);
		c.setBrand("모릅니다");
		
		System.out.println("=== 상품1 ===");
		System.out.println("상품명 : " + a.getpName());
		System.out.println("상품 가격 : " + a.getPrice());
		System.out.println("브랜드 : " + a.getBrand());
		
		System.out.println("=== 상품2 ===");
		System.out.println("상품명 : " + b.getpName());
		System.out.println("상품 가격 : " + b.getPrice());
		System.out.println("브랜드 : " + b.getBrand());
		
		System.out.println("=== 상품3 ===");
		System.out.println("상품명 : " + c.getpName());
		System.out.println("상품 가격 : " + c.getPrice());
		System.out.println("브랜드 : " + c.getBrand());
	}

}
