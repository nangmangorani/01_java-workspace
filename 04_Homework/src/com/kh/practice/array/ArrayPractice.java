package com.kh.practice.array;

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
		System.out.println("총합 : " + sum);
	}
	
	
	public void practice8(){
		Scanner sc = new Scanner(System.in);
		int num =0;
		
		while(true) {
			System.out.print("정수 : ");
			num = sc.nextInt();
			if(num % 2 == 0 || num < 3) {
				System.out.println("다시 입력하세요.");
				continue;
			} else {
				break;
			}
		}
		
		int[] arr = new int[num];
		// 배열의 012까지는 증가 그 이후로 1씩 감소
		// 나누기를 해서 그값까지 해당되면 쭉 가다가 그 외에는 1씩감소하게끔
		// 여기서 새로운 int 객체 = 1 만들고 ++ -- 해서 풀수있음.
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
	
	public void practice13(){
		int[] arr = new int[10];
		
		for(int i =0; i<arr.length; i++) {
			
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
			for(int j = 0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}

	}
	
	public void practice14() {
		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			
			int random = (int) (Math.random() * 45 + 1);
			arr[i] = random;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}

		}

		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		
	}
	
	public void practice15() {
//		String answer = ""; // 문자열에 있는 문자 출력위해서.
//		int count = 0; // 숫자 세
//		
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("문자열 : ");
//		String str = sc.nextLine(); // a p p l i c a t i o n
//		
//		char[] ch = new char[str.length()];
//		
//		for(int i =0; i<ch.length; i++) { // i=0 => a 가 들어감  i=1에서 p가 들어감.
//			ch[i] = str.charAt(i);
//			
//			boolean same = true;
//			
//			for(int j =0; j<i; j++) { // j에서 0은 일단 그냥 패스  i가 1이면 j=0이랑 i 0비교, 
//				if(ch[j] == ch[i]) {
//					same = false;
//				}
//				
//			}
//			
//			if(i != ch.length-1) { // 여기부턴 입력식! // i가 끝나지 않았으니까 a, i가 1일때는
//				answer += ch[i] + ", ";
//			} else {
//				answer += ch[i];
//			}
//		}
//
//		
//		System.out.print(answer);
//		
//		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		int count = 0; // 문자의 개수 출력
		
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i = 0; i<arr.length; i++) { // char 값 대입
			arr[i] = str.charAt(i);
			
			// 중복제거 ?? 출력 .. apple a p l e
			boolean flag = true;
			
			for(int j =0; j<i; j++) {
				if(arr[j] == arr[i]) { // apple a p 'p' 얘한테 false
					flag = false;
				}
			}
			
			if(flag) { // flag == true
				count++;
				if(i == 0) {
					System.out.print(arr[i]);
				} else {
					System.out.print(", " + arr[i]);
				}
			}
			
			
		}
		System.out.println();
		System.out.println("문자 개수 : " + count);
		
		
	}
	
	
	
	public void practice16(){
		String answer = ""; // 여기에 문자열 쌓기
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		
		while(true) {
			int arrNum = sc.nextInt();
			sc.nextLine();
			
			for(int i =1; i<= arrNum; i++) {
				System.out.print(i + "번째 문자열 : ");
				answer += sc.nextLine();
				if(i != arrNum) {
					answer += ", ";
				} else {
					;
				}
				
			}
			
			
			System.out.print("더 값을 입력하시겠습니까(Y/N) : ");
			char ch1 = sc.nextLine().charAt(0);
			
			
			if(ch1 == 'Y' || ch1 == 'y') {
				answer += ", ";
				System.out.print("더 입력하고 싶은 개수 : ");

				continue;
			} else if(ch1 =='N' || ch1 == 'n') {
				break;
			}
		}
		System.out.println("[" + answer + "]");
		
		
		// 쌤 풀이
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력 : ");
//		int num = sc.nextInt();
//		
//		String[] origin = new String[num]; // 이게 다름
//		String[] copy = null;
//		
//		for(int i =0; i<origin.length; i++) {
//			System.out.printf("%d번째 문자열", i+1);
//			origin[i] = sc.nextLine();
//		}
//		
//		while(true) {
//			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
//			char ch = sc.nextLine().charAt(0);
//			if(ch == 'y' || ch == 'Y') { // 더 입력하겠다는 경우
//				System.out.print("더 입력하고 싶은 개수 : ");
//				num = sc.nextInt();
//				
//				copy = Arrays.copyOf(origin,origin.length + num); 
//				//Arrays.copyOf(원본배열, 원하는 배열크기, )
//				for(int i =origin.length; i<copy.length; i++) {
//					System.out.printf("%d번째 문자열 : ", i=1);
//					copy[i] = sc.nextLine();
//				}
//				
//				origin = copy;
//				 
//				
//			} else { // 그만할래
//				System.out.print("[");
//				for(int i =0; i<copy.length; i++) {
//					if(i == copy.length-1) { //마지막 인덱스인경우
//						System.out.printf("%s", copy[i]);
//					} else {
//						System.out.printf("%s, ", copy[i]);
//					}
//				}
//				System.out.print("]");
//				
//			}
//		}
//		
//		
//		
//		
	}
	
	
	
	
	
	
	
	
	
	

}