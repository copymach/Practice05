package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70);
        won = 1000000.0;
        
        //100만원을 달러로 출력하기
        System.out.println(CConverter.toDoller(won)+": 100만원 -> 달러");
         
        dollar = 100.0;
        //100달려를 원으로 출력하기
        System.out.println(CConverter.toKWR(dollar)+": 100달러 -> 원");
        
    }

}
