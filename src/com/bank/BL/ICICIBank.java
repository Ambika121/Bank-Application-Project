package com.bank.BL;
import java.util.LinkedList;

import com.bank.bean.Account;
import com.bank.bean.InsufficientBalanceException;
import com.bank.bean.InsufficientOpeningBalanceException;
import com.bank.bean.InvalidAccountNumException;

public class ICICIBank {
	LinkedList<Account> accounts = new LinkedList<>();
	
	public String createAccount(int accNum, int amount) throws InsufficientOpeningBalanceException
	{
		if(amount >= 500)
		{
			Account account = new Account(accNum, amount);
		    accounts.add(account);
		    return "account created successfully";
		}
		throw new InsufficientOpeningBalanceException();
		
	}
	
	public Account searchAccount(int accNum) throws InvalidAccountNumException
	{
		for(Account account:accounts)
		{
			if(accNum == account.getAccNum())
			{
				return account;
			}
		}
		throw new InvalidAccountNumException();
	}
	
	public int withdrawAmount(int accNum, int amount) throws InsufficientBalanceException, InvalidAccountNumException
	{
		Account account = searchAccount(accNum);
		if((account.getAmount()-amount)>=0)
		{
			account.setAmount(account.getAmount() - amount);
			return account.getAmount();
		}
		
		throw new InsufficientBalanceException();
	}
	
	public int depositAmount(int accNum, int amount) throws InvalidAccountNumException
	{
		Account account = searchAccount(accNum);
		
		account.setAmount(account.getAmount() + amount);
		return account.getAmount();
	}
	
	public String transfer(int accNum1, int accNum2, int amount) throws InsufficientBalanceException, InvalidAccountNumException
	{
		Account account1 = searchAccount(accNum1);
		Account account2 = searchAccount(accNum2);
		
		if((account1.getAmount() - amount) >=0)
		{
			account1.setAmount(account1.getAmount() - amount);
			account2.setAmount(account1.getAmount() + amount);
			return ("Balance in " + account1.getAccNum() + " = " + account1.getAmount() + "\nBalance in "+ account2.getAccNum() + " = " + account2.getAmount());
		}
		throw new InsufficientBalanceException();
	}

}
