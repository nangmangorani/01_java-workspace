package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {
		
		// 기억해둘것!! : = 기준으로해서 왼쪽과 오른쪽의 자료형(타입)은 같아야함.
		
		System.out.println("1. 부모타입 레퍼런스로 부모객체를 다루는 경우");
		Parent p1 = new Parent();
		p1.printParent();
		// p1 레퍼런스로 Parent에만 접근 가능
		
		System.out.println("2. 자식타입 레퍼런스로 자식객체를 다루는 경우");
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent(); // 상속받았으니까 ㄱㄴ. 자동형변환 된거임. (Child1 => Parent)
		//((Parent)c1).printParent(); -> 사실 이거임
		// c1 레퍼런스로 Child1, Parent 둘 다 접근 가능
		// Parent 접근시 자동으로 형 변호나 된 채 진행된거임.
		
		System.out.println("3. 부모타입 레퍼런스로 자식객체를 다루는 경우(다형성)");
		Parent p2 = /*(Parent)*/new Child1(); // 자료형이 다르다? => 에러안뜸! => 자동형변환 된거임
		p2.printParent();
		//p2.printChild1(); -> p2는 엄연히 Parent임 자식메소드 못씀
		((Child1)p2).printChild1(); // 강제형변환하면 호출은 가능!!
		
		
		// p2 레퍼런스로 지금 당장은 Parent에만 접근 가능하지만
		// Child1에 접근하고자 한다면 강제형변환을 하면 접근은 가능!!
		
		/*
		 * 상속구조의 클래스들 간에는 형변환 가능
		 * 
		 * 1. UpCasting -> 자식이 부모행세하는 것
		 * 				   자식타입 -> 부모타입 형변환
		 * 				   자동형변환
		 * 				   ex) 자식.부모메소드();
		 * 2. DownCasting -> 부모가 자식행세하는 것
		 * 					 부모타입 -> 자식타입 형변환
		 * 					 강제형변환
		 * 					 ex) ((자식)부모).자식메소드();
		 */
		
		// String str = (String)new Child1(); 상속구조일때만 되는거라 이런거는 안됨
		// 다형성 정의
		// - 부모타입으로부터 파생된 여러가지 타입의 자식객체들을 부모클래스 타입하나로도 다룰 수 있다.
		
		// 다형성을 쓰는 목적
		
		// 다형성을 배우기전..
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1,2,4);
		arr1[1] = new Child1(2,3,5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(2,1,5);
		arr2[1] = new Child2(5,7,2);
		
		// ----------------------------------------------
		
		// 다형성(부모타입 레퍼런스)을 적용한 후....
		Parent[] arr = new Parent[4];
		// Parent 타입
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(2, 1, 5);
		arr[2] = new Child1(5, 7, 2);
		arr[3] = new Child2(2, 3, 5);
		// 하나의 부모타입만으로 여러 자식 객체들을 받을 수 있음 => 편리하다, 코드길이 감소
		
		System.out.println("======================================");
		// arr[0].printChild1(); 되겠냐?
		((Child1)arr[0]).printChild1(); // 이건된다고
		// arr[1].printChild2(); 당연히 x
		((Child2)arr[1]).printChild2();
		//((Child1)arr[2]).printChild2(); 되겠냐고
		//((Child2)arr[2]).printChild2();
		//java.lang.ClassCastException: 부적절한 형변환! 1로했으면서 왜 2로함?
		//arr[3]
		((Child2)arr[3]).printChild2();
		
		System.out.println("============= 반복문 이용해서 출력 ==============");
		
		for(int i =0; i<arr.length; i++) {
			
			/*
			 * instanceof 연산자 => 연산결과 true / false 반환
			 * 현재 레퍼런스가 실질적으로 어떤 클래스 타입을 참조하는지 확인할 때 사용
			 */
			
//			if(i == 0 || i == 2) {
//				((Child1)arr[i]).printChild1();
//			} else {
//				((Child2)arr[i]).printChild2();
//			}
			
			if(arr[i] instanceof Child1) { // 해당 레퍼런스가 실제 Child1 참조하고 있다면 true 아니면 false
				((Child1)arr[i]).printChild1();
			} else {
				((Child2)arr[i]).printChild2();
			}
		} // 양다리 => 공유 : 연상(오빠) , 차은우 : 연하(은우야)
		
//		Parent pp = new Child1();
//		pp.print();
		
		/*
		 * 바인딩은 연결?
		 * 동적바인딩 : 프로그램이 실행되기 전에는 컴파일이 되면서 정적바인딩 (레퍼런스 타입의 메소드를 가리킴)
		 * 			 단, 실질적으로 참조하는 자식클래스에 해당 메소드가 오버라이딩 돼있다면 
		 * 			 프로그램 실행시 동적으로 그 자식클래스의 오버라이딩된 메소드를 찾아서 실행
		 * 
		 * 
		 */
		
		//int a = "sss"; 컴파일중 문제 판별해서 이건 바로 오류 
		
		System.out.println("===================================");
		for(int i =0; i<arr.length; i++) {
			arr[i].print();
		}
		
	}

}
