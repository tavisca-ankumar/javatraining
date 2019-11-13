//package com.training.day4;
//
//import java.io.BufferedOutputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//
//public class MainApp {
//
//    public static void main(String[] args) throws IOException {
//
//
//        Account acc = new Account();
//
//        FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
//        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
//        objectOutputStream.writeObject(acc);
//        objectOutputStream.close();
//
////    }
//}
