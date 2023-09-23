package com.company;

import java.util.Scanner;

public class cwh_19_ch4_ps {
    public static void main(String[] args) {
        /*Q.1 What will be the output of this program : -
        *  int a = 10;
        *  if(a=11)
        *      System.out.println("I am 11");
        *  else
        *      System.out.println("I am not 11");*/
        //It'll throw an error as assignment operator is used instead of equality operator.

        /*Q.2 Write a program to find out whether a student has passed or failed.
        * If it requires total 40% and at least 33% in each subject to pass.
        * Assume 3 subjects and take marks as input from the user.*/

        /*byte m1, m2, m3;
        System.out.println("Enter your marks in Physics.");
        m1 = sc.nextByte();

        System.out.println("Enter your marks in Chemistry.");
        m2 = sc.nextByte();

        System.out.println("Enter your marks in Biology.");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your overall percentage is: " + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33)
        {
            System.out.println("Congrats, you've been promoted.");
        }
        else
        {
            System.out.println("Sorry, you haven't been promoted. Please try again later.");
        }*/


        /*Q.3 Calculate income tax paid by employee to the government as per the slabs mentioned below : -
        *       Income slab       Tax
        *       2.5l - 5.0l        5%
        *       5.01l - 10.0l      20%
        *       Above 10.0l        30%
        *Note that there is no tax below 2.5l. Take input amount as an input from the user.*/


        /*System.out.println("Enter your income.");
        float tax =  0;
        float income = sc.nextFloat();
        if (income<=2.5)
        {
            tax += 0;
        }
        else if (income>2.5f && income <= 5f)
        {
            tax += 0.05f * (income - 2.5);

        }
        else if (income>5f && income <= 10f)
        {
            tax += 0.05f * (5.0f - 2.5);
            tax += 0.2f * (income - 5f);
        }
        else if (income>10.0f)
        {
            tax += 0.05f * (5.0f - 2.5f);
            tax += 0.2f * (10.0 - 5f);
            tax += 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by employee is: " + tax);*/

        /*Q.4 Write a Java program to find out the day of the week given the number [1 for monday, 2 for tuesday and so on]*/

        /*System.out.print("Enter number for day of the week : ");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Its Monday");
            case 2 -> System.out.println("Its Tuesday");
            case 3 -> System.out.println("Its Wednesday");
            case 4 -> System.out.println("Its Thursday");
            case 5 -> System.out.println("Its Friday");
            case 6 -> System.out.println("Its Saturday");
            case 7 -> System.out.println("Its Sunday");
            default -> System.out.println("Invalid Input");
        }*/


        /*Q.5 Write a Java program to find out whether the year entered by the user is leap year or not.*/

        /*System.out.print("Enter any year : ");
        int year = sc.nextInt();
        if ((year%4==0) && ((year%400==0) || (year%100!=0)))
        {
            System.out.println(year + " is a leap year.");
        }
        else
        {
            System.out.println(year + " is not a leap year.");
        }*/

        /*Q.6 Write a Java program to find out type of website from URL : -
        *           .com -> Commercial website
        *           .org -> Organisation website
        *           .in -> Indian website*/

        System.out.print("Enter a website URL : ");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org"))
        {
            System.out.println("This is an organizational website.");
        } else if (website.endsWith(".com")) {
            System.out.println("This is a commercial website.");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian website.");
        }
        else
        {
            System.out.println("Invalid input.");
        }

    }
}
