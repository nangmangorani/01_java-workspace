package com.kh.practice.api.controller;

import java.util.Date;
import java.util.StringTokenizer;

import com.kh.practice.api.model.vo.Book;

public class BookController extends Book{
	
	private Book[] book = new Book[5];
	private int count = 0;
	
	
	public BookController() {}
	
	public void printAll() {
		
		
		for(int i =0; i<count; i++) {
			System.out.println(book[i]);
		}
		count++;
		
	}
	
	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		
		// String date -> Date
		StringTokenizer stn = new StringTokenizer(newDate,"-");
		
		int[] arr = new int[3];
		
		for(int i = 0; i<3; i++) {
			arr[i] = Integer.parseInt(stn.nextToken());
		}
		Date publishDate = new Date(arr[0] - 1900,arr[1] -1,arr[2]);
		
		// 문자열 -> int
		int price = Integer.parseInt(newPrice);
		
		
		book[count] = new Book(newTitle, newAuthor, newPublisher, publishDate ,price);
		
	}
	
	public void printBookPublisherDate() {
		
	}
	
	public void searchBook(String searchTitle) {
		
	}
	
}
