package com.company;

import java.util.Scanner;

public class cwh_81 {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the array index : ");
        int ind = ip.nextInt();

        System.out.println("Enter the number you want to divide the value with : ");
        int num = ip.nextInt();
        try {
            System.out.println("The value at the array index entered is : " + marks[ind]);
            System.out.println("The value of array divided by number is : " +  marks[ind/num]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException occurred : " + e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException occurred : " + e);
        }
        catch (Exception e)
        {
            System.out.println("Some other exception occurred : " + e);
        }
    }
}
