package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method() {
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		
		// 구분자를 기준으로 해서 문자열을 분리시키는 방법
		
		// 방법1. 분리된 문자열들을 String[] 배열에 차곡차곡 담고자 할 때
		//		 String 클래스에서 제공하는 split 메소드 이용
		// 		 문자열.split(구분자) : String[]
		
		String[] arr = str.split(",");
		System.out.println("arr 배열의 길이 : " + arr.length);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(i + "번째 인덱스 : " + arr[i]);
		}
		
		int count = 0;
		for(String a : arr) { // a = arr[0], a= arr[1]...
			System.out.println(count + "번째 인덱스 : " + a);
			count++;
		}
		
		// 방법2. 분리된 문자열들을 각각 토큰으로써 관리하고자할 때
		//		java.util.StringTokenizer 클래스를 이용하는 방법
		// 		StringTokenizer stn = new StringTokenizer(분리시키고자 하는 문자열, 구분자);
		
		StringTokenizer stn = new StringTokenizer(str,",");
		System.out.println("분리된 문자열의 개수 : " + stn.countTokens());
		
		// 한개씩 나와 이자식들아
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken());
//		System.out.println(stn.nextToken()); // 다 뽑으면 끝남.. 일회성
		
		//System.out.println(stn.countTokens()); // 다뽑아서 0개임 ㅋ
		
		// 해결방법 1
		/*
		int count1 = stn.countTokens();
		
		for(int i =0; i<count1; i++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// 해결방법 2
		while(stn.hasMoreTokens()) { // 반복문이 수행될 조건 : 토큰이 남아있을때만
			System.out.println(stn.nextToken());
		}
		
		
		
	}
	
	
	
	
}
