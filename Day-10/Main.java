/*Filename : - cwh_76_practice13.java*/


package com.company;

class Practice13a extends Thread{
    public void run()
    {
        /*while (true) {
            System.out.println("Good morning!");
        }*/
        System.out.println("Good morning!");
    }
}
class Practice13b extends Thread{
    public void run()
    {
        /*while (false) {
            try {
                Thread.sleep(200);
            }
            catch (Exception a)
            {
                System.out.println(a);
            }
            System.out.println("Welcome");
        }*/
//        System.out.println("Welcome");
    }
}

public class Main {
    public static void main(String[] args) {
        /*Q.1 Write a program to print "good morning" and "welcome" continuously on screen using threads.*/
        Practice13a p1 = new Practice13a();
        Practice13b p2 = new Practice13b();
        /*p1.setPriority(6);
        p2.setPriority(9);*/
        /*System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());*/
        System.out.println(p2.getState());
//        p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());

        /*Q.2 Add a sleep method in welcome thread of Q.1 to delay its execution for 200ms.*/
//      Done in Q.1

        /*Q.3 Demonstrate getPriority() and setPriority() methods in Java threads.*/
//        Done in Q.1

        /*Q.4 How do you get state of given a thread in Java.*/
//      Done in Q.1

        /*Q.5 How do you get reference to the current thread in Java.*/
//      Done in Q.1


    }
}