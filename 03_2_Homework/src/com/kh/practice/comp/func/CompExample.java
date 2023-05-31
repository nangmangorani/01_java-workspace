package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 1) {
					System.out.print("박");
				} else {
					System.out.print("수");
				}
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					if (i % 2 == 1) {
						System.out.print("박");
					} else {
						System.out.print("수");
					}
				}
				break;
			} else {
				System.out.println("양수가 아닙니다.");
				continue;
			}
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		int count = 0;

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(str + "안에 포함된 " + ch + " 개수 : " + count);

	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);
		

		while (true) {
			int count = 0;
			System.out.print("문자열 : ");
			String str = sc.nextLine();

			System.out.print("문자 : ");
			char ch = sc.nextLine().charAt(0);
			
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ch) {
					count++;
				}
			}
			System.out.println(str + "안에 포함된 " + ch + " 개수 : " + count);
			
			System.out.print("더 하시겠습니까? (y/n) : ");
			String reGame = sc.nextLine();
			
			if(reGame.equals("y") || reGame.equals("Y")) {
				continue;
			} else if(reGame.equals("n") || reGame.equals("N")) {
				break;
			} else {
				while(true) {
					System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
					System.out.print("더 하시겠습니까? (y/n) : ");
					reGame = sc.nextLine();
					continue;
				}
				
				
			}

		}

	}
	

}
