package com.kh.practice.api.controller;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.StringTokenizer;

import com.kh.practice.api.model.vo.Book;

public class BookController extends Book {

	private Book[] book = new Book[5];
	private Book[] bookCopy;
	{
		
		book[0] = new Book("자바의 정석", "차은우", "나무", new Date(2023-1900, 6-1, 14), 10000);
		book[1] = new Book("여러분 화이팅", "주지훈", "사과", new Date(2023-1900, 5-1, 11), 20000);
		book[2] = new Book("API의 모든것", "오렌지", "오렌지",new Date(2020-1900, 4-1, 25), 35000);
		book[3] = new Book("언어의 천재", "장원영", "키위",new Date(2015-1900, 1-1, 1), 70000);
		book[4] = new Book("개발왕국", "시연쌤", "바나나",new Date(2022-1900, 12-1, 25), 80000);
		
	}

	
	public BookController() {}

	public void printAll() {
		
		// 1. for loop
//		for (int i = 0; i < book.length; i++) {
//			System.out.println(book[i]);
//		}
		
		// 2. 향상된 for문
		for(Book a : book) {
			System.out.println(a);
		}

	}

	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		
		// 1. 토큰 사용
		// String date 분리
//		StringTokenizer stn = new StringTokenizer(newDate, "-");
//
//		// Date 객체에 넣기 전 토큰을 int객체에 연도, 월, 일 순으로 넣어주기
//
//		int year = Integer.parseInt(stn.nextToken());
//		int month = Integer.parseInt(stn.nextToken());
//		int day = Integer.parseInt(stn.nextToken());
//


		String[] arr = new String[3];
		arr = newDate.split("-");
		int year = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[2]);
		
		year -= 1900;
		month--;
		
		Date date = new Date(year, month, day);

		// 2000년 이상 1900빼주기

		// Book 생성자는 str/str/str/str/int

		// publishDate를 String newDate로 변경

		// 문자열 -> int
		int price = Integer.parseInt(newPrice);
		
		// 6의 크기로 할당, 
//		bookCopy = Arrays.copyOf(book, 6);
//		
//		bookCopy[5] = new Book(newTitle,newAuthor,newPublisher, date, price);
//		
		
		Book[] copyBook = new Book[book.length+1];
		System.arraycopy(book, 0, copyBook, 0, book.length);
		copyBook[book.length] = new Book(newTitle,newAuthor,newPublisher, date, price);
		book = copyBook;
		
	}

	public void printBookPublisherDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 출간");
		String str = sdf.format(book[5].getPublishDate());
		System.out.println(str);
		
	}

	public void searchBook(String searchTitle) {
		for(int i = 0; i<book.length; i++) {
			if(book[i].getTitle().contains(searchTitle)) {
				System.out.println(book[i]);
			}
		}
	}

}
