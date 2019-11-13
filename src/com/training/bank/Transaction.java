package com.training.bank;

import java.util.Date;

public class Transaction {
    String type;
    double amount;
    Date date;
    public Transaction(String type,double amount)
    {
        this.amount = amount;
        this.type = type;
        long millis=System.currentTimeMillis();
        date=new java.util.Date(millis);
    }
    @Override
    public String toString()
    {
        return "{ "+type+" || "+date+" || "+amount+" only"+" }";
    }
}
