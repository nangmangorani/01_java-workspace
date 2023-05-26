package com.kh.variable;

import java.util.Scanner;

// 사용자가 키보드로 입력한 값을 받아들이는 Scanner 실습
public class B_KeyboardInput {
	
	public void inputTest1() {
		
		/*
		 * 키보드로 값을 입력받는 방법
		 * Scanner를 사용한다!
		 * 즉 java.util.Scanner 클래스를 이용하는 것.
		 * Scanner 클래스 내부의 메소드를 호출해서 입력받는 것.
		 */
		
		// 스캐너 생성(new)
		Scanner sc = new Scanner(System.in);
		// System.in은 입력받은 값을 바이트 단위로 받아들이겠다는 의미
		
		System.out.print("아무거나 입력해보세요 : ");
		String message = sc.nextLine(); // sc.nextLine(); 여기서 값 대입하면 버퍼 저장, 메모리에 생성된 message에 옮겨짐
		System.out.println("입력받은 내용 : " + message);
		
		sc.close(); // 다 쓰면 닫아주셈
	}
	/*
	 * 1. inputTest2() 메소드 생성
	 * 2. 스캐너 생성
	 * 3. 당신의 이름은 무엇입니까? 가이드문구
	 * 4. 이름 변수에 저장
	 * 5. 변수에 저장된 것 출력
	 * 6. close
	 */
	
	public void InputTest2() {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("이름을 작성하세요 : ");
		
		// 사용자가 입력한 값을 문자열로 받아오는 메소드(nextLine(), next())
		// String name = sc1.next();
		// next() : 사용자가 입력한 값 중 공백이 있을 경우 공백 이전까지의 값만 읽어옴.
		// 			따라서 거주지처럼 공백 있는 데이터는 제대로 된 값을 못가져올 수도 있음
		String name = sc1.nextLine();
		
		//nextLine() : 사용자가 입력한 값 모두 읽어옴(엔터 전까지)
		
		System.out.print("당신의 나이는 몇 살입니까? : ");
		int age = sc1.nextInt(); // 사용자가 입력한 값을 정수로 읽어들이는 메소드
		
		System.out.print("당신의 키는 몇입니까? (소수점 첫째 자리까지) : ");
		double height = sc1.nextDouble(); // 사용자가 입력한 값을 실수로 읽어들이는 메소드
		
		System.out.println(name + "님은 " + age + "살 이며, 키는 " + height + "cm 입니다.");
		
		sc1.close();
		
	}
	
	// 키보드로 값을 입력 받을 때 종종 발생되는 문제
	public void inputTest3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt(); //nextLine 외에는 \n을 버퍼에서 못없앰.
		
		sc.nextLine(); // 버퍼에 남아있는 엔터를 비워주는 코드
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		// xxx님은 xx살이며, 사는 곳은 xxx이고 키는 xxx.x cm입니다.
		//System.out.println(name + "님은 " + age + "살이며 사는 곳은 " + address + "이며 키는 "+ height + "입니다." );
		System.out.printf("%s님은 %d살이며 사는 곳은 %s이며 키는 %.1f입니다.",name,age,address,height);
		sc.close();
		
	}
	
	public void inputTest4() {
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력받을 때 => sc.nextLine(), sc.next()
		// 정수값을 입력받을 때 => sc.nextInt()
		// 실수값을 입력받을 때 => sc.nextDouble()
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		// char gender = sc.next => nextChar() 이런건 없음
		char gender = sc.nextLine().charAt(0); // 입력한 값의 0번째 값을 gender에 저장
		// 문자열.charAt(인덱스) : 문자열로부터 해당 인덱스의 문자를 추출해주는 메소드
		// 인덱스: 순번같은 존재, 0부터 시작함
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		/*
		 * xxx님의 개인정보
		 * 성별 : x
		 * 나이 : xx
		 * 키 : xxx.x
		 */
		System.out.println(name + "님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
	}
	
	public void charAtTest() {
		String str = "Hello";
		
		// 변수에 기록해서 출력하는 방식
		char ch = str.charAt(0); // H
		System.out.println(ch);
		
		// 바로 출력하는 방식
		System.out.println(str.charAt(3));
		
		// 존재하지 않는 인덱스: 오류발생 
		// System.out.println(str.charAt(12)); -> java.lang.StringIndexOutOfBoundsException
		
		/*
		 * 정리!
		 * 1. 콘솔창에 (모니터) 출력하기 위해: System.out.print[ln]() 메소드 이용
		 * 2. 콘솔창에 (키보드) 입력받기 위해: Scanner 이용해서 (nextLine(), next(), 
		 * 											   nextInt(), nextDouble()..)
		 * 주의 사항!
		 * 1) sc.nextXXX 메소드 뒤에 sc.nextLine() 메소드가 와야될 경우
		 * 	  sc.nextLine() 메소드를 한번 더 써서 버퍼에 남아있는 엔터를 빼줘야함.
		 * 2) '문자' 값을 입력받아야 될 경우
		 * 	  sc.nextLine() 메소드를 통해 우선 문자열로 받고 그 뒤에 .charAt(인덱스 값)
		 * 	  메소드를 통해서 문자 하나 추출
		 */
	
	}
	
}



