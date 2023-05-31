package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
	 * 반복문
	 * 프로그램 흐름을 제어하는 제어문 중 하나
	 * 어떤 실행코드를 반복적으로 수행시켜줌
	 * 
	 * 크게 두 종류로 나뉨 (for문 / while문(do-while문))
	 * 
	 * for문
	 * 
	 * [표현법]
	 * for (초기식; 조건식; 증감식) { // 반복 횟수를 지정하기 위해 제시하는 것들
	 * 		반복적으로 실행시키고자 하는 구문;
	 * }
	 * 
	 * - 초기식 : 반복문이 수행될 때 "처음에 단 한번만 실행되는 구문"
	 * 			(보통 반복문 안에서 사용될 변수를 선언 및 초기화 하는 구문)
	 * 
	 * - 조건식 : "반복문이 수행될 조건"을 작성하는 구문
	 * 			조건식이 true일 경우 해당 구문을 실행
	 * 			조건식이 false가 되는 순간 반복을 멈추고 빠져나옴
	 * 			(보통 초기식에 제시된 변수를 가지고 조건식 작성함.)
	 * 
	 * - 증감식 : 반복문을 제어하는 변수값을 증감시키는 구문
	 * 			(보통 초기식에 제시된 변수를 가지고 증감연산자(++ --)를 사용함)
	 * 
	 */
	
	public void method1() {
		// "안녕하세요"를 5번 반복해서 실행하기
		
		for(int i = 1; i<= 5; i++) { // i값이 1에서부터 5까지 매번 1씩 증가하는 동안 반복 수행(1,2,3,4,5 -> 5회 수행)
			
			// 반복할 코드 작성
			System.out.println("안녕하세요");
		}
		
		for(int i = 0; i <= 4; i++) { // i값이 0에서부터 4까지 1씩 증가하는 동안 반복 수행(0,1,2,3,4 -> 5회 수행)
			
			System.out.println("반갑습니다.");
		}
		
		for(int i = 11; i <= 15; i++) { // i값이 11에서 15까지 매번 1씩 증가하는 동안 반복수행
			System.out.println("저리가세요.");
		}
		
		for(int i = 1; i <= 9; i+=2) { // 5번 수행
			System.out.println("Hello"); // i값이 1에서 9까지 매번 2씩 증가하는 동안 반복 수행(1,3,5,7,9일 때 5회 수행)
			
		}
		
	}
	
	public void method2() {
		// 1부터 5까지 출력
		for(int i =1; i<=5; i++) {
			System.out.println(i);
		}
	}
	
	// 1 2 3 4 5(사이 사이 공백)
	
	public void method3() {
		for (int i = 1; i<=5; i++) {
			System.out.print(i + "");
		}
	}
	
	
	public void method4() {
		for(int i = 5; i>=1; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void method5() {
		// 1부터 10까지의 홀수만 출력
		
//		for(int i =1; i<=10; i+=2) { // 1에서 10까지 2씩 증가되는 동안 반복 수행(1,3,5,7,9 -> 5번 돌고 끝)
//		
//			System.out.print(i + " ");
//		}
		
		for(int i = 1; i<=10; i++) { // 1~10까지 1씩증가 (10번 돌아감)
			if(i % 2 == 1) {				
				System.out.print(i + " ");
			}
		}
		
	}
	
	public void method6() {
		// 1~10 for문 고정
		for(int i = 0; i <=9; i++) {
			System.out.print((i+1) + " ");
		}
	}
	
	public void method7() {
		// 1에서 10까지의 총 합계
		
		// 1. int sum = 1+2+3+...9+10;
		
		// 2.
		/*
		 * int sum = 0;
		 * sum += 1; => sum = sum + 1; 0 + 1
		 * sum += 2; => sum = sum + 2; 0 + 1 + 2
		 * sum += 3; => sum = sum + 3; 0 + 1 + 2 + 3
		 * ...
		 * sum += 9;
		 * sum += 10;
		 * 
		 * 규칙을 찾자!!
		 * sum 변수에 누적해서 합산하는게 반복적으로 진행됨.
		 * 단, 누적해서 더하고자 하는 값이 1에서부터 10까지 1씩 증가되는걸 파악할 수 있음
		 * 
		 * 
		 */
		
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum += i; // 누적합 공식
		}
		
		System.out.println("1부터 10까지의 합 : " + sum);
		
	}
	
	public void method8() {
		
		/*
		 * int sum = 0;
		 * 
		 * sum += 1;
		 * sum += 2;
		 * 
		 * sum += i;
		 * 
		 */
		
		// 사용자에게 값을 입력 받아 1부터 입력받은 수까지의 합계 출력
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1 이상의 정수를 입력하세요 : ");
			int num = sc.nextInt(); // 7
			
			if(num > 0) {
				// 누적합
				// 1. sum 변수 만들기
				int sum = 0;
				
				// 2. for문 돌리기
				for(int i = 1; i <= num; i++) {
					// 누적합 공식
					sum += i;
				}
				System.out.println("1부터 " + num + "까지의 합 : " + sum);
				break;
					
			} else {
				System.out.println("잘못입력했습니다. 다시입력해주세요");
			}
		}
		
		
		
	}
	
	public void method9() {
		// 1에서부터 어떤 랜덤값(1~10 사이 랜덤값) 까지의 총합계
		
		// 자바에서 제공하는 클래스 (Math)
		
		/*
		 * java.lang.Math 클래스에서 제공하는 random() 메소드를 호출해서
		 * 매번 다른 랜덤값을 얻어낼 수 있음.
		 * Math.random(); 이런식으로 호출 => 0.0~0.999999 사이의 랜덤값 발생
		 * 								(0.0 <=  <1.0)
		 */
		
		// int random = Math.random(); -> double형이라 안됨.
		//				
		
		// int random = Math.random() * 10;
		// 0.0 ~ 9.99999
		// int random = Math.random() * 10 + 1;
		//				1.0~11.0     1.0 ~ 10.9999
		int random = (int)(Math.random() * 10 + 1); // 시작수는 더하고 개수를 곱한다.
		//				1~11             1~10
		System.out.println("1~10 사이의 랜덤값 : " + random);
	
		// 누적합 구하는 방법
		// 1. sum 변수 만들기
		int sum = 0;
		
		// 2. for문 돌리기
		for(int i =1; i<=random; i++) {
			// 누적합 공식
			sum += i;
		}
		
		// 1부터 random 까지 합계
		System.out.println("1부터 " + random + "까지의 합계 : " + sum);
		
	}
	
	public void method10() {
		String str = "Hello";
		
		// 각 인덱스별 문자를 뽑아서 출력
		/*
		 * H = str.charAt(0); 출력
		 * e = str.charAt(1); 출력
		 * l = str.charAt(2); 출력
		 * l = str.charAt(3); 출력
		 * o = str.charAt(4); 출력
		 * 
		 */
		
		for(int i = 0; i<5; i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public void method11() {
		// 사용자에게 문자열 입력 받아서 (str변수에 대입)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		// 각 인덱스별 문자를 뽑아서 출력
		
		// apple의 길이 : 5글자
		// 01234
		
		// strawberry : 10글자
		// 0123456789
		
		// kiwi : 4글자
		// 0123
	
		// 마지막 인덱스는 항상 (문자열의 길이 - 1) 이구나..
		// 추출하고자 하는 인덱스값이 (문자열의 길이 -1) 까지 매번 1씩 증가
		System.out.println("문자열의 길이 : " + str.length());
		
		for(int i = 0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
	}
	
	public void method12() {
		// 구구단 출력
		// 2단 출력하기
		
		/*
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * 2 x 3 = 6
		 * ..
		 * 2 x 8 = 16
		 * 2 x 9 = 18
		 */
		
		for(int i = 1; i<10; i++) {
			//System.out.println("2 x " + i + " = " + (2*i));
			System.out.printf("%d x %d = %d\n",2,i,2*i);
		}
		
	}
	
	public void method13() {
		// 사용자에게 단을 입력 받아 구구단을 출력
		// int dan;
		// 2~9 사이의 정수를 입력 = 가이드 문구
		// 다른 숫자를 입력한 경우 : 2~9 사이의 숫자를 입력해주세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2~9 사이의 정수를 입력 : ");
		int dan = sc.nextInt();
		
		// for문으로 1~9를 i로 곱하고, dan을 넣어주기만하면됨
		
		if(dan >= 2 && dan <= 9) {
			for(int i =1; i<=9; i++) {
				System.out.println(dan + " x " + i + " = " + (dan * i));
			}
		} else {
			System.out.println("2~9 사이의 숫자를 입력해주세요");
		}
		
	}
	
	public void method14() {
		// 2부터 9 사이의 랜덤값 발생시켜서 랜덤단 출력하기
		int dan = (int)(Math.random() * 8 + 2);	// 2가 시작수, 시작수로부터 몇개의 랜덤값 발생시킬지 곱하면 된다.
	
		for(int i = 1; i<10; i++) {
			System.out.println(dan + " x " + i + " = " + (dan * i));
		}
		
	}
	
	public void method15() {
		// 1 2 3 4 5
		for(int j = 1; j <=3; j++) { // 3번 반복
			for (int i = 1; i<=5; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}
	
	public void method16() {
		// ****
		// ****
		// ****
		// ****
		
		// 행은 1~4까지 반복 => 바깥쪽 for문
		// 매 행 고정일 때 열은 1~4까지 반복 => 안쪽 for문
		
		for(int j = 0; j<4; j++) {
			for(int i =0; i<4; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void method17() {
		// 1*** => 1행 1열일때
		// *2** => 2행 2열일때
		// **3* => 3행 3열일때
		// ***4 => 4행 4열일때
		
		for(int i =1; i<=4; i++) {
			for(int j =1; j<=4; j++) {
				if(i==j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
	}
	
	public void method18() {
		// 2단부터 9단까지 싹 다 출력
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println();
		}
	}
	
	public void method19() {
		for(; ;) { // 조건 생략하면 기본적으로 true => 무한반복문
			
		}
	}
	
}


