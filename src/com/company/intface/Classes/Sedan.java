package com.company.intface.Classes;

import com.company.intface.Interfaces.PassengerAuto;

public class Sedan implements PassengerAuto {
    @Override
    public void transportPassenger() {
        System.out.println("Седан везет пассажиров");
    }
}
