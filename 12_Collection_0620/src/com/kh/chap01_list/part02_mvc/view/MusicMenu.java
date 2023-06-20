package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 화면을 담당하는 클래스 (출력문, 입력문)

/**
 * @author 신의아들 이승준
 * @since 2023.06.20
 * @version 1.0
 */
public class MusicMenu {
	private MusicController mc = new MusicController();
	private Scanner sc = new Scanner(System.in);
	
	// 메인화면 : 프로그램 실행시 처음 보여주는 화면
	public void mainMenu() {
		while(true) {
			
			System.out.println("\n========= Welcome 별밤 ==========");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정곡 삭제");
			System.out.println("4. 특정곡 검색");
			System.out.println("5. 특정곡 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print(">> 메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1:
				insertMusic();
				break;
			case 2: 
				selectMusic();
				break;
			case 3: 
				deleteMusic();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				updateMusic();
				break;
			case 0:
				System.out.println("프로그램 종료합니다. ㄳ");
				return; // 메소드를 호출했던곳으로 나옴 
			default:
				System.out.println("메뉴를 잘못 선택했습니다. 다시 선택해주세요.");
				break;
			}
			
		}
	}
	
	
	/**
	 * 1. 새로운 곡 추가하는 서브화면
	 */
	public void insertMusic() {
		System.out.println("=======곡 추가하기=======");
		System.out.print("곡 제목을 입력하세요 : ");
		String title = sc.nextLine();
		
		System.out.print("가수를 입력하세요 : ");
		String artist = sc.nextLine();
		
		ArrayList<Music> list = mc.insertMusic(title,artist);
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	/**
	 * 2. 전체 곡 조회하는 서브화면
	 */
	public void selectMusic() {
		ArrayList<Music> list = mc.selectMusic();
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	/**
	 * 3. 특정곡 삭제하는 서브화면
	 */
	public void deleteMusic() {
		System.out.println("=======곡 삭제하기=======");
		System.out.print("삭제할 곡 제목을 입력하세요. : ");
		String title = sc.nextLine();
		System.out.print("삭제할 곡의 가수를 입력하세요. : ");
		String artist = sc.nextLine();
		int result = mc.deleteMusic(title,artist);
		if(result == 0) {
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		} else {
			System.out.println("삭제되었습니다.");
		}
		
		selectMusic();
	}
	
	/**
	 * 4. 특정곡 검색해주는 서브화면
	 */
	public void searchMusic() {
		System.out.println("=======검색해서 곡 찾기=======");
		System.out.println("1) 곡제목으로 찾기");
		System.out.print("2) 가수명으로 찾기");
		int menu = sc.nextInt();
		
		sc.nextLine();
		ArrayList<Music> list = new ArrayList<>();
		if(menu == 1) {
			System.out.print("찾을 곡 제목을 입력하세요 : ");
			String title = sc.nextLine();
			 list = mc.searchMusic(menu,title);
			
		} else {
			System.out.print("찾을 곡의 가수를 입력하세요 : ");
			String artist = sc.nextLine();
			list = mc.searchMusic(menu,artist);
		}
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}
	
	/**
	 * 5. 특정 곡 수정해주는 서브화면
	 */
	public void updateMusic() {
		System.out.println("=======곡 수정하기=======");
		System.out.println("수정하고싶은 곡 제목을 적으세요 : ");
		String title = sc.nextLine();
		System.out.println("수정할 제목을 작성하세요 : ");
		String newTitle = sc.nextLine();
		System.out.println("수정할 가수를 작성하세요 : ");
		String newArtist = sc.nextLine();
		int result = mc.updateMusic(title, newTitle, newArtist);
		
		if(result == 0) {
			System.out.println("곡 변경에 실패했습니다.");
		} else {
			System.out.println("변경되었습니다.");
		}
		
		selectMusic();
		
	}
	
	
}
