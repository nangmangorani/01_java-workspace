package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {

	public void rps() {
		// 0. 이름을 맨위에서 받아줌.
		// 1. random 메소드를 통해 1~3의 숫자를 출력받고
		// 2. 123을 String 가위 바위 보로 바꿔줌
		// 가위 = 2 바위 = 1 보 = 3
		// 3. scanner 통해서 사람한테 가위바위보 입력받음
		// 4. 가위바위보 이외의 값은 오류 출력 후, 가위바위보 다시함.
		// 5. 이것들이 전부 while문 안에서 실행되어야함.
		// 6. while문 외부에서 win draw lose를 0으로 초기화시켜놓음.
		// 7. 만약 가위바위보 이길경오 win++ 후 continue, 비기면 draw후.. 지면..
		// 8. exit 입력시 break;
		// 9. exit하면 break 구문을 먼저 써주자

		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		int win = 0;
		int draw = 0;
		int lose = 0;

		while (true) {
			// 컴퓨터의 가위바위보 값
			String computer = "";
			int random = (int) (Math.random() * 3 + 1);
			if (random == 1) {
				computer = "바위";
			} else if (random == 2) {
				computer = "가위";
			} else if (random == 3) {
				computer = "보";
			}

			// 사람
			System.out.print("가위바위보 : ");
			String human = sc.nextLine();
			if (human.equals("가위") || human.equals("바위") || human.equals("보")) {

			} else if (human.equals("exit")) {
				System.out.println((win + draw + lose) + "전 " + win + "승 " + draw + "무 " + lose + "패");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			System.out.println("컴퓨터 : " + computer);
			System.out.println(name + " : " + human);

			if ((computer.equals("가위") && human.equals("가위")) || (computer.equals("바위") && human.equals("바위"))
					|| (computer.equals("보") && human.equals("보"))) {
				System.out.println("비겼습니다.");
				draw++;
				continue;
			} else if ((computer.equals("가위") && human.equals("바위")) || (computer.equals("바위") && human.equals("보"))
					|| (computer.equals("보") && human.equals("가위"))) {
				System.out.println("이겼습니다!");
				win++;
				continue;
			} else {
				System.out.println("졌습니다 ㅠㅠ");
				lose++;
				continue;
			}
		}

	}

}
