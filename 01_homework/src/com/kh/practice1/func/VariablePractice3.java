package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void calculate() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		double area = width * height;// 면적
		double round = (2*width) + (2*height); // 둘레
		
		
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + round);
		sc.close();
	}

}
