package com.company.intface.Classes;

import com.company.intface.Interfaces.Moveable;

public abstract class Device implements Moveable {
    @Override
    public void moveRight() {
        System.out.println("Девайс повернул на право");
    }
}
