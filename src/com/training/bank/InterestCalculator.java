package com.training.bank;

import java.util.TimerTask;

public class InterestCalculator extends TimerTask {


    LoanAccount account;
    public InterestCalculator(LoanAccount account)
    {
        this.account = account;
    }
    public void run()
    {
        account.balance = account.balance * 1.08;
    }
}
