/*Filename : - cwh_49_dynamic_method_dispatch.java*/
//50th video was just solution to Exercise 3 - Guess the number game.

package com.company;

class Phone{

    public void showTime(){
        System.out.println("Time is...");
    }
    public void on(){
        System.out.println("Turning on phone.");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music.");
    }
    public void name(){
        System.out.println("My name is Java from class Two.");
    }
}

public class Main {
    public static void main(String[] args) {
//        Phone obj = new Phone(); //allowed
//        SmartPhone smobj = new SmartPhone(); //allowed
//        obj.name();
        Phone obj = new SmartPhone(); //Yes, it is allowed
//        SmartPhone obj2 = new Phone(); //not allowed
        obj.showTime();
        obj.on();
//        obj.music(); //not allowed
    }
}