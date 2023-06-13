package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {

	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();

	public void mainMenu() {
		// 메인 메뉴 출력
		while (true) {
			System.out.println("1. 지정 문자열");// tokenMenu()
			System.out.println("2. 입력 문자열");// inputMenu()
			System.out.println("9. 프로그램 끝내기");// "프로그램을 종료합니다" 출력후 종료
			System.out.print("메뉴 번호 : ");
			char input = sc.nextLine().charAt(0);// 메뉴 번호 입력 받음

			if (input == '1') {
				tokenMenu();
			} else if (input == '2') {
				inputMenu();
			} else if (input == '9') {
				System.out.println("프로그램을 종료합니다.");
				return;
			} else {
				System.out.println("잘못 입력하셨습니다 다시 입력해주세요.");
			}
		}

	}

	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		str = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : " + str);
		System.out.println("토큰 처리 후 개수 : " + str.length());
		System.out.println("모두 대문자로 변환: " + str.toUpperCase());
		// 여기서 다시 메뉴 돌아가게..

	}

	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		String put = tc.firstCap(sc.nextLine()); // 입력받은 값
		System.out.println("첫 글자 대문자 : " + put);
		System.out.print("찾을 문자 하나를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		tc.findChar(put, ch);
		
		System.out.println(ch + "가 들어간 개수 : " + tc.findChar(put, ch));
		// 여기서 다시 메뉴로 돌아가게 구현
	}

}
