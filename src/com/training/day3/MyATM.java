package com.training.day3;

import java.util.Scanner;

public class MyATM {

    int twoThousandNotes;
    int fiveHunderedNotes;
    int hunderedNotes;
    static int[] numberOfNotes = new int[3];

    public MyATM(){
        twoThousandNotes = 50;
        fiveHunderedNotes = 50;
        hunderedNotes = 50;
        for(int i:numberOfNotes){
            numberOfNotes[i]=50;
        }

    }

    public void withdraw(int amount) throws IncorrectRequest, InsuffientBalance {

        if(amount%100!=0){
            throw new IncorrectRequest();
        }
        else if(amount>(50*2000+50*500+50*100)){
            throw new InsuffientBalance();
        }
        else if(amount>20*2000){
            int[] noteCounter = countCurrency(amount);

            twoThousandNotes = twoThousandNotes - noteCounter[0];
            fiveHunderedNotes = fiveHunderedNotes - noteCounter[1];
            hunderedNotes = hunderedNotes - noteCounter[2];

            if(twoThousandNotes<noteCounter[0]){

            }

        }



    }

    public static int[] countCurrency(int amount) {
        int[] notes = new int[]{2000, 500, 100};
        int[] noteCounter = new int[3];

        for (int i = 0; i < 3; i++) {
            if (amount >= notes[i] && noteCounter[i]<numberOfNotes[i]) {
                noteCounter[i] = amount / notes[i];
                numberOfNotes[i]-=noteCounter[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }
        return noteCounter;
    }


    }
