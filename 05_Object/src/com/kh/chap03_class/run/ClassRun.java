package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
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
		
		System.out.println("=== 메소드 만들고 난 후 ===");
		System.out.println(a.information());
		
		System.out.println();
		System.out.println("=== 구분선 ===");
		System.out.println();
		
		Person p = new Person();
		
		System.out.println(p.getId());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		
		// 생성 후에 필드에 담긴 값을 곧바로 알아보면
		// JVM이 초기화(값 세팅)까지 진행해줬음!!
		
		p.setId("user01");
		p.setPwd("pwd01");
		p.setName("이승준");
		p.setAge(27);
		p.setGender('M');
		p.setPhone("010-1234-5678");
		p.setEmail("ggg@naver.com");
		
		System.out.println("=== 값 대입후 ===");
		System.out.println(p.getId());
		System.out.println(p.getPwd());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		System.out.println(p.getPhone());
		System.out.println(p.getEmail());
		
		System.out.println(p.information());
		
		
	}

}
