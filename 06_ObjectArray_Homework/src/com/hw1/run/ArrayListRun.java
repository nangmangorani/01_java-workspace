package com.hw1.run;

import java.util.ArrayList;

import com.hw1.model.vo.Employee;

public class ArrayListRun {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<>();
		
		list.add(new Employee());
		list.add(new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실"));
		list.add(new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡"));
		// 0번째 인덱스는 만들어지고 괜찮은ㄴ데?
		
		
		for(Employee e : list) {
			System.out.println("list : " + e.information());
		}
		
		System.out.println("============================================");
		
		list.set(0, new Employee(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주"));
		list.get(1).setDept("기획부");
		list.get(1).setJob("부장");
		list.get(1).setSalary(4000000);
		list.get(1).setBonusPoint(0.3);
		//list.set(1, new Employee(1,"홍길동","기획부","부장",19,'M',4000000,0.3,"01022223333","서울 잠실"));

		
		System.out.println("list.get(0) : " + (list.get(0).information()));
		System.out.println("list.get(1) : " + (list.get(1).information()));
		System.out.println("list.get(2) : " + (list.get(2).information()));

		int sum = 0;
		for(Employee e : list) {
			System.out.println(e.getEmpName() + "의 연봉 : " + (int)(e.getSalary() + (e.getSalary() * e.getBonusPoint()))*12 + "원");
			sum += (int)(e.getSalary() + (e.getSalary() * e.getBonusPoint())) * 12;
		}
		System.out.println("직원들 연봉 평균 : " + sum / 3 + "원");
		
	}

}
