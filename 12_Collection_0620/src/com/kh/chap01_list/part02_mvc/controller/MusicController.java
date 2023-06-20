package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 사용자의 요청을 처리해주는 클래스!! 출력문 쓰지 않기!
public class MusicController {
	
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Music> list = new ArrayList<Music>();
	{
		list.add(new Music("디토", "뉴진스"));
		list.add(new Music("안녕", "폴킴"));
		list.add(new Music("요리왕", "샘킴"));
		list.add(new Music("안녕하세요","인사"));
	}

	public ArrayList<Music> insertMusic(String title, String artist) {
		list.add(new Music(title,artist));
		return list;
		
	}
	
	public ArrayList<Music> selectMusic() {
		return list;
	}
	
	public int deleteMusic(String title, String artist) {
		int result = 0;
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)
			&& list.get(i).getArtist().equals(artist)) {
				list.remove(i);
				result = 1;
			}
		}
		return result;
	}
	
	public ArrayList<Music> searchMusic(int menu, String search) {
		ArrayList<Music> searchList = new ArrayList<Music>();
		if(menu == 1) {
			for(int i =0; i<list.size(); i++) {
				if(list.get(i).getTitle().contains(search)) {
					searchList.add(list.get(i));
				}
			}
		} else {
			for(int i =0; i<list.size(); i++) {
				if(list.get(i).getArtist().contains(search)) {
					searchList.add(list.get(i));
				}
			}
		}
		
		return searchList;
	}
	
	public int updateMusic(String title, String newTitle, String newArtist) {
		int result = 0;
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setTitle(newTitle);
				list.get(i).setArtist(newArtist);
				result = 1;
			}
		}
		
		
		return result;
	}
	
	
	
}
