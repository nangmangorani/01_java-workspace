package com.kh.chap01_inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun2 {

	public static void main(String[] args) {
		
		try {
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println(localHost);
			System.out.println(localHost.getHostAddress()); // ip주소
			System.out.println(localHost.getHostName()); // pc명
			
			InetAddress googleHost = InetAddress.getByName("www.google.com");
			System.out.println("구글 서버명 : " + googleHost.getHostName()); 
			System.out.println("구글 IP주소 : " + googleHost.getHostAddress());
			
			InetAddress[] naverHost = InetAddress.getAllByName("www.naver.com");
			
			System.out.println("네이버 호스트 개수 : " + naverHost.length);
			
			for(InetAddress n : naverHost) {
				System.out.println("네이버 서버명 : " + n.getHostName());
				System.out.println("네이버 서버명 : " + n.getHostAddress());
			}
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
