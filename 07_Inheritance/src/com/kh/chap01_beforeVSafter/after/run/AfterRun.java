package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {

		/*
		 * 상속의 장점
		 * - 보다 적은 양의 코드로 새로운 클래스 작성 가능
		 * - 중복된 코드를 별도로 관리하기 때문에 코드의 추가가 변경에 용이(프로그램의 생산성과 유지보수에 크게 기여)
		 * 
		 * 
		 */
		
		// Desktop 객체 생성 // import after로 제대로!!
		// brand, pCode, pName, price, allInOne
		Desktop d = new Desktop("삼성", "d-01", "짱짱데스크탑", 20000, true);
		
		// Tv 객체생성 // import after로 제대로!!
		// brand, pCode, pName, price, inch
		
		Tv t = new Tv("엘지", "t-01", "겁나 얇은 티비", 350000, 65);
		
		// SmartPhone 객체 생성 // import after로 제대로!!
		// brand, pCode, pName, price, mobileAgency
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰", 1300000, "KT");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		s.setPrice(1200000); // 부모클래스에 있는 메소드를 호출 가능
		s.setMobileAgency("SKT"); // 자식 클래스에 있는 메소드 호출
		
		System.out.println(t.information());
		
		/*
		 * 상속의 특징
		 * 자식객체를 가지고 부모클래스에 있는 메소드를 마치 내것처럼 호출 가능
		 * 부모클래스에 있는 메소드를 오버라이딩을 통해 자식 클래스에서 재정의
		 * 오버라이딩을 하는 순간 자식클래스에 있는 메소드 우선권을 가짐 (입맛대로 재정의)
		 * 클래스간의 상속은 다중상속이 불가능함!!!!!!! (단일 상속만 가능 ㅋ)
		 * 부모클래스에 정의되어있는 protected 필드는 자식클래스에서 직접 접근이 가능하다
		 * 명시되어있지 않지만 모든 클래스(제공하는 클래스, 직접 만든 클래스)는 Object 클래스의 후손이다.
		 * 즉, Object 클래스에 있는 메소드들 마음대로 호출가능
		 * 그리고 이것이 맘에 안들면 오버라이딩으로 재정의 가능
		 */
		
		
		
	}

}
