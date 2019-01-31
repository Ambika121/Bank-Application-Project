package com.bank.view;

import com.bank.BL.ICICIBank;
import com.bank.bean.InsufficientBalanceException;
import com.bank.bean.InsufficientOpeningBalanceException;
import com.bank.bean.InvalidAccountNumException;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICIBank bank = new ICICIBank();
		
		try {
		
		    System.out.println(bank.createAccount(101, 5000));
		    System.out.println(bank.createAccount(102, 2000));
		    //System.out.println(bank.createAccount(103, 200));
	
			System.out.println("Balance = " + bank.withdrawAmount(101, 4000));
			System.out.println("Balance = " + bank.withdrawAmount(102, 2000));
			//System.out.println("Balance = " + bank.withdrawAmount(101, 2000));
			//System.out.println("Balance = " + bank.withdrawAmount(103, 2000));
			System.out.println("Balance = " + bank.depositAmount(101, 2000));
			System.out.println(bank.transfer(101, 102, 2000));
		}
		catch(InvalidAccountNumException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InsufficientOpeningBalanceException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
