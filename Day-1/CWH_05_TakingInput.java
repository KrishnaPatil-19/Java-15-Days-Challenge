package com.company;

import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking user input in Java :");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter no 1 : ");
//        int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("Enter no 2 : ");
//        int b = sc.nextInt();
//        float b = sc.nextFloat();
////        int sum = a + b;
//        float sum = a + b;
//        System.out.println("The sum of " + a + " + " + b + " = " + sum);
        /*boolean b1 = sc.hasNextInt();
        System.out.println(b1);*/
//        String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);
    }
}
