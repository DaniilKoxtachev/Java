package com.company.intface.Classes;

import com.company.intface.Interfaces.Moveable;

public class Transport implements Moveable
{
    @Override
    public void moveLeft() {
        System.out.println("Транспорт Повернул влево");
    }

    @Override
    public void moveRight() {
        System.out.println("Транспорт Повернул вправо");
    }
    public void stop(){
        System.out.println("Транспорт Остановился");
    }
    public void start(){
        System.out.println("Транспорт Начал движение");
    }
}
