package com.training.house;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HouseMainApp {

    List<Room> roomList ;
    static String[] arr = new String[8];
    HouseMainApp(){
        roomList = new ArrayList<>();
        arr[0]="kitchen";arr[2]="DiningArea";arr[5]="Porch";arr[6]="Terrace";
        arr[1]="LivingArea";arr[3]="BedRoom";arr[4]="Washroom";arr[7]="Corridors";
    }

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IllegalAccessException, InstantiationException, InterruptedException {

        System.out.println("Select option for type of room:-");
        System.out.println("1.Kitchen");
        System.out.println("2.LivingArea");
        System.out.println("3.DiningArea");
        System.out.println("4.Bedroom");
        System.out.println("5.Washroom");
        System.out.println("6.Porch");
        System.out.println("7.Terrace");
        System.out.println("8.Corridors");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        HouseMainApp houseMainApp= new HouseMainApp();

        houseMainApp.roomList.add(new Room(arr[ch-1]));

        File file =
                new File("C:\\Users\\ankumar\\Documents\\AllService\\XYZBank\\src\\com\\training\\house\\ObjectClassName");
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ankumar\\Documents\\AllService\\XYZBank\\src\\com\\training\\house\\ObjectClassName");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        Scanner in = new Scanner(bufferedInputStream);

        while (in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(line);
            Class clas = Class.forName(line);
            Gadget gadget = (Gadget) clas.newInstance();
            houseMainApp.roomList.get(0).setGadgets(gadget);
            houseMainApp.roomList.get(0).gadgetSwitch(gadget);
            Thread.sleep(5000);

            houseMainApp.roomList.get(0).GadgetCurrentStatusDuration(gadget);
        }
    }

}
