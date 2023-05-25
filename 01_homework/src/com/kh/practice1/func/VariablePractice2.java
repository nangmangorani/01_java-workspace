package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public void calculate() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int firstNum = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int secondNum = sc.nextInt();
		
		int sum = firstNum + secondNum; 
		int minus = firstNum - secondNum; 
		int times = firstNum * secondNum;
		int devide = firstNum / secondNum;
		
		System.out.println("더하기 결과 : " + sum);
		System.out.println("더하기 결과 : " + minus);
		System.out.println("더하기 결과 : " + times);
		System.out.println("더하기 결과 : " + devide);
		
		sc.close();
		
		
	}

}
