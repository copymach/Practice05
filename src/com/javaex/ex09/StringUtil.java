package com.javaex.ex09;

public class StringUtil {

	/*
//	필드
	private String strArray; 
	
//	생성자	
//	strArray  에서 써준 3개 패러미터를 모아줘
	
	public StringUtil() {}
	
	public StringUtil(String strArray) {
		this.strArray = strArray;	
	*/
	
	public static String concatString(String[] strArray){
//    public static String concatString(){
        //메소드 내용작성
    	
    	
    	String result="";
    	for(int i=0; i<strArray.length; i++) {
    		result= result+strArray[i];
    		
    	}
    	
    	
    	return result;
    	
//    	여기서 String 패러미터3개 배열을 하나로 묶어주자
//    	근데 묶는 법을 모르겠다 
    	
    	
    	
    	/*
    	for(int i=0; i<this.strArray.length; i++){
    		System.out.print(strArray[i]);
    		}
    	
    	
    	strArray[0] = asd; 
    	strArray[1] = asd;
    	strArray[2] = sdaw;
    	}
    	*/
        	

	}

    

}
