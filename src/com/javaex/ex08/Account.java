package com.javaex.ex08;

public class Account {

//	필드
    private String accountNo;
    private int balance;
    private int deposit;
    private int withdraw;
    private int account;
    
    
//  생성자 작성
    
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    }
    
	public Account(String accountNo, int balance, int deposit, int withdraw) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.deposit = deposit;
		this.withdraw = withdraw;
	}

	
//  필요한 메소드 작성	
//	메서드 gs

	

	public final String getAccountNo() {
		return accountNo;
	}

	public final void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public final int getBalance() {
		return balance;
	}

	public final void setBalance(int balance) {
		this.balance = balance;
	}

	public final int getDeposit() {
		return deposit;
	}

	public final void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public final int getWithdraw() {
		return withdraw;
	}

	public final void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}

	public final int getAccount() {
		return account;
	}

	public final void setAccount(int account) {
		this.account = account;
	}

	
    
    
//	매서드 일반

	public void ShowBalance() {
		System.out.println(balance);
	}

}
