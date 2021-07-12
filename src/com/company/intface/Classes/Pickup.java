package com.company.intface.Classes;

import com.company.intface.Interfaces.CargoAuto;
import com.company.intface.Interfaces.PassengerAuto;

public class Pickup implements CargoAuto, PassengerAuto {
    @Override
    public void transportPassenger() {
        System.out.println("Пикап везет груз");
    }

    @Override
    public void transportCargo() {
        System.out.println("Пикап везет пассажиров");
    }
}
