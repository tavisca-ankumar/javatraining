package com.training.bank;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.TimerTask;

public class MinTransactionTime extends TimerTask {

    Calendar cal = Calendar.getInstance();
    Timestamp timestamp;

    SalaryAccount account;

    public MinTransactionTime(SalaryAccount account) {
        timestamp = currentTimestamp();
        this.account = account;
    }

    public void run() {
        Timestamp timestamp2 = new Timestamp(cal.getTime().getTime());

        long milliseconds = timestamp2.getTime() - timestamp.getTime();
        int seconds = (int) milliseconds / 1000;
        int hours = seconds / 3600;
        if (account.transactions.isEmpty() && hours > 1440) {
            System.out.println("account is freezed");
        }
    }

    public Timestamp currentTimestamp() {
        java.util.Date date = new java.util.Date();
        Timestamp timestamp1 = new Timestamp(date.getTime());

        // create a calendar and assign it the same time
        cal.setTimeInMillis(timestamp1.getTime());

        // add a bunch of seconds to the calendar
        cal.add(Calendar.SECOND, 98765);

        return timestamp1;

    }


}
