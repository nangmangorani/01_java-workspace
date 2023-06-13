package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {}
	
	public String afterToken(String str) {
		StringTokenizer stn = new StringTokenizer(str, " ");
		String a = ""; // 새로 받을 문자열
		int count = stn.countTokens();
		for(int i = 0; i<count; i++) {
			a += stn.nextToken();
		}
		return a;
		
	}
	
	public String firstCap(String input) {
		// a 97 z 122	A 65 Z 90
		char[] ch = input.toCharArray();
		if(ch[0] >= 97 && ch[0]<=122) {
			ch[0] = (char) (ch[0] - 32);
		}
		input = String.valueOf(ch);
		return input;
		
	}
	
	public int findChar(String input, char one) {
		int count = 0; // 같은 개수 세기
		char[] ch = input.toCharArray();
		for(int i = 0; i<ch.length; i++) {
			if(ch[i] == one) {
				count++;
			}
		}
		return count;
	}
	
}
