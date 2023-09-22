package com.company;

import java.util.Scanner;

public class CWH_Ch1_PS {
    public static void main(String[] args) {
/*//        Q.1 Write a program to add 3 nos in Java : -
        int num1 = 5, num2 = 7, num3 = 9, sum;
        sum = num1 + num2 + num3;
        System.out.println(sum);*/

/*//       Q.2 Write a program to calculate CGPA, using marks of their subjects (out of 100) : -
        float subject1 = 45;
        float subject2 = 95;
        float subject3 = 48;
        float CGPA = (subject1 + subject2 + subject3) / 30;
        System.out.println(CGPA);*/

/*//        Q.3 Write a Java program which asks user to enter their and greets them with "Hello <name>, have a good day" text : -
        System.out.println("Enter your name : ");
        Scanner getName = new Scanner(System.in);
        String name = getName.nextLine();
        System.out.println("Hello " + name + ", have a good day");*/

/*//        Q.4 Write a Java program to convert Kilometers to Miles : -
        System.out.println("Enter distance in Kilometers : ");
        Scanner getKM = new Scanner(System.in);
        double km = getKM.nextFloat();
        double mi = km * 0.621371;
        System.out.println(km + "km = " + mi + "mi");*/

//        Q.5 Write a Java program to detect whether a number entered by the user is Integer or not : -
        System.out.println("Enter a number : ");
        Scanner getNum = new Scanner(System.in);
        System.out.println(getNum.hasNextInt());
    }
}
