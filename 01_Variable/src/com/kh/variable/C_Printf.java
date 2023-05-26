package com.kh.variable;

public class C_Printf {
	
	public void printfTest() {
		
		// System.out.print(출력하고자 하는 값); // 출력만 함(줄바꿈 x)
		// System.out.println(출력하고자 하는 값); // 출력 후 줄바꿈
		
		// System.out.printf("출력하고자 하는 형식(포맷)",출력하고자 하는 값);
		// 출력하고자 하는 값들이 제시한 형식(포맷)에 맞춰서 출력만 진행 (줄바꿈 x)
		
		/*
		 * 포맷 안에서 쓰일 수 있는 키워드
		 * %d : 정수
		 * %c : 문자
		 * %s : 문자열
		 * %f : 실수 
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		//"10 20"
		System.out.println(iNum1 + " " + iNum2); // 문자열이 있으면 달라질 수 ㅇㅇ
		
		// 30
		System.out.println(iNum1 + iNum2); // int형만 있으면 출력값도 int임
		System.out.printf("%d %d",iNum1,iNum2); // 개수 안맞으면 error, 근데 많으면 뒤에애가 무시됨.
		System.out.println(); // 개행을 위해 사용, 혹은 "%d %d\n" 을 사용하는 방법도 있음
		System.out.println("하하");
		// System.out.printf("%d %d%",iNum1,iNum2); %뒤에는 원래 포맷키워드가 와야됨. 이건안됨
		System.out.printf("%d %d%%",iNum1,iNum2); // %한번은 포맷, 두번쓰면 %로 인식
		
		System.out.println();
		// 정렬하고자 할 때 많이 씀
		System.out.printf("%5d\n",iNum1); // 양수 5만큼 오른쪽 정렬 "    10" 맨끝이 5에맞게..
		System.out.printf("%-5d\n",iNum2); // 음수 5만큼 왼쪽 정렬 "20    "
		
		
		System.out.printf("%5d\n",250);
		System.out.printf("%5d\n",3000);
		System.out.printf("%5d\n",16);
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f\t%f",dNum1,dNum2); // 무조건 소수점 아래 6번째 자리까지 보여줌
		System.out.println();
		System.out.printf("%.2f %.1f",dNum1,dNum2); // 중요!!!! 소수점 아래 숫자번째 자리만큼 보여줌
		System.out.println();
		
		char ch = 'a';
		String str = "hello";
		
		System.out.printf("%c %s %s",ch,str,ch);
		System.out.println();
		System.out.printf("%C %S %S",ch,str,ch); // 대문자로 바꾸기
		System.out.println();
		
		String z = "hello";
		int x = 3;
		System.out.printf("%s %d",z,x);
	
	
	}

}
