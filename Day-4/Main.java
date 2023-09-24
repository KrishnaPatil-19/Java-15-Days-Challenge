/*Filename = cwh_25_practice_set_5*/

package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Q.1 Write a program to print following pattern : -
            ****
            ***
            **
            *
        */
        /*int i, j, n = 4;
        for(i = n; i>0; i--)
        {
            System.out.print("\n");
            for(j = 0; j<i;j++)
            {
                System.out.print("*");
            }
        }*/
        /*Q.2 Write a program to sum first n even numbers using while loop.*/
        /*int i = 0, n = 5, sum = 0;
        while(i<n)
        {
            sum += (2*i);
            i++;
        }
        System.out.println("Sum of even numbers is : " + sum);*/
        /*Q.3 Write a program to print multiplication table of given number n.*/
        /*int i, n, m;
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter number of which you want to print the multiplication table : ");
        n = ip.nextInt();
        System.out.print("Enter the number up to which you want to print the multiplication table : ");
        m = ip.nextInt();
        for (i=1; i<=m; i++)
        {
            System.out.println(n + " X " + i + " = " + n*i);
        }*/
        /*Q.4 Write a program to print multiplication table of 10 in reverse order.*/
        /*int i, n = 10;
        for (i=10; i>=1; i--)
        {
            System.out.println(n + " X " + i + " = " + n*i);
        }*/
        /*Q.5 Write a program to find factorial of a given number using for loops.*/
        /*int i, n, fact = 1;
        System.out.print("Enter a number to calculate Factorial of : ");
        Scanner ip = new Scanner(System.in);
        n = ip.nextInt();
        for (i = 1; i<=n; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " = " + fact);*/
        /*Q.6 Repeat Q.5 using while loop.*/
        /*int i = 1, n, fact = 1;
        System.out.print("Enter a number to calculate Factorial of : ");
        Scanner ip = new Scanner(System.in);
        n = ip.nextInt();
        while(i<=n)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of " + n + " = " + fact);*/
        /*Q.7 Repeat Q.1 using for/while loop.*/
        /*int i = 4;
        while(i > 0) {
            System.out.print("\n");
            int j = 0;
            while(j < i) {
                System.out.print("*");
                j++;
            }
            i--;
        }*/
        /*Q.8 What can be done using one type of loop can also be done using other type of loop. True or false?*/
        //True.

        /*Q.9 Write a program to calculate the sum of the numbers occurring in multiplication table of 8.*/
        /*int i, n, m, res = 0;
        n = 8;
        m = 10;
        for (i=1; i<=m; i++)
        {
            res = res + n*i;
        }
        System.out.println("Sum of numbers occurring in table of " + n + " = " + res);*/
        /*Q.10 A do-while loop is executed : -
        *   1. At least once.
        *   2. At least twice.
        *   3. At most once.*/
        //1. At least once.

        /*Q.11 Repeat Q.3 using for loop.*/
        int i=1, n, m;
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter number of which you want to print the multiplication table : ");
        n = ip.nextInt();
        System.out.print("Enter the number up to which you want to print the multiplication table : ");
        m = ip.nextInt();
        while(i<=m)
        {
            System.out.println(n + " X " + i + " = " + n*i);
            i++;
        }
    }
}