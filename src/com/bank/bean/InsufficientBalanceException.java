package com.bank.bean;

public class InsufficientBalanceException extends Exception {
	
	@Override
	public String getMessage()
	{
		return ("Balance is not Sufficient to complete this transaction");
	}

}
