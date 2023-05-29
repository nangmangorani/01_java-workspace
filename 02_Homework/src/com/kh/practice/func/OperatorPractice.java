package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		
		System.out.println((num > 0) ? "양수이다." : "양수가 아니다.");
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		System.out.println((num > 0) ? "양수이다." : (num==0) ? "0이다." : "양수가 아니다.");
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		System.out.println((num % 2 == 0) ? "짝수다." : "홀수다.");
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (candy / people));
		System.out.println("남은 사탕 개수 : " + (candy % people));
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		String result = (gender == 'M' || gender == 'm') ? "남" : (gender == 'F' || gender == 'f') ? "여" : "잘못입력";
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double achievement = sc.nextDouble();
		
		// d 정수 f 소수 s문자열 c문자 
		System.out.printf("%d%s %d%s %d%s %s %s%s %s %.2f%s",grade,"학년",classNum,"반",number,"번",name,gender,"학생의","성적은",achievement,"이다.");
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.println((age <= 13) ? "어린이" : (age >= 13 && age <= 19) ? "청소년" : "성인");
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		
		System.out.print("영어 : ");
		int english = sc.nextInt();
		
		System.out.print("영어 : ");
		int math = sc.nextInt();
		
		int sum = korean + english + math;
		double avg = (korean + english + math) / 3.0;
		
		String result = (avg >= 60 && korean>=40 && english >= 40 && math >= 40) ? "합격" : "불합격";
		
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println(result);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요 : ");
		char num = sc.nextLine().charAt(7);
		
		System.out.println((num == '1' || num == '3') ? "남자" : (num == '2' || num == '4') ? "여자" : "잘못입력");
	}
	
	public void practice9(){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : "  );
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		System.out.println((num3 <= num1 || num3 > num2) ? "true" : "false");
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		System.out.println((num1 == num2 && num2 == num3) ? true : false);
		
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int onlyA = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int onlyB = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int onlyC = sc.nextInt();
		
		double containA = onlyA + (onlyA * 0.4);
		double containB = onlyB;
		double containC = onlyC + (onlyC * 0.15);
		
		System.out.println("A사원 연봉/연봉+a : " + onlyA + "/" + containA);
		System.out.println((containA >= 3000) ? "3000 이상" : "3000 미만" );
		
		System.out.println("B사원 연봉/연봉+a : " + onlyB + "/" + containB);
		System.out.println((containB >= 3000) ? "3000 이상" : "3000 미만" );
		
		System.out.println("C사원 연봉/연봉+a : " + onlyC + "/" + containC);
		System.out.println((containC >= 3000) ? "3000 이상" : "3000 미만" );
	}

}
