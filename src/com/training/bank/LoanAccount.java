package com.training.bank;

import java.util.Scanner;
import java.util.Timer;

public class LoanAccount extends Account{



    public LoanAccount(double initialBalance, int size)
    {
        this.balance = -1*initialBalance;
        this.accountNumber = "S"+ size;

        Transaction transaction = new Transaction("Account opened",initialBalance);
        transactions.add(transaction);
        this.operation();

    }

    private void operation() {

        InterestCalculator ic= new InterestCalculator(this);
        Timer timer1 = new Timer();
        timer1.scheduleAtFixedRate(ic ,180000,180000);

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

    }


}
