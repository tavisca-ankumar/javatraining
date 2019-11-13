package com.training.bank;

import java.util.Scanner;

public class CurrentAccount extends Account{

    double min_bal = 10000;

    public CurrentAccount(double initialBalance, int size)
    {
        this.balance = initialBalance;
        this.accountNumber = "S"+ size;

        Transaction transaction = new Transaction("Account opened",initialBalance);
        transactions.add(transaction);

    }


    @Override
    public void deposit() {
        System.out.println("Enter amount to deposit");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        balance+=amount;
        Transaction transaction = new Transaction("Deposit",amount);
        transactions.add(transaction);
        System.out.println(amount+ " deposited,updated balance is "+balance);
    }

    @Override
    public void withdraw() {
        System.out.println("Enter amount to withdraw");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        if(amount<balance*1.12){
            balance-=amount;
            Transaction transaction = new Transaction("Withdraw",amount);
            transactions.add(transaction);
            System.out.println("Updated balance is "+balance);
        }
        else{
            System.out.println("Withdrawal amount is greater than your aukaat");
        }
    }
}
