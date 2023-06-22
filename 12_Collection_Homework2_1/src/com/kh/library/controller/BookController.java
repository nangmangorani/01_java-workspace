package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager {

	ArrayList<Book> list = new ArrayList<>();
	
	@Override
	public void addBook(Book nBook) {
		list.add(nBook);
	}

	@Override
	public ArrayList<Book> getAllBook() {
		return list;
	}

	@Override
	public Book searchBookBybNo(String bNo) {
		Book a = null;
		for(Book b : list) {
			if(b.getbNo().equals(bNo)) {
					a = b;
			}
		}
		return a;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		ArrayList<Book> arr = new ArrayList<Book>();
		for(Book b : list) {
			if(b.getTitle().contains(title)) {
				arr.add(b);
			}
		}
		
		return arr;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> arr = new ArrayList<Book>();
		for(Book b : list) {
			if(b instanceof Magazine == false) {
				arr.add(b);
			}
		}
		return arr;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> arr = new ArrayList<Book>();
		for(Book b : list) {
			if(b instanceof Magazine) {
				arr.add(b);
			}
		}
		return arr;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		ArrayList<Book> arrB = new ArrayList<Book>();
		ArrayList<Magazine> arrM = new ArrayList<Magazine>();
		for(int i =0; i<list.size(); i++) {
			if(list.get(i) instanceof Magazine) {
				arrM.add((Magazine)list.get(i));
			}
		}
		for(Magazine m : arrM) {
			if(m.getYear() == year) {
				arrB.add(m);
			}
		}
		return arrB;
		
		
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		ArrayList<Book> arr = new ArrayList<Book>();
		for(Book b : list) {
			if(b.getPublisher().contains(publisher)) {
				arr.add(b);
			}
		}
		
		return arr;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		return null;
	}

	@Override
	public int getTotalPrice() {
		int sum = 0;
		for(Book b : list) {
			sum+=b.getPrice();
		}	
		return sum;
	}

	@Override
	public int getAvgPrice() {
		int sum = 0;
		for(Book b : list) {
			sum+=b.getPrice();
		}	
		return sum/list.size();
	}
	
	
	
	
	
}
