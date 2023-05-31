package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	
	/*
	 * while문
	 * 
	 * [표현법]
	 * 
	 * [초기식;]
	 * while(조건식){
	 * 	 반복적으로 실행할 코드;
	 * 	 [증감식;]
	 * }
	 * 
	 * 조건식이 true일 경우 해당코드 실행
	 * 
	 * 조건식 검사 --> true일 경우 실행코드를 실행
	 * 조건식 검사 --> true일 경우 실행코드를 실행
	 * 조건식 검사 --> false일 경우 실행코드 실행 x => 반복문 빠져나감
	 * 
	 * 
	 */
	
	public void method1() {
		// 안녕하세요 5번 출력
		
		int i = 1;
		
		while(i <= 5) {
			System.out.println("안녕하세요");
			i++; // 증감식
		}
		
		// for문과 다른점! i값 출력가능
		System.out.println(i);
	}
	
	public void method2() {
		// 1 2 3 4 5
		int i = 1;
		while(i<=5) {
			//System.out.print(i + " ");
			//i++;
			
			//후위연산자로 표현해보기
			System.out.print(i++ + " "); // 위의 두줄을 다음과 같이 한줄로 줄일 수 있음
			
		
		}
	}
	
	public void method3() {
		// 1에서부터 10사이의 홀수 만을 출력
		// 1 3 5 7 9
		int i = 1;
//		while(i<10) {
//			System.out.print(i + " ");
//			i+=2;
//			
//		}
		
		while(i<=9) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
			i++;
		}
	}
	
	public void method4() {
		// 1부터 랜덤값(1~100)까지의 합계
		// 랜덤값 구하는 공식 => Math.random() 시작수는 더하고 랜덤수의 개수는 곱한다.
		// 누적합 공식 => sum변수를 만들고, while문 돌리기, sum += i
		int random = (int)(Math.random() * 100 + 1);
		
		int sum = 0;
		int i = 1;
		
		while(i <= random) {
			sum += i;
			i++;
		}
		System.out.println("1부터 " + random + "까지의 합 : " + sum);
	}
	
	public void method5() {
		// A_For 클래스에 method11 while문으로 표현
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.println("문자열의 길이 : " + str.length());
		
		while(i<str.length()) {
			System.out.println(str.charAt(i));
			i++;
		}
		
	}
	
	
	
	

}
