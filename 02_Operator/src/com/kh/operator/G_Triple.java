package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	/*
	 * 삼항연산자 (항목 3개를 가지고 연산해주는 연산자)
	 * 
	 * [표현식]
	 * 조건식 ? 조건식이 참일경우 돌려줄 결과값 : 조건식이 거짓일 경우 돌려줄 결과값
	 * 
	 * 이때, 조건식은 반드시 true 또는 false가 나오도록 작성해야됨!!
	 * 주로 비교, 논리연산자를 통해 작성.
	 * 
	 * 
	 */
	
	public void method1() {
		// 입력받은 정수의 값이 양수인지 아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		// String result = (num > 0) ? "양수입니다." : "양수가 아닙니다.";
		// xx은(는) 양수입니다.
		// String result = (num > 0) ? num + "은 양수입니다." : num + "은 양수가 아닙니다.";
		System.out.println(num + "은(는)" + ((num > 0) ? "양수입니다." : "양수가 아닙니다.")); 
		
		//System.out.println(result);
		
	
	}
	
	public void method2() {
		// 입력받은 정수값이 짝수인지 홀수인지 판별 후
		// 3은 홀수입니다. 4는 짝수입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.println(num + "은(는)" + ((num % 2 == 0) ? " 짝수입니다." : " 홀수입니다."));
	}
	
	public void method3() {
		// 사용자에게 종료여부를 입력받아 판별해서 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료하시려면 y를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0); // Y y
		
		String result = (ch == 'y' || ch == 'Y') ? "프로그램을 종료합니다." : "계속 진행하겠습니다.";
		System.out.println(result);
		
		
	}
	
	public void method4() {
		// 영문자 입력받아서 영어 소문자인지 아닌지 판별 후 출력
		// a는 소문자입니다. F는 소문자가 아닙니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳을 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println(ch + "은(는)" + ((ch >= 'a' && ch <= 'z') ? "소문자입니다." : "소문자가 아닙니다."));
		
		
	}
	
	public void method5() {
		// 양수(+5), 음수(-55), 0(0)
		// 삼항연산자 중첩!
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수입니다." : (num == 0) ? "0입니다." : "음수입니다.";
		System.out.println(result);
	}
	
	public void method6() {
		// 사용자한테 두개의 정수를 입력 받고
		// + 또는 -를 입력받아 그에 맞는 연산결과 출력
		// + 또는 - 이외의 다른 문자를 입력했을 경우 "잘못 입력했습니다."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		// 버퍼에 남아있는 엔터 제거
		sc.nextLine();
		
		System.out.print("연산자 입력(+ 또는 -) : ");
		char op = sc.nextLine().charAt(0);
		
		String result = (op == '+') ? (num1 + num2 + "") : (op == '-') ? (num1 - num2 + "") : "잘못 입력했습니다.";
		
		System.out.println("결과 : " + result);
		
	}
	
}
