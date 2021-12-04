package com.javaex.ex01;

public class Member {
	
	/*
	메소드는 회원의 이름 변경 setName메소드와 이름을 반환하는 getName, 포인트를 변경하는 setPoint와 포
	인트를 반환하는 getPoint, 회원아이디를 변경하는 setId, 반환하는 getId 메소드를 가지고 있다.
	모든 필드는 외부에서 직접 접근하여 값을 변경하거나 얻어가지 못하도록 private로 접근 제한을 막고, 메소
	드는 제한 없이 모두 호출할 수 있는 접근제한자를 사용한다.
	*/
	
	
//	필드
	private String id;
	private String name;
	private int point;
	
	
//	생성자
	public Member(String id, String name, int point) {
		this.id = id;
		this.name = name;
		this.point = point;
	}
	
	
//	메서드 g/s
	public String getId() {
		return id;
	}	
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	

	
//	메서드 일반
	public void showInfo() {
		System.out.println("회원정보: "+name+"("+id+"), "+point+"점");
	}
	
	
}
