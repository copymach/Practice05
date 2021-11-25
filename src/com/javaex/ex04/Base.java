package com.javaex.ex04;

public class Base {
    
//	필드
	private String day;
	private String night;
	private String afternoon;
	
	/*
	this.day = day;
    this.night = night;
    this.afternoon = afternoon;
    */
	
//	생성자
    public void service(String state) {
        System.out.println(base.service(););
        //코드작성할것
        	
    }

    

	
//	매서드 일반
	public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }

    public void night() {
        
    	//코드작성할것
    	System.out.println("밤에는 숙면");
    }
    
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }


	@Override
	public String toString() {
		return "Base [day=" + day + ", night=" + night + ", afternoon=" + afternoon + "]";
	}
    
    
}

