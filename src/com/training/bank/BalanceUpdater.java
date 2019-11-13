package com.training.bank;

import java.util.TimerTask;

public class BalanceUpdater extends TimerTask {

    SavingsAccount savingsAccount;

    public BalanceUpdater(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public void run()
    {
        savingsAccount.quarterlyDailyBalance+=savingsAccount.balance;
    }
}
