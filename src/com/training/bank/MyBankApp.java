package com.training.bank;

import java.util.ArrayList;
import java.util.List;

public class MyBankApp {

    static List<Account> accounts = new ArrayList<Account>();

    public static void main(String[] args) throws InterruptedException {
        SavingsAccount savingsAccount = new SavingsAccount(10000,accounts.size());
        accounts.add(savingsAccount);
        System.out.println("Account Balance is  "+savingsAccount.getBalance());
        savingsAccount.deposit();
        savingsAccount.withdraw();
        Thread.currentThread().sleep(240000);
        savingsAccount.generateDailyReport();

    }

}
