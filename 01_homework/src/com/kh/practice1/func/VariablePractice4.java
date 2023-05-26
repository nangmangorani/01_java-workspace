package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	
	// 메소드 생성
	public void insert() {
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력받기, 변수로 저장
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		
		// 출력
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
		
		// 스캐너 닫기
		sc.close();
	}
}
