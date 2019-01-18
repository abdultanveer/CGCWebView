package com.example.admin.cgcwebview.concepts.interfaces;

public class AnchorAppliances implements ISwitchBoard {

    @Override
    public void switchOnFan() {
        System.out.println("anchor fan is running");
    }

    @Override
    public void switchonLight() {
        System.out.println("anchor light is on");

    }

    @Override
    public void switchonAC() {
        System.out.println("anchor AC is on");

    }
}
