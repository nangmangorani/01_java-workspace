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
		for (Book b : list) {
			if (b.getbNo().equals(bNo)) {
				a = b;
			}
		}
		return a;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		ArrayList<Book> arr = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().contains(title)) {
				arr.add(list.get(i));
			}
		}
		return arr;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> arr = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Magazine == false) {
				arr.add(list.get(i));
			}
		}
		return arr;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> arr = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Magazine) {
				arr.add(list.get(i));
			}
		}
		return arr;
		
	} 

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		ArrayList<Magazine> arr = new ArrayList<>();
		ArrayList<Book> arrB = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Magazine) {
				arr.add((Magazine) list.get(i));
			}
		}
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getYear() == year) {
				arrB.add(arr.get(i));
			}
		}
		return arrB;

	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		ArrayList<Book> arr = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getPublisher().contains(publisher)) {
				arr.add(list.get(i));
			}
		}
		return arr;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		ArrayList<Book> arr = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getPrice() <= price) {
				arr.add(list.get(i));
			}
		}
		return arr;
	}

	@Override
	public int getTotalPrice() {
		int total = 0;
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i).getPrice();
		}
		return total;
	}

	@Override
	public int getAvgPrice() {
		int total = 0;
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i).getPrice();
		}
		return total / list.size();
	}

}
