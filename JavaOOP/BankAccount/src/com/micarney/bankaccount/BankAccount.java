package com.micarney.bankaccount;
import java.util.*;

public class BankAccount {
	private String accountnumber;
	private Double checkbal;
	private Double savebal;
	public static int numaccounts = 0;
	public static Double totalmoney = 0.00;
	
	public BankAccount() {
		this.accountnumber = this.generatenum();
		this.checkbal = 0.00;
		this.savebal = 0.00;
		numaccounts +=1;
	}
	private String generatenum() {
		Random r = new Random();
        List<Integer> digits=  new ArrayList<Integer>();
        String accountnumber = "";
        for (int i = 0; i < 10; i++) {
            digits.add(i);
        }
        for (int i = 10; i > 0; i--) {
            int randomDigit = r.nextInt(i);
            accountnumber+=digits.get(randomDigit);
            digits.remove(randomDigit);
            numaccounts += 1;
        }
        return accountnumber;
	}
	public void deposit(String account, Double value) {
		if (account == "checking account") {
			this.checkbal += value;
		} 
		else if (account == "saving account") {
			this.savebal += value;
		}
		totalmoney += value;
	}
	public void withdraw(String account, Double value) {
		if (account == "checking account") {
			if (this.checkbal - value <= 0.00) {
				System.out.println("Your balance is "+ this.checkbal + ". Insufficient funds");
			} 
			else {
				this.checkbal -= value;
				System.out.println("You have withdrawn " + value + " from your checking account. Your remaining balance is " + this.checkbal);
				}
		if (account == "savings account") {
			if (this.savebal - value <= 0.00) {
				System.out.println("Your balance is "+ this.savebal + ". Insufficient funds");
			} 
			else {
				this.savebal -= value;
				System.out.println("You have withdrawn " + value + " from your savings account. Your remaining balance is " + this.savebal);	
				}
			}
		}
	}
	
	public void totalmoney() {
		System.out.println("You have a total of " + this.checkbal + " in your checking account. You also have " + this.savebal + " in your savings account.");
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public Double getCheckbal() {
		return checkbal;
	}
	public Double getSavebal() {
		return savebal;
	}
	public static int getNumaccounts() {
		return numaccounts;
	}
	public static Double getTotalmoney() {
		return totalmoney;
	}
}
