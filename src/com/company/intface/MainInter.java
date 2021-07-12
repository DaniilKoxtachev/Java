package com.company.intface;

import com.company.intface.Classes.*;
import com.company.intface.Interfaces.Moveable;

public class MainInter {
    public static void main(String[] args){
        Moveable moveable = new Transport();
        Transport transport = new Transport();
        Robot robot = new Robot();
        Pickup pickup = new Pickup();
        Sedan sedan = new Sedan();
        moveable.moveLeft();
        moveable.moveRight();
        /////////////////////
        transport.start();
        transport.moveLeft();
        transport.stop();
        /////////////////////
        robot.moveLeft();
        robot.moveRight();
        /////////////////////
        pickup.transportCargo();
        pickup.transportPassenger();
        /////////////////////////////
        sedan.transportPassenger();
        /////////////////////////////
        TestCloneable tc = new TestCloneable();
        System.out.println(tc instanceof Cloneable);
    }
}
