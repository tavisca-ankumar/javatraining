package com.training.bank;

import java.util.TimerTask;

public class MinAvgBalance extends TimerTask {

    SavingsAccount account;
    public MinAvgBalance(SavingsAccount account)
    {
        this.account = account;
    }
    public void run()
    {
        if(account.quarterlyDailyBalance/account.quarterTime<10000)
        {
            account. balance -= 10;
            Transaction transaction = new Transaction("MAB not maintain tax applied rupee 10 ",account.balance);
            account.transactions.add(transaction);
        }
    }

}
