package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {
		
		// Desktop 객체 생성
		// brand, pCode, pName, price, allInOne
		
		Desktop d = new Desktop("삼성", "d-01", "짱짱데스크탑", 200000, true);
		
		// Tv 객체 생성
		// brand, pCode, pName, price, inch
		Tv t = new Tv("엘지", "t-01", "겁나 얇은 티비", 350000, 65);
		
		// SmartPhone 객체 생성
		// brand, pCode, pName, price, mobileAgency
		
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰", 1300000, "KT");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		// 유지보수 요청 : pName => productName 으로 바꿔라.. 제조일자 추가해라 세개 다..
		
		/*
		 * 세 클래스에 공통적인 필드와 메소드들이 존재함
		 * 이런 중복된 코드들을 따로 "부모 클래스로 한번만 정의해두면 중복된 코드들을 줄일 수 있다."
		 * => 수정, 유지보수 요청이 들어왔을 때 일일히 찾아서 수정할 필요없이
		 * 한번만 정의해둔 부모클래스만 수정하면 전체적으로 반영됨.
		 * 
		 * 세 클래스가 공통적으로 가지고 있는 것
		 * => brand, pCode, pName, price 필드들, setter / getter, information 메소드
		 * => Product 라는 공통클래스를 미리 정의해볼것.
		 */
		
		
	}

}
