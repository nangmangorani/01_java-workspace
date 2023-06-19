package com.kh.chap02_inherit.run;

import java.util.ArrayList;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;
import com.kh.chap02_inherit.model.vo.Vehicle;

public class InheritRun /*extends Object*/{

	public static void main(String[] args) {
		
		Car c = new Car("벤틀리", 12.5, "세단", 4);
		Ship s = new Ship("낚시배", 3, "어선", 1);
		Airplane a = new Airplane("종이비행기", 0.01, "제트기", 10, 4);
		
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		
		c.howToMove();
		s.howToMove();
		a.howToMove();
		
		System.out.println("============================");
		
		ArrayList<Vehicle> list = new ArrayList<>();
		
		list.add(new Car("벤틀리", 12.5, "세단", 4));
		list.add(new Ship("낚시배", 3, "어선", 1));
		list.add(new Airplane("종이비행기", 0.01, "제트기", 10, 4));
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).information()); // 동적바인딩
		}
		
		System.out.println("===============================");
		
		
		System.out.println(c.hashCode());
		System.out.println(c.equals(a)); // 그럼 부모가 2명인가요? ㄴㄴ Object는 약간 할머니st
		System.out.println(c.toString()); // toString 쓰나안쓰나 똑같음(자동호출)
		// 그래서 toString 오버라이딩 ㅆㄱㄴ
		System.out.println(c);
		
	}

}




