package com.company;

import java.util.Scanner;
import java.util.Random;

public class cwh_20_RockPaperScissorGameChallenge {
    public static void main(String[] args) {
        System.out.println("Welcome to my Rock, Paper & Scissors game!");
        //User's choice
        System.out.println("Enter your choice as follows : ");
        System.out.println("For Rock ---> 1");
        System.out.println("For Paper ---> 2");
        System.out.println("For Scissors ---> 3");
        System.out.print("Your Choice : ");
        Scanner usrChoice = new Scanner(System.in);
        int uChoice = usrChoice.nextInt();
        switch (uChoice) {
            case 1 -> System.out.println("You chose Rock!");
            case 2 -> System.out.println("You chose Paper!");
            case 3 -> System.out.println("You chose Scissors!");
            default -> System.out.println("Invalid Input.");
        }
        //Computer's choice
        System.out.println("CPU is choosing...");
        Random cpuChoice = new Random(); //for generating a random number, which will be used as CPU's choice
        int cChoice = cpuChoice.nextInt(1,4);
        switch (cChoice) {
            case 1 -> System.out.println("CPU chose Rock!");
            case 2 -> System.out.println("CPU chose Paper!");
            case 3 -> System.out.println("CPU chose Scissors!");
            default -> System.out.println("CPU made an error."); //this one is highly/almost unlikely to happen, but I added it anyway just in case.
        }
        //Winner declaration //1 > Rock, 2 > Paper, 3 > Scissors
        if (uChoice == cChoice)
        {
            System.out.println("It's a Tie!");
        }
        else if (uChoice == 1 && cChoice == 2 || uChoice == 2 && cChoice == 3 || uChoice == 3 && cChoice == 1)
        {
            System.out.println("CPU won the game!");
        }
        else if (uChoice == 2 && cChoice == 1 || uChoice == 3 && cChoice == 2 || uChoice == 1 && cChoice == 3)
        {
            System.out.println("You won the game!");
        }
        else
        {
            System.out.println("An error occurred, the game can't proceed further.");
        }
    }
}
