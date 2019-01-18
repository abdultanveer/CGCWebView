package com.example.admin.cgcwebview.concepts.interfaces;

public class GEAppliances implements ISwitchBoard {
    @Override
    public void switchOnFan() {
        System.out.println("GE fan is running");

    }

    @Override
    public void switchonLight() {
        System.out.println("GE light is running");

    }

    @Override
    public void switchonAC() {
        System.out.println("GE AC is running");


    }
}
