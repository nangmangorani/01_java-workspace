package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee emp[] = new Employee[3];
		
		emp[0] = new Employee();
		emp[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		
		for(int i =0; i<emp.length;i++) {
			System.out.println("emp[" + i + "]" + " : " + emp[i].information());
		}
		
		System.out.println("============================================");
		
		
		emp[0] = new Employee(0,"김말똥","영업부","팀장",30,'M',3000000,0.2,"01055559999","전라도 광주");
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		System.out.println("emp[0] : " + emp[0].information());
		System.out.println("emp[1] : " + emp[1].information());
		
		System.out.println("============================================");

		// 보너스가 적용된 연봉 = (급여 +(급여 *보너스 포인트)) * 1
		int sum = 0;
		for(int i = 0; i<emp.length; i++) {
			System.out.println(emp[i].getEmpName() + "의 연봉 : " + (int)(emp[i].getSalary() + (emp[i].getSalary() * emp[i].getBonusPoint()))*12 + "원");
			sum += (int)(emp[i].getSalary() + (emp[i].getSalary() * emp[i].getBonusPoint()))*12;
		}
		
		System.out.println("============================================");

		System.out.println("직원들의 연봉의 평균 : " + sum / 3 + "원");
	}

}
