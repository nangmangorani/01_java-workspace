package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num == 1) {
			System.out.println("입력 메뉴입니다.");
		} else if(num == 2) {
			System.out.println("수정 메뉴입니다.");
		} else if (num == 3) {
			System.out.println("조회 메뉴입니다.");
		} else if (num == 4) {
			System.out.println("삭제 메뉴입니다.");
		} else if (num == 7) {
			System.out.println("조회 메뉴입니다.");
			System.out.println("프로그램이 종료됩니다.");
		}
		
	}
	public void practice2(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();

		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		
		int sum = korean + math + english;
		double avg = sum / 3.0;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		if(avg >= 60 && korean>=40 && math>=40 && english>= 40) {
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 12 : 
		case 1 : 
		case 2 : 
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 3 :
		case 4 :
		case 5 :	
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6 :
		case 7 :
		case 8 :	
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println(month + "월은 가을입니다.");
			break;
			
		default :
			System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		if(id.equals("myId") && pw.equals("myPassword12")) {
			System.out.println("로그인 성공");
		} else if (id.equals("myId")){
			System.out.println("비밀번호가 틀렸습니다.");
		} else if (pw.equals("myPassword12")) {
			System.out.println("아이디가 틀렸습니다.");
		}
		
//		if(id.equals("myId")) {
//			if(pw.equals("myPassword12")) {
//				System.out.println("로그인 성공");
//			} else {
//				System.out.println("비밀번호가 틀렸습니다.");
//			}
//		} else {
//			System.out.println("아이디가 틀렸습니다.");
//		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String member = sc.nextLine();
		
		switch(member) {
		case "관리자" : 
			System.out.print("회원관리, 게시글 관리 ");
		case "회원" :
			System.out.print("게시글 작성, 게시글 조회 ");
		case "비회원" : 
			System.out.print("게시글 조회");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if(bmi < 23) {
			System.out.println("정상체중");
		} else if(bmi < 25) {
			System.out.println("과체중");
		} else if(bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String operator = sc.nextLine();
		
		switch(operator) {
		case "+" :
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case "-" :
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case "*" :
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case "/" :
			// 정수 %d 소수 %f 문자열 %s 문자 %c 
			System.out.printf("%d %s %d %s %f",num1,operator,num2,"=",(double)num1 / (double)num2);
			break;
		case "%" :
			System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
			break;
		
		}
		
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("중간고사 점수 : ");
		int midtermExam = sc.nextInt();
		System.out.print("기말고사 점수 : ");
		int finalExam = sc.nextInt();
		System.out.print("과제점수 : ");
		int assignment = sc.nextInt();
		System.out.print("출석횟수 : ");
		int attendance = sc.nextInt();
		
		System.out.println("======================");
		
		double midPoint = midtermExam * 0.2;
		double finalPoint = finalExam * 0.3;
		double assignmentPoint = assignment * 0.3;
		double attendancePoint = attendance;
		double sum = midPoint + finalPoint + assignmentPoint + attendancePoint; 
		
		// 20 * 0.3
		System.out.println("중간고사 점수(20) : " + midPoint);
		System.out.println("기말고사 점수(20) : " + finalPoint);
		System.out.println("과제점수   (20) : " + assignmentPoint);
		System.out.println("출석점수   (20) : " + attendancePoint);
		System.out.println("총점 : " + sum);
		if(sum >= 70 && attendance >= (20-(20 * 0.3))) {
			System.out.println("Pass");
		} else if(sum >= 70 && attendance < (20-(20 * 0.3))) {
			System.out.println("Fail [출석 회수 부족 (" + attendance + "/20)]" ); // 여기다시
		} else if(sum < 70 && attendance >= (20-(20 * 0.3))) {
			System.out.println("Fail [점수 미달]");
		}
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		
		ControlPractice go = new ControlPractice();
		switch(num) {
		case 1:
			go.practice1();
			break;
		case 2:
			go.practice2();
			break;
		case 3:
			go.practice3();
			break;
		case 4:
			go.practice4();
			break;
		case 5:
			go.practice5();
			break;
		case 6:
			go.practice6();
			break;
		case 7:
			go.practice7();
			break;
		case 8:
			go.practice8();
			break;
		case 9:
			go.practice9();
			break;
		
		}
	}
	
}
