package com.company;

import java.util.Scanner;
import java.util.Random;

/*My version : - Doesn't obey every criterion but works as intended.*/
/*class Game
{
        int rand;
        int userIp;
        int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    public void randNum()
    {
        Random rd = new Random();
        rand = rd.nextInt(1,100);
    }
    public void takeUserInput()
    {
        System.out.print("Guess the number : ");
        Scanner ip = new Scanner(System.in);
        userIp = ip.nextInt();
    }

    public void isCorrectNumber()
    {
        noOfGuesses++;
        if(userIp>rand)
        {
            System.out.println("The number you guessed is greater than the actual no.");
        }
        else if(userIp<rand)
        {
            System.out.println("The number you guessed is smaller than the actual number.");
        }
        else
        {
            System.out.println();
            System.out.println("Congrats! You guessed the number correctly.");
            System.out.format("You guessed it in %d attempts.", noOfGuesses);
        }
    }
}

public class cwh_43_exercise3 {
    public static void main(String[] args) {

            *//*Create a class Game, which allows a user to play "Guess the Number" game once. Game should have the following methods : -
            1. Constructor to generate random numbers.
            2. takeUserInput() to take user input of a number.
            3. isCorrectNumber() to detect whether the number entered by the user is true.
            4. Getters and Setters for noOfGuesses.
            Use properties such as noOfGuesses(int), etc., to get this task done!*//*

        Game ksp = new Game();
        ksp.randNum();
        while(ksp.rand != ksp.userIp) {
            ksp.takeUserInput();
            ksp.isCorrectNumber();
        }
    }*/


/*CWH version : - Obeys all the criteria and works as intended.*/
class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too low...");
        } else if (inputNumber > number) {
            System.out.println("Too high...");
        }
        return false;
    }
}

public class cwh_43_exercise3 {
    public static void main(String[] args) {
        /*Solution of this exercise from cwh_50_ex3sol (video title : Java Tutorial: Exercise 3 - Solutions & Shoutouts) : - */
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }

    }
}
