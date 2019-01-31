package com.bank.bean;

public class InvalidAccountNumException extends Exception {
	
	@Override
	public String getMessage()
	{
		return ("Account Number is not Valid");
	}

}
