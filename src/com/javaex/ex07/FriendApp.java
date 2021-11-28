package com.javaex.ex07;

import java.util.Scanner;

//	일단 코드는 동작하는데 친구 정보출력 사이에 에러 메시지 뜬다
//	다른 사람 코드 보고 참고해서 수정하자

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
        
        
        
        //친구정보 3명 입력 로직 --> 반복문 사용
        Friend Friend00 = new Friend();
        Friend Friend01 = new Friend();
        Friend Friend02 = new Friend();
        
        System.out.print("이름 :" );        
        Friend00.setName(sc.nextLine());
        
        System.out.print("핸드폰 :" );
        Friend00.setHp(sc.nextLine());
        
        System.out.print("학교 :" );
        Friend00.setSchool(sc.nextLine());
        
        
        System.out.println("===================");
        System.out.print("이름 :" );        
        Friend01.setName(sc.nextLine());
        
        System.out.print("핸드폰 :" );
        Friend01.setHp(sc.nextLine());
        
        System.out.print("학교 :" );
        Friend01.setSchool(sc.nextLine());
        
        
        System.out.println("===================");
        System.out.print("이름 :" );        
        Friend02.setName(sc.nextLine());
        
        System.out.print("핸드폰 :" );
        Friend02.setHp(sc.nextLine());
        
        System.out.print("학교 :" );
        Friend02.setSchool(sc.nextLine());
        
        
        
        int Friend;
        String FriendInfo;
        
        FriendInfo = sc.nextLine();

        friendArray[0] = Friend00;
        friendArray[1] = Friend01;    
        friendArray[2] = Friend02;
        
        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	System.out.println(friendArray[i]);
        	Friend00.showInfo();
        	Friend01.showInfo();
        	Friend02.showInfo();
        }

        sc.close();
    }

}
