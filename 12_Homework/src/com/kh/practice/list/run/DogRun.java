package com.kh.practice.list.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.model.vo.Dog;

public class DogRun {

	public static void main(String[] args) {
		
		ArrayList<Dog> list = new ArrayList<>(4);
		
		Scanner sc = new Scanner(System.in);
		int num = 1; // 번째
		while(num < 6) {
			
			System.out.print(num + "번째 강쥐 이름 입력 : ");
			String name = sc.nextLine();
			
			System.out.print("강쥐 나이 입력 : ");
			int age = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("강쥐 종 입력 (ex. 말티즈): ");
			String kind = sc.nextLine();
			
			if(num == 5) {
				list.add(2, new Dog(name,age,kind));
			}else {
				list.add(new Dog(name,age,kind));
			}
			num++;
		}
		
		System.out.println("==============================");
		System.out.println("전체 깡쥐 출력");
		System.out.println("==============================");
		
		for(Dog d : list) {
			System.out.println(d);
		}
		
		System.out.println("==============================");
		System.out.println("이름에 '구' 가 들어간 강쥐 정보 출력");
		System.out.println("==============================");
		
		int count = 0;
		for(Dog d : list) {
			if(d.getName().contains("구")) {
				System.out.println(d);
				count++;
			}
		}
		System.out.println("이름에 '구'가 들어간 강쥐는 총 " + count + "마리입니다.");
		
	}

}
