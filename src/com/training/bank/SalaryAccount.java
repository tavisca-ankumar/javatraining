package com.training.bank;

import java.util.Date;
import java.util.Scanner;
import java.util.Timer;

public class SalaryAccount extends Account {

    double min_bal = 10000;
    double quarterlyDailyBalance = 0;
    int quarterTime = 9;

    public SalaryAccount(double initialBalance, int size)
    {
        this.balance = initialBalance;
        this.accountNumber = "S"+ size;

        Transaction transaction = new Transaction("Account opened",initialBalance);
        transactions.add(transaction);

        this.operation();

    }

    private void operation() {

        MinTransactionTime mtt= new MinTransactionTime(this);
        Timer timer1 = new Timer();
        timer1.scheduleAtFixedRate(mtt ,180000,180000);

    }

    public void deposit() {
        System.out.println("Enter amount to deposit");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        balance+=amount;
        Transaction transaction = new Transaction("Deposite",amount);
        transactions.add(transaction);
        System.out.println(amount+ " deposited,updated balance is "+balance);
    }

    public void withdraw() {
        System.out.println("Enter amount to withdraw");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        if(balance>amount && (balance-amount)>=min_bal){
            balance-=amount;
            Transaction transaction = new Transaction("Withdraw",amount);
            transactions.add(transaction);
            System.out.println("Updated balance is "+balance);
        }
        else{
            if(balance<amount){
                System.out.println("Insufficient Balance");
            }
            else{
                System.out.println("Withdrawal amount not satisfy minimum balance criteria");
            }
        }
    }
}
