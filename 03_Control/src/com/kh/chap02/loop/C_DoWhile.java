package com.kh.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {

	/*
	 * do-while 문
	 * 
	 * [표현법]
	 * do {
	 * 		반복적으로 실행할 코드(무조건 실행!!)
	 * 	  
	 * } while(조건식);
	 * 
	 * 첨에 무조건 실행코드 실행
	 * --> 조건식 검사 --> true일 경우 실행코드 실행
	 * --> 조건식 검사 --> true일 경우 실행코드 실행
	 * --> 조건식 검사 --> false일 경우 실행코드 실행x --> 반복문 빠져나감
	 * 
	 * 기존의 for / while문과의 차이점
	 * for / while문 같은 경우에는 조건 검사 후에 true여야만 수행
	 * 근데 do-while문은 조건검사 없이 무조건 한번은 수행함
	 * 
	 */
	
	public void method1() {
		int num = 1;
		do {
			System.out.println(num);
		} while(false); // false를 이렇게 줘도 한번은 수행됨.
	}
	
	public void method2() {
		// 1 2 3 4 5
		int i = 1;
		
		do {
			System.out.print(i + " ");
			i++;
		}while(i<=5); // 처음은 무조건 나오는데 그 이후로 조건을 벗어나면 출력을 안함.
		// 6이 되면 출력x
		
	}
	
	public void method3() {
		// 1부터 사용자가 입력한 수까지의 총합계
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		int i = 0;
		
		do {
			sum += i;
			i++;
		}while(i<=num);
		System.out.println("총합계 : " + sum);
	}
	
}
