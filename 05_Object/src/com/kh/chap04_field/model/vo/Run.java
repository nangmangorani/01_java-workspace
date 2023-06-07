package com.kh.chap04_field.model.vo;

public class Run {

	public static void main(String[] args) {
		// ---------FieldTest2---------------
				FieldTest2 f2 = new FieldTest2();
				
				// public
				System.out.println(f2.pub);
				
				// protected : 같은 패키지내에서는 접근가능, 다른 패키지라면 '상속구조'에서만 접근 가능
				System.out.println(f2.pro);  // 같은 패키지니까 오류 안남~
				
				// default : 오로지 같은 패키지 내에서만 접근 가능
				System.out.println(f2.def); // 같은 패키지니까 오류 안남~
				
				// private : 오직 해당 클래스에서만 접근 가능!!
				//System.out.println(f2.pri); // The field FieldTest2.pro is not visible

				
	}

}
