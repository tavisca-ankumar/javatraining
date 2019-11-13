//package com.tavisca.today;
//
//
//
//import java.io.*;
//import com.tavisca.today.Account;
//
//public class MyDeserialization {
//
//    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
//
//
//        FileInputStream fileInputStream = new FileInputStream("serializedObject.txt");
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
//        ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
//         Account object = (Account) objectInputStream.readObject();
//        System.out.println(object.getAccoutno());
//        System.out.println(object.getBalance());
//        objectInputStream.close();
//
//    }
//
//}
