package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {

	 public void upDown(){
		 // 1. 랜덤 메소드를 통해 int 객체로 숫자를 입력받음
		 // 2. Scanner에 값을 넣어 맞추기
		 // 3. while문안에 if를 넣어서 up down출력하고 continue
		 // 4. while문 밖에 count객체 생성해서 틀릴때마다 count++
		 // 5. 정답 맞췄을경우 문구 출력한 후 break;
		 
		 int random = (int)(Math.random() * 100 + 1); //랜덤 수
		 int count = 1; // 정답 횟수
		 
		 Scanner sc = new Scanner(System.in);
		 
		 
		 
		 while(true) {
			 System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			 int num = sc.nextInt();
			
			 if (num>=1 && num<=100) {
				 if(num == random) {
					 System.out.println(count + "회만에 맞추셨습니다.");
					 break;
				 } else if(num > random) {
					 System.out.println("Down !");
					 count++;
					 continue;
				 } else {
					 System.out.println("Up !");
					 count++;
					 continue;
				 }
			 } else {
				 System.out.println("1~100 사이의 숫자를 입력해주세요.");
				 continue;
			 }
			 
		 }
	 }
	
}
