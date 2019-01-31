package com.bank.bean;

public class InsufficientOpeningBalanceException extends Exception {
	
	@Override
	public String getMessage()
	{
		return ("Minimum bal = 500");
	}

}
