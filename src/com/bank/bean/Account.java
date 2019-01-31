package com.bank.bean;

public class Account {
	int AccNum;
	int amount;
	
	public int getAccNum() {
		return AccNum;
	}
	public void setAccNum(int accNum) {
		AccNum = accNum;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Account(int accNum, int account) {
		super();
		AccNum = accNum;
		this.amount = account;
	}

}
