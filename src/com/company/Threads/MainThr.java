package com.company.Threads;

public class MainThr {
    public static void main(String[] args) throws InterruptedException {
        CommonObject commonObject = new CommonObject();
        for(int i = 1;i<6;i++){
            Thread t;
            t = new Thread(new CounterThread(commonObject));
            t.setName("Поток"+ i);
            t.start();
        }
    }
}
