package com.kh.chap01_beforeVSafter.after.model.vo;

public class Desktop extends Product{ // Desktop은 자식새끼고 부모인 Product 상속 
	// 부모꺼를 지꺼처럼 씀.
	// 후손 조상으로도 부름.
	// 하위 상위라고도 함.
	// this super 라고도 함.
	private boolean allInOne;
	
	public Desktop() {}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// this : 이 클래스의 주소값이 담겨있음.
		//this.allInOne = allInOne;
		
		// brand ~ price 네개의 값은 부모클래스 필드에 대입되어있음
		
		// 해결방법1 : 부모클래스에 있는 필드를 protected로 접근제한자 수정
//		super.brand = brand; // protected로하면 되긴혀~
//		super.pCode = pCode;
		
		// 해결방법2 : 부모클래스에 있는 setter 메소드 활용하기 (public 이기 때문에 접근가능)
//		super.setBrand(brand);
//		super.setpCode(pCode);
//		super.setpName(pName);
//		super.setPrice(price);
		
		// 해결방법3 : 부모 생성자 호출하기 => 우리는 이걸로 간다
		// this 생성자 this(), super 생성자 super() 위치가 항상 위여야한다.
 		super(brand,pCode,pName,price);
		this.allInOne = allInOne;
		
		
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	// 부모거중 public protected로 열린거 쓸수있음.
	
	// 오버라이딩 : 부모클래스에 있는 메소드를 자식클래스에서 재정의하는것
	public String information() { // 자식이 우선순위~
		return super.information() + ", " + allInOne;
	}
	// 오버로딩: 메소드이름이 같은거! 이 둘 차이 면접때 물어봄 ㅋㅋ
	// 오버라이딩: 진짜 반환형 매개변수까지 똑같아야 오버라이딩이다~
	

}
