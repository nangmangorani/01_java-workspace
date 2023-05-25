package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;

public class Run {
	public static void main(String[] args) {
		A_Variable a = new A_Variable(); // 전혀다른 클래스에서 호출
		// 클래스명 별칭 = new 클래스명();
		// a.printVariable();
		// a.declearVariable();
		
		B_KeyboardInput b = new B_KeyboardInput();
		//b.inputTest1();
		//b.InputTest2();
		//b.inputTest3();
		//b.inputTest4();
		b.charAtTest();
		
	}

}
