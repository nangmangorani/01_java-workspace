package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student[] stu = new Student[3];
		
		stu[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		stu[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		stu[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신학과");
		
		System.out.println("1.");
		for(int i =0; i<stu.length; i++) {
			System.out.println(stu[i]);
		}
		
		System.out.println("============================================================");
		
		System.out.println("2.");
		
		Employee[] empArr = new Employee[10];
		Employee emp = new Employee();
		boolean flag; // 내보낼지말지
		
		
		Scanner sc = new Scanner(System.in);
		
		int k =0; // ~번째
		while(true) {
			k++;
			
			System.out.print(k + "번째 사원의 이름을 입력하세요 : " );
			emp.setName(sc.nextLine());
			
			System.out.print(k + "번째 사원의 나이를 입력하세요 : ");
			emp.setAge(sc.nextInt());
			
			System.out.print(k + "번째 사원의 키를 입력하세요 : ");
			emp.setHeigth(sc.nextDouble());
			
			System.out.print(k + "번째 사원의 몸무게를 입력하세요 : ");
			emp.setWeigth(sc.nextDouble());
			
			System.out.print(k + "번째 사원의 급여를 입력하세요 : ");
			emp.setSalary(sc.nextInt());
			
			sc.nextLine();
			
			System.out.print(k + "번째 사원의 부서를 입력하세요 : ");
			emp.setDept(sc.nextLine());
			
			empArr[k-1] = new Employee(emp.getName(), emp.getAge(), emp.getHeigth(), emp.getWeigth(), emp.getSalary(), emp.getDept());
			
			if(k == 10) {
				break;
			}
			while(true) {
				System.out.print("계속 입력하시겠습니까?(Y/N) : ");
				char ch = sc.nextLine().charAt(0);
				if(ch == 'Y' || ch == 'y') {
					flag = true;
					break;
				} else if (ch == 'N' || ch == 'n') {
					flag = false;
					break;
				} else {
					System.out.print("잘못 입력하셨습니다. ");
					continue;
				}
				// Y일때는 어차피 반복문 돌면되니까 분기처리 ㄴㄴ
				// N일때 반복문 빠져나와서 처리
			}
			
			if(flag == true) {
				continue;
				
				
			} else {
				break;
			}
			
		}
		for(int i =0; i<k;i++) {
			System.out.println(empArr[i]);
		}
		
		
	}

}
