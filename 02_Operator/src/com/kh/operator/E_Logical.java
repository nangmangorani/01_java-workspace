package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	
	/*
	 * 논리연산자(이항연산자)
	 * 두 개의 논리값(true, false)을 연산해주는 연산자
	 * 논리연산한 결과마저도 논리값임!
	 * 
	 * 논리값 && 논리값 : 왼쪽과 오른쪽 둘다 true일 경우 결과값은 true
	 * 논리값 || 논리값 : 왼쪽과 오른쪽 둘 중에 하나라도 true일 경우 결과값은 true
	 * 
	 * 
	 * 
	 */
	
	public void method1() {
		// 사용자가 입력한 정수값이 1부터 100사이의 값인지를 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
        // boolean result = (1 <= num <= 100);
		boolean result = (num >= 1)  && (num <= 100); // num 값이 1이상"이고" 100이하일 경우
		// && 의미 : ~이고, 그리고 ~하면서
		
		System.out.println("사용자가 입력한 값이 1이상 100이하입니까? : " + result);
		
		// && : 두 개의 조건 모두가 전부 true여야 && 연산 결과값이 최종적으로 true
		// 		둘 중 하나라도 false가 있을 경우 && 연산의 결과값은 false
		
		
	}
	
	public void method2() {
		// 사용자가 입력한 문자값이 영어 대문자인지 확인
		// 'A' ~ 'Z' : 65~90
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나 입력 : ");
		
		char ch = sc.nextLine().charAt(0);
		
		// 첫번째 방법
		// boolean result = (ch >= 65) && (ch <= 90);
		
		// System.out.println("사용자가 입력한 값이 대문자입니까? : " + result);
		
		// 2번째 방법
		boolean result = (ch >= 'A') && (ch <= 'Z');
		System.out.println("사용자가 입력한 값이 대문자입니까? : " + result);
		
	}
	
	public void method3() {
		// 사용자에게 성별을 입력받은 후 여자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별을 입력해주세요 (M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		boolean result = (gender == 'F') || (gender == 'f');
		// || 의미 : ~이거나, 또는~
		
		System.out.println("사용자가 여자 입니까? : " + result);
		
		// || : 두개의 조건 중 하나라도 true가 있다면 || 연산 결과값은 true
		// 		두개의 조건 모두 false || 연산의 결과값이 false
		
	}
	
	public void method4() {
		// 사용자에게 입력을 받아 게임을 종료하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("게임을 종료하시려면 y를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'y') || (ch == 'Y');
		
		System.out.println("사용자가 입력한 값이 y또는 Y입니까? : " + result);
		
	}
	
	/*
	 * && : 두개의 조건이 모두 true여야 결과값이 true임(AND == ~이고, 그리고, ~이면서, 뿐만아니라)
	 * 
	 * true && true => true
	 * true && false => false
	 * false && true => false
	 * false && false => false
	 * 
	 * && 연산자를 기준으로 앞의 결과가 false일 경우 뒤의 조건은 굳이 실행하지 않는다!!!!!!!!!!!!!!!
	 * 
	 * || : 두개의ㅏ 조건중 하나라도 true라면 결과값이 true임 (OR == 또는, ~이거나)
	 * 
	 * true || true => true
	 * true || false => true
	 * false || true => true
	 * false || false => false
	 * 
	 * || 연산자 기준으로 앞의 결과가 true일 경우 뒤의 조건 굳이 실행하지 않음.
	 * 
	 * 
	 * 
	 */
	public void method5() {
		int num = 10;
		//boolean result1 = (num < 5) && (++num > 0); // 10 (뒤를 안읽으니까)
		boolean result1 = (num > 5) && (++num > 0); // 11
		
		System.out.println("result1 : " + result1);
		System.out.println("&& 연산 후의 num값 : " + num);
		
		int num2 = 10;
		// boolean result2 = (num2 > 20) || (++num2 > 0);
		boolean result2 = true || (++num2 > 0); // deadcode => 절대로 실행될리 없는 코드
		
		System.out.println("result2 : " + result2);
		System.out.println("&& 연산 후의 num2값 : " + num2);
		
	}
	
}
