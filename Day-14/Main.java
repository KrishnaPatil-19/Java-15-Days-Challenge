/*Filename : - cwh_112.java
  Lecture 113 is solution to Exercise 7.*/

package com.company;

import java.io.FileWriter;
import java.io.IOException;

class myDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}

interface myInt{
    void display();
}

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        /*Q.1 Create a Javadoc of a program using and without using IntelliJ.*/
//        Done in Task/Day 13

        /*Q.2 Create a class and add a method with deprecated annotation. What is its effect on program execution.*/
        /*myDeprecated d = new myDeprecated();
        d.meth1();*/

        /*Q.3 Suppress the generated warnings from Q.2.*/
//      done above main method

        /*Q.4 Create an interface and generate an instance from it.*/
       /* myInt i = new myInt() {
            @Override
            public void display() {
                System.out.println("I am display");
            }
        };*/

        /*Q.5 Write a program to generate multiplication table of a given number and write it to a file.*/
        int i = 9;
        String table = "";
        for (int j = 1; j <= 10; j++){
            table += i + " x " + j + " = " + (i * j);
            table += "\n";
        }

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("MultiplicationTable9.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*Q.6 Repeat Q.5 with numbers from 2-9 and save all these multiplication tables to a folder.*/
//      Done in Q.5


    }
}