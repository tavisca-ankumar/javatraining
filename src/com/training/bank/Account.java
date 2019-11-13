package com.training.bank;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {

    String accountNumber;
    double balance;
    List<Transaction> transactions = new ArrayList<Transaction>();



    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit();

    public abstract void withdraw();

    public void generateDailyReport()
    {
        if(transactions.size()!=0)
            System.out.println(transactions);
        else
            System.out.println("No Transactions Today");
    }


}
