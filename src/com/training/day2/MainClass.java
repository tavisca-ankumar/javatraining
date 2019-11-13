package com.training.day2;

public class MainClass {

    static AnonymousInnerClass innerClass = new AnonymousInnerClass(){

        public void display(){

            System.out.println("new class");

        }

    };

    public static void main(String[] args) {

        innerClass.display();
        AnonymousInnerClass innerClass1 = new AnonymousInnerClass();
        innerClass1.display();

    }

}
