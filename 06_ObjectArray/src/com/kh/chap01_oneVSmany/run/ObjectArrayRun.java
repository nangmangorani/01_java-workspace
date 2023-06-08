package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 객체 배열 활용해서 해보기!!!
		// 세 개의 Book 객체를 관리한다면?
		Book[] books = new Book[3];
		
		// 세개의 도서에 대한 정보를 반복적으로 입력 받아 각 인덱스에 객체 생성
		
		for(int i =0; i<books.length; i++) { // for문 시작
			System.out.println(i+1 + "번째 도서정보 입력");
			System.out.print("도서명 : ");
			String title = sc.nextLine();
			
			System.out.print("저자명 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			books[i] = new Book(title,author,price,publisher);
			
		} // for문 끝
		
		for(int i = 0; i<books.length; i++) {
			System.out.println(books[i].information());
		}
		
		// 도서 제목으로 검색하는 서비스
		System.out.print("검색할 책 목록 : ");
		String search = sc.nextLine();
		
//		if(books[0].getTitle().equals(search)) {
//			System.out.println(books[0].information());
//		}
//		
//		if(books[1].getTitle().equals(search)) {
//			System.out.println(books[0].information());
//		}
//		
//		if(books[2].getTitle().equals(search)) {
//			System.out.println(books[0].information());
//		}
		
		for(int i =0; i<books.length; i++) {
			if(books[i].getTitle().equals(search)) {
				System.out.println(books[i].information());
			}
		}
		
		
	}

}
