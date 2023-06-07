package com.kh.chap03_class.model.vo;

public class Person {	
	
	// 필드 선언
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// setter 메소드 (7개)
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	// getter 메소드 (7개)
	
	public String getId() {
		return id;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	//이것들을 한번에 정리할 information메소드
	
	public String information() {
		return "id는 " + id + "이고 이름은 " + name + "이며 나이는 " + age + "이며 성별은 " + gender + "입니다. 또한 전화번호는"
				+ phone + "이고 이메일은 " + email + "입니다.";				
	}
	
	
}





