package com.company;

class MyThr extends Thread{
    public MyThr(String name)
    {
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank you!");
        /*while (true){
            System.out.println("I'm a thread");
        }*/
    }
}

public class cwh_73_thread_constructor {
    public static void main(String[] args) {
        MyThr t = new MyThr("Bhuvan");
        t.start();
        System.out.println("The ID of the thread t is: " + t.getId());
        System.out.println("The name of the thread t is: " + t.getName());
    }
}
