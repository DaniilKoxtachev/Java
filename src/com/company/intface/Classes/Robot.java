package com.company.intface.Classes;

import com.company.intface.Interfaces.Moveable;

public class Robot implements Moveable {
    @Override
    public void moveLeft() {
        System.out.println("Робот Повернул влево");
    }

    @Override
    public void moveRight() {
        System.out.println("Робот Повернул влево");
    }
}
