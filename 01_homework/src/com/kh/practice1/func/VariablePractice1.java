package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	// 0. 메소드 생성
	public void information() {
		
		// 1. 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 2. 입력받기
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		String gender = sc.nextLine();
		
		System.out.print("나이을 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		
		
		// 3. 출력
		System.out.println("키 " + height + "cm인 " + age +"살 " + gender + "자 " + name + "님 반갑습니다.");
		
		// 4. 스캐너 종료
		sc.close();
	}
	
	
}
