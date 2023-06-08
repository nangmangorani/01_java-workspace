package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		
		
		
		Phone[] phones = new Phone[3];
		
		System.out.println(phones[0]); // 아직 객체생성 안해서 null이 나옴
		
		//phones[0].setName("아이폰"); // java.lang.NullPointerException 오류 발생 아래에서 객체생성후!
		
		phones[0] = new Phone();
		phones[1] = new Phone("아이폰", "애플", 1300000, "14pro");
		phones[2] = new Phone("갤럭시", "삼성", 1200000, "s23");
		System.out.println(phones[1].getName());
		
		phones[0].setName("벨벳폰");
		phones[0].setBrand("엘지");
		phones[0].setPrice(1000000);
		phones[0].setSeries("1");
		
		int total = 0;
		for(int i = 0; i<phones.length; i++) {
			System.out.println(phones[i].information());
			total += phones[i].getPrice();
		}
		System.out.println("총가격 : " + total);
		System.out.println("평균 가격 : " + total / phones.length);
		
		Scanner sc = new Scanner(System.in);
		// 사용자에게 구매하고자 하는 핸드폰명을 입력받아
		// 해당 휴대폰을 찾은 후 그 가격을 알려주도록
		
		// 구매하고자 하는 휴대폰 이름 입력 : 벨벳폰
		// 당신이 구매하고자 하는 휴대폰의 가격은 1000000원입니다.
		
		System.out.print("구매하고자 하는 휴대폰 이름 입력 : ");
		String buyPhone = sc.nextLine();
		
		for(int i =0; i<phones.length; i++) {
			if(buyPhone.equals(phones[i].getName())) {
				System.out.println("당신이 구매하고자 하는 휴대폰의 가격은 " + phones[i].getPrice() + "원입니다.");
			} 
		}
		
		
		
		
		
		
		
	}

}
