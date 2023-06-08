package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.OverloadingTest;
import com.kh.chap06_method.controller.StaticMethod;

public class MethodRun {

	public static void main(String[] args) {

//		// -----------NonStaticMethod------------
		//NonStaticMethod n = new NonStaticMethod();
//		
//		// 1. 매개변수도 없고 반환값도 없는 메소드 호출
		//n.method1();
//		
//		// 2. 매개변수 없고 반환값은 있는 메소드 호출
		//n.method2();
////		String str = n.method2();
////		System.out.println(n.method2());
//		
//		// 3. 매개변수 있고 반환값은 없는 메소드 호출
		// n.method3(); -> 매개변수 없으면 오류남
//		// n.method3(10); -> 매개변수 개수 맞지 않으면 오류남
//		// n.method3("ㅋㅋ", "ㅎㅎ"); -> 매개변수 타입 맞지 않으면 오류
//		// int a = n.method3(10, 20); // int a 메모리가 생기는데 반환값이 없어서 값이 저장이 안됨! 값이 저장되려면 return 있어야 함.
//		n.method3(10, 5);
//		n.method3(10, 0);
//		
//		// 4. 매개변수도 있고 반환값도 있는 메소드 호출
////		char ch = n.method4("lemon", 1);
////		System.out.println(ch);
//		//System.out.println(n.method4("lemon", 1));
//		
//		// 사용자에게 매개변수(문자열, 정수값)를 입력받아서 해당 메소드를 호출
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("문자열 입력 : ");
//		String str = sc.nextLine();
//		
//		System.out.print("인덱스 입력 : ");
//		int index = sc.nextInt();
//		
//		// 여기서 유효성 검사 해보기
//		// index 0이상이면서 문자열의 길이보다 작을 때만!!
//		
//		if(index >=0 && index < str.length()) {
//			System.out.println("결과 : " + n.method4(str, index));
//		} else {
//			System.out.println("인덱스 값이 부적절합니다.");
//		}
		
		// -----------StaticMethod------------
		// 생성 없이 바로 호출 가능
		// Math.random();
		StaticMethod.method1();
		
		System.out.println(StaticMethod.method2()); // return 값은 출력하지 않으면 보이지 않음.
		StaticMethod.method3("차은우");
		
		System.out.println(StaticMethod.method4("apple", "kiwi"));
		
		
		// -----------OverloadingTest------------
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(10);
		ot.test(10, "ㅋㄷㅋㄷ");
		ot.test("ㅎㅅㅎ", 20);
		ot.test(10, 10);
		ot.test("차은우");
		// 메소드는 같은데 매개변수가 다름!!
		
		// 오버로딩의 대표적인 예 : print()
//		System.out.print(10);
//		System.out.print("ss");
//		System.out.print(0.0);
		
		
		
		
	}
	
	
		
	
	
	

}
