package com.training.bank;

import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class SavingsAccount extends Account
{

    double min_bal = 10000;
    double quarterlyDailyBalance = 0;
    int quarterTime = 9;

    public SavingsAccount()
    {
    }

    public SavingsAccount(double initialBalance, int size)
    {
        this.balance = initialBalance;
        this.accountNumber = "S"+ size;

        Transaction transaction = new Transaction("Account opened",initialBalance);
        transactions.add(transaction);

        this.operation();

    }

    private void operation() {

        Date date = new Date();
        BalanceUpdater updateBalancerTask = new BalanceUpdater(this);
        Timer timer2 = new Timer();
        timer2.scheduleAtFixedRate(updateBalancerTask,date,60000);


        MinAvgBalance mab= new MinAvgBalance(this);
        Timer timer1 = new Timer();
        timer1.scheduleAtFixedRate(mab ,180000,180000);

    }

    public void deposit() {
        System.out.println("Enter amount to deposit");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        balance+=amount;
        Transaction transaction = new Transaction("Deposit",amount);
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
           if((balance-amount)<min_bal){
               try {
                   throw new LowBalanceException();
               } catch (LowBalanceException e) {
                   e.getMyMessage(min_bal-(balance-amount));
               }
//               finally {
//                   System.out.println("You are trying to withdraw "+(min_bal-(balance-amount))+" more than your balance amount");
//               }
           }

        }
    }

}