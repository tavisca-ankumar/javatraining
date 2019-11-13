package com.training.house;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private String type;
    private List<Gadget> gadgets;

    public Room(){

    }

    public Room(String type){
        gadgets = new ArrayList<>();
        this.type = type;
    }

    public void setGadgets(Gadget gadget){
        gadgets.add(gadget);
        System.out.println(this.getClass().getSimpleName()+" added successfully!!!");
    }

    public void gadgetSwitch(Gadget gadget){

        Gadget tempGadget = gadgets.get(gadgets.indexOf(gadget));
        tempGadget.switchGadget();
        System.out.println(gadget.getClass().getSimpleName()+" is in "+tempGadget.currentStatus+" state");
    }

    public void GadgetCurrentStatusDuration(Gadget gadget){

        System.out.print(gadget.getClass().getSimpleName()+" is in ");
        Gadget tempGadget = gadgets.get(gadgets.indexOf(gadget));
        System.out.println(tempGadget.currentStatus+" state for "+tempGadget.switchedOnDuration() +" time");

    }






}
