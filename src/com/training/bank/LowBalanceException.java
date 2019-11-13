package com.training.bank;

public class LowBalanceException extends Exception {

    LowBalanceException(){

    }

    public void getMyMessage(double v){
        System.out.println("You are trying to withdraw "+v+" more than your balance amount");
    }


}
