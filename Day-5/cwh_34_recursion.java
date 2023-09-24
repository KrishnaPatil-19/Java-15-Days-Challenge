package com.company;

import java.util.Scanner;

public class cwh_34_recursion {
    /*static int factorial (int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n * factorial(n-1);
        }
    }*/

    private static long fibonacci(int n)
    {
        if(n<=1)
        {
            return n;
        }

        if(fibonacciCache[n] != 0)
        {
            return fibonacciCache[n];
        }
        long nthFibonacciNumber = (fibonacci(n-1) + fibonacci(n-2));
        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }

    public static long [] fibonacciCache;

    public static void main(String[] args) {
        int n;
        Scanner ip = new Scanner(System.in);
        System.out.println("Calculating Fibonacci series in Java using Recursion...");
        System.out.print("Enter a number till which to calculate Fibonacci series : ");
        n = ip.nextInt();

        fibonacciCache = new long[n+1];

        for(int i = 0; i <= n; i++)
        {
            System.out.print(fibonacci(i) + " ");
        }

        /*System.out.println("Calculating factorial using recursion in Java...");
        System.out.print("Enter a number to calculate its factorial : ");
        n = ip.nextInt();
        int fact = factorial(n);
        System.out.println("Factorial of " + n + " = " + fact);*/
    }
}
