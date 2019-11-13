package com.training.house;

import java.sql.Timestamp;
import java.util.Calendar;

public abstract class Gadget implements Switch {

    boolean currentStatus = false;
    Timestamp timestamp,timestampAfterSwitch;

    @Override
    public String switchedOnDuration() {

        Calendar cal = Calendar.getInstance();

        timestampAfterSwitch = new Timestamp(cal.getTime().getTime());

        long milliseconds = timestampAfterSwitch.getTime() - timestamp.getTime();
        int seconds = (int) milliseconds / 1000;
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        seconds = (seconds % 3600) % 60;

        return hours+":"+minutes+":"+seconds;

    }

    @Override
    public void switchGadget() {

        Calendar cal = Calendar.getInstance();

        java.util.Date date = new java.util.Date();
        timestamp = new Timestamp(date.getTime());

        cal.setTimeInMillis(timestamp.getTime());

        cal.add(Calendar.SECOND, 98765);

        if(currentStatus==true){
            currentStatus = false;
        }
        else{
            currentStatus = true;
        }

    }

    public boolean getCurrentStatus(){
        return currentStatus;
    }

}
