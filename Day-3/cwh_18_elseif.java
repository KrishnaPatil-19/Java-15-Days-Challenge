package com.company;

import java.util.Scanner;

public class cwh_18_elseif {
    public static void main(String[] args) {
        String var = "krishna";

        //switch-case statement
        switch (var) {
            case "harry" -> System.out.println("You are going to become an adult");
            case "saurabh" -> System.out.println("You are going to join a job");
            case "krishna" -> System.out.println("You are going to retire");
            default -> System.out.println("Enjoy your life");
        }
        System.out.println("Thanks for using my Java code");

        //if-else ladder
        /*int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>56)
        {
            System.out.println("You are experienced");

        } else if (age>46) {
            System.out.println("You are semi experienced");
        } else if (age>36) {
            System.out.println("You are semi-semi experienced.");
        }
        else {
            System.out.println("You are not experienced.");
        }
        if(age>2)
        {
            System.out.println("You are not a baby.");
        }*/
    }
}
