package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		
		Book bk1 = new Book("수학의 정석", "나수학", 100);
		Book bk2 = new Book("칭고춤", "고래", 300);
		
		System.out.println(bk2);
		
		// 출력문에 레퍼런스 출력하고자할때 JVM이 자동으로 해당 레퍼런스.toString() 메소드 호출
		
		// 오버라이딩 전 : Object 클래스의 toString() 실행 => 풀클래스명 + @ + 객체의 해쉬코드의 16진수값 리턴....
		// 오버라이딩 후 : Book 클래스의 toString() 실행 => 해당 객체가 가지고 있는 모든 필드값을 한 문자열로 합쳐 리턴
		
		
	}

}
