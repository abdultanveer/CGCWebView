package com.example.admin.cgcwebview.concepts.interfaces;

public class Wiring {
    public static void main(String[] args){
        ISwitchBoard switchBoard;
        switchBoard = new GEAppliances();

        switchBoard.switchonAC();
        switchBoard.switchOnFan();
        switchBoard.switchonLight();
    }
}
