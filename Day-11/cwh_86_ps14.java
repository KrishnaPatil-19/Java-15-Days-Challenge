package com.company;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

class triedExceed extends Exception{
    @Override
    public String toString(){
        return " Max no of tries exceeded.";
    }
}

public class cwh_86_ps14 {

    public static double tries() throws triedExceed{
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 8;
        marks[2] = 9;
        Scanner ip = new Scanner(System.in);
        int index, i=0;
        while (flag && i<=4){
            try {
                System.out.println("enter the value of index");
                index = ip.nextInt();
                System.out.println("The value of marks[index] is : " + marks[index]);
                break;
            }
            catch (Exception e){
                i++;
            }
        }
        if (i>=5)
        {
            throw new triedExceed();
        }
        return 0;
    }

    public static void main(String[] args) throws triedExceed{
        /*Q.1 Write a Java program to demonstrate syntax, logical and runtime errors.*/
        //Syntax error
        /*int a = 8;
        System.out.println(a+b);*/
        //Logical error
         /*int a = 5, b = 0;
        System.out.println(a/b);*/
        //Runtime error
        /*Scanner ip = new Scanner(System.in);
        int a = 10;
        System.out.print("Enter a num to divide 10 : ");
        int b = ip.nextInt(); //if anything other than an integer is given as input, it'll result in a runtime error.
        System.out.println(a + " / " + b + " = " + a/b);*/

        /*Q.2 Write a Java program that prints "HaHa" during Arithmetic Exception and "HeHe" during an Illegal argument exception.*/
        /*try {
            int a = 666/0;
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Hehe");
        }
        catch (ArithmeticException e)
        {
            System.out.println("HaHa");
        }*/

        /*Q.3 Write a program that allows you to keep accessing an array until a valid index is given. If max retries exceed 5, print "Error".*/
        /*boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 8;
        marks[2] = 9;
        Scanner ip = new Scanner(System.in);
        int index, i=0;
        while (flag && i<=4){
           try {
               System.out.println("enter the value of index");
               index = ip.nextInt();
               System.out.println("The value of marks[index] is : " + marks[index]);
               break;
           }
           catch (Exception e){
               i++;
           }
        }
        if (i>=5)
        {
            throw new triedExceed();
        }*/

        /*Q.4 Modify program in Q.3 to throw a custom Exception if max retries are reached.*/
//      Done in Q.3

        /*Q.5 Wrap the program in Q.3 inside a method which throws your custom Exception.*/
        tries();


    }
}
