package com.kh.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1(){
		int[] arr = new int[10];
		for(int i =0;i<arr.length;i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice2(){
		int[] arr = new int[10];
		for(int i =0;i<arr.length;i++) {
			arr[i] = 10-i;
			System.out.print(arr[i] + " ");
		}
	
	}
	
	public void practice3(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i =0; i<num; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice4(){
		String[] arr = {"사과","귤","포도","복숭아","참외"};
		System.out.println(arr[1]);
		
	}
	
	public void practice5(){
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] arr = new char[str.length()];
		String index = "";
		
		for(int i = 0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
			if(arr[i] == ch) {
				count++;
				index += i + " ";
				
				
			}
		}
		System.out.println("application에 " + ch + "가 존재하는 위치(인덱스) : " + index);
		System.out.println(ch + " 개수 : " + count);
	}
	
	public void practice6(){
		String[] arr = {"월","화","수","목","금","토","일"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num >= 0 && num <=6) {
			System.out.println(arr[num] + "요일");
		} else {
			System.out.println("잘못입력했습니다.");
		}
		
		
	}
	
	public void practice7(){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		int[] arr = new int[num];
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("총 합 : " + sum);
	}
	
	
	public void practice8(){
		Scanner sc = new Scanner(System.in);
		int num =0;
		
		while(true) {
			System.out.print("정수 : ");
			num = sc.nextInt();
			if(num % 2 == 0 && num < 3) {
				System.out.println("다시 입력하세요.");
				continue;
			} else {
				break;
			}
		}
		
		int[] arr = new int[num];
		// 배열의 012까지는 증가 그 이후로 1씩 감소
		// 나누기를 해서 그값까지 해당되면 쭉 가다가 그 외에는 1씩감소하게끔
		
		for(int i =0; i<num; i++) {
			if(i <= num / 2) {
				arr[i] = i+1;
			} else {
				arr[i] = num - i;
			}
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] menu = {"후라이드", "양념", "간장"};
		boolean a = false;
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();
		
		
		for(int i=0; i<menu.length;i++) {
			
			if(menu[i].equals(chicken)) {
				System.out.println(chicken + "치킨 배달 가능");
				a = true;
				break;
			}
			
		}
		if(a == false) {
			System.out.println(chicken + "치킨은 없는 메뉴입니다.");
		}
		
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String num = sc.nextLine();
		char[] ch = num.toCharArray();
		char[] chCopy = new char[ch.length];
		String num2 = "";
		
		for(int i=0; i<ch.length;i++) {
			if(i < 8) {
				chCopy[i] = ch[i];
			} else {
				chCopy[i] = '*';
			}
			
			num2 += chCopy[i];
		}
		System.out.println(num2);
	
	}
	
	public void practice11() {
		int[] arr = new int[10];
		String answer = "";
		
		for(int i =0; i<arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
			answer += arr[i] + " ";
		}
		System.out.println(answer);

	}
	
	public void practice12() {
		int[] arr = new int[10];
		int max = 0;
		int min = 10;
		String answer = "";
		
		for(int i =0; i<arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
			answer += arr[i] + " ";
		}
		System.out.println(answer);
		for(int i =0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
			
		}
		
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
	public void practice13() {
		int[] arr = new int[10];
		boolean back;
		
		for(int i =0; i<arr.length; i++) { // 배열에 난수를 넣음.
			back = true; // 얘가 false가 되면 중복된거임. 
			int random = (int)(Math.random() * 10 + 1); // 난수생성, 
			arr[i] = random; // 이렇게하면 각 자리에 난수가 들어가는건데 조건이있잖아. 먼저 넣는 개념이 괜찮나??
			int count = 0; // 중복되면 1 더해지는새끼
			for(int j = 0; j<i; j++) { // =을 안쓰는 이유는 같은항 비교 x
				if(arr[i] == arr[j]) { // arr이 3까지 있다면 0,1,2를 3이랑 다비벼서
					count++; // 중복되면 플플
					if(count>=1) { // 하나라도 중복되면 바로 반복문탈출
						back = false;
						break;
					}
				}
			}
			if(back == false) { //반복문 탈출 후 해당 i값에선 i를 1을빼야함. 다시 돌려야되니께
				i--;
				continue;
			}
			
			
		}
		
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice14() {
		int[] arr = new int[10];
		boolean back;
		
		for(int i =0; i<arr.length; i++) { // 배열에 난수를 넣음.
			back = true; // 얘가 false가 되면 중복된거임. 
			int random = (int)(Math.random() * 10 + 1); // 난수생성, 
			arr[i] = random; // 이렇게하면 각 자리에 난수가 들어가는건데 조건이있잖아. 먼저 넣는 개념이 괜찮나??
			int count = 0; // 중복되면 1 더해지는새끼
			for(int j = 0; j<i; j++) { // =을 안쓰는 이유는 같은항 비교 x
				if(arr[i] == arr[j]) { // arr이 3까지 있다면 0,1,2를 3이랑 다비벼서
					count++; // 중복되면 플플
					if(count>=1) { // 하나라도 중복되면 바로 반복문탈출
						back = false;
						break;
					}
				}
			}
			if(back == false) { //반복문 탈출 후 해당 i값에선 i를 1을빼야함. 다시 돌려야되니께
				i--;
				continue;
			}
			
			
		}
		Arrays.sort(arr);
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	
		
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		int count = 0;

		System.out.print("문자열에 있는 문자 : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			
			boolean flag = true;
		
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i])
					flag = false;
			}
			
			if (flag) {
				if (i == 0)
					System.out.print(arr[i]);
				else
					System.out.print(", " + arr[i]);
	                
				count++;
			}
		}

		System.out.println("\n문자 개수 : " + count);
		
		sc.close();
		
		
		
	
		
		
		
		
	}
	
	
	
	
	public void practice16(){
		String answer = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		
		
		while(true) {
			
			if(answer.equals("")) {
				;
			} else {
				answer += ", ";
			}
			int arrNum = sc.nextInt();
			sc.nextLine();
			
			for(int i =1; i<=arrNum; i++) {
				System.out.print(i + "번째 문자열 : ");
				
				if(i != arrNum) {
					answer += sc.nextLine() + ", ";
				} else {
					answer += sc.nextLine();
				}
				
			}
			System.out.print("값 더 입력함?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			if(ch == 'Y' || ch == 'y') {
				System.out.print("더 입력하고싶은 개수 : ");
				continue;
			} else {
				System.out.println("[" +answer + "]");
				break;
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
