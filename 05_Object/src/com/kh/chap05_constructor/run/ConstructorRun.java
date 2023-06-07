package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		// 1. 기본생성자로 객체 생성
		User u1 = new User(); // 생성자 만들고 나니 public User탐, 안만들어도 자동으로 만들어짐. 
		System.out.println(u1.information());
		// 각 필드에 JVM 초기값들 담겨 있음!!
		
		// 회원가입시 필수 입력사항만 입력 받는다면?
		
		/*
		User u2 = new User(); 
		u2.setUserId("user02");
		u2.setUserPwd("pwd02");
		u2.setUserName("차은우");
		System.out.println(u2.information());
		*/
		
		// 2. 매개변수 3개짜리 생성자로 객체 생성 후 정보 출력
		User u2 = new User("user02","pwd02","차은우");
		System.out.println(u2.information());
		
		// 그럼 setter 안만들어도 되지 않음?? => 안됨.
		// 비번 바꾸는 경우, 개명한 경우에 필요
		u2.setUserName("차으누");
		System.out.println(u2.information());
		
		// getter는?
		// 비번 까먹은 경우에는 비번만 보여줘야함. 그럴때 필요
		
		// 03 장원영 23 여, information 출력
		
		User u3 = new User("user03", "pwd03", "장원영", 23, '여');
		System.out.println(u3.information());
			
		
		
	}

}
