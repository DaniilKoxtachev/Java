package com.company.Threads;

public class mainThread {
    static {
        System.out.println("start thread main");
    }
    public static void main(String[] args) throws InterruptedException {
        Thread talk = new TalkThread();
        Thread walk = new Thread(new WalkRunnable());
        printTreadInfo(talk);
        printTreadInfo(walk);
        walk.start();
        talk.start();
        talk.join();
        printTreadInfo(talk);
        printTreadInfo(walk);

        printTreadInfo(Thread.currentThread());
        System.out.println("Завершение потока main");


        /*ThreadGroup tg = new ThreadGroup("TG1");
        tg.setMaxPriority(Thread.MIN_PRIORITY);

        Thread talk = new TalkThread(tg,"talk");
        Thread walk = new Thread(tg,new WalkRunnable());
        talk.setPriority(Thread.MAX_PRIORITY);
        System.out.println(talk.getPriority());
        System.out.println(walk.getPriority());
        talk.start();
        walk.start();
        System.out.println(walk.getThreadGroup().getName());*/
    }
    public static void printTreadInfo(Thread thread){
        System.out.println("Статус потока"+ thread.getName()+":"+thread.getState());
    }
}
