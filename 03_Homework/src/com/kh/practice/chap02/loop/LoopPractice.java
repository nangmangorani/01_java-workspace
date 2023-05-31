package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력하세요.");
				break;
			}
		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1이상의 숫자를 입력해주세요.");
				break;
			}
		}

	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1이상의 숫자를 입력해주세요.");
				continue;
			}
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		// 1. for문을 이용해서 돌릴건데 만약 i와 num이 다르다면
		// sysout i + " + "해주고
		// i와 num이 같다면 i + " = " + 결과값을 출력해주면 될듯
		// 결과값은 sysout 출력해주기전 sum+=i 를 해준다음 마지막에 sum만!!
		int sum = 0;

		for (int i = 1; i <= num; i++) {

			sum += i;
			if (i != num) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = " + sum);
			}
		}

	}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 > 0 && num2 > 0) {
			if (num1 >= num2) {
				for (int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			} else {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			if (num1 > 0 && num2 > 0) {
				if (num1 >= num2) {
					for (int i = num2; i <= num1; i++) {
						System.out.print(i + " ");
					}
				} else {
					for (int i = num1; i <= num2; i++) {
						System.out.print(i + " ");
					}
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
			
		}

	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}

	}

	public void practice9() {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}
		} else if (num > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}

	}

	public void practice10() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();

			if (num <= 9) {
				for (int i = num; i <= 9; i++) {
					for (int j = 1; j <= 9; j++) {
						System.out.println(i + " * " + j + " = " + (i * j));
					}
				}
				break;
			} else if (num > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				continue;
			}
		}

	}

	public void practice11() {
		Scanner sc = new Scanner(System.in);

		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();

		System.out.print("공차 : ");
		int gap = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			if (i == 1) {
				System.out.print(num + " ");
			} else {
				num += gap;
				System.out.print(num + " ");
			}

		}
	}

	public void practice12() {
		// 1. scanner로 연산자 정수1,2 먼저 입력받음
		// 2. scanner 생성 이후 값을 받는 부분은 while(true)문안에 넣음
		// 3. if문 제일 위에는 exit가 나오면 break; 걸게 만듬
		// 4. 연산자가 나누기이면서 두번째정수가 0일경우 다시 출력.. continue
		// 5. 없는 연산자.. continue
		// 6. 결국 else if 에 다 때려넣으면 될듯???

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("연산자(+, -, *, /, %) : ");
			String operator = sc.nextLine();

			if (operator.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			System.out.print("정수1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수2 : ");
			int num2 = sc.nextInt();

			if (operator.equals("+")) {
				System.out.printf("%d %s %d = %d", num1, operator, num2, (num1 + num2));
				break;
			} else if (operator.equals("-")) {
				System.out.printf("%d %s %d = %d", num1, operator, num2, (num1 - num2));
				break;
			} else if (operator.equals("*")) {
				System.out.printf("%d %s %d = %d", num1, operator, num2, (num1 * num2));
				break;
			} else if (operator.equals("/")) {
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					sc.nextLine();
					continue;
				} else {
					System.out.printf("%d %s %d = %d", num1, operator, num2, (num1 / num2));
					break;
				}

			} else if (operator.equals("%")) {
				System.out.printf("%d %s %d = %d", num1, operator, num2, (num1 % num2));
				break;
			} else {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				sc.nextLine();
				continue;

			}

		}

	}

	public void practice13() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice14() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
