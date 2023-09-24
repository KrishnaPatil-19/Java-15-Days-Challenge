/*Task 5 projects is partially in linux and partially in windows due to disk mount problem. Further projects will be created in windows until the issue is resolved.*/

package com.company;

public class cwh_35_practice_set_on_methods {
    static void multiplication(int n)
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(n + " X " + i + " = " + n*i);
        }
    }

    static void pattern1(int n)
    {
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sumRec(int n)
    {
        //Base condition
        if(n==1)
        {
            return 1;
        }
        return n + sumRec(n-1);
    }

    static void pattern2(int n)
    {
        int a = n;
        for(int c=1;c<=n;c++)
        {
            System.out.println();
            for (int b=1;b<=a;b++)
            {
                System.out.print("*");
            }
            a--;
        }
    }

    static int fib(int n)
    {
        if(n==1 || n==2)
        {
            return n-1;
        }
        else
        {
            return fib(n-1) + fib(n-2);
        }
    }

    static float avg(int n, int ...arr)
    {
        float result = n, count = 1;
        float avg;
        for(int a: arr)
        {
            result += a;
            ++count;
        }
        avg = result/count;
        return avg;
    }

    //pattern 2 rec
    static void pattern2_rec(int n)
    {
        if(n>0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            pattern2_rec(n - 1);
        }
    }

    static void pattern1_rec(int n)
    {
       if(n>0)
       {
           pattern1_rec(n-1);
       }
       for(int i=0; i<n; i++)
       {
           System.out.print("*");
       }
        System.out.println();
    }

    public static void main(String[] args) {
        /*Q.1 Write a Java method to print multiplication table of a number n.*/
        //multiplication(5);

        /*Q.2 Write a Java program using functions to print the following pattern : -
        *
        * *
        * * *
        * * * *
        */
        //pattern1(9);

        /*Q.3 Write a recursive function to calculate sum of first n natural numbers.*/
        /*int c = sumRec(3);
        System.out.println(c);*/

        /*Q.4 Write a function to print the following pattern : -
        * * * *
        * * *
        * *
        *
        */
        //pattern2(5);


        /*Q.5 Write a function to print nth term of fibonacci series using recursion.*/
        /*int result = fib(92);
        System.out.println(result);*/

        /*Q.6 Write a function to find average of a set of numbers passed as arguments.*/
//        System.out.println("Average of 19, 4, 20, 6, 7, 9, 20, 4 is: " + avg(19, 4, 20, 6, 7, 9, 20, 4));

        /*Q.7 Repeat Q.4 using recursion.*/
//        pattern2_rec(5);

        /*Q.8 Repeat Q.2 using recursion.*/
//        pattern1_rec(5);

        /*Q.9 Write a function to convert Celsius temperature into Fahrenheit.*/
        /*float cels = 50, fahr;
        fahr = (cels * 9.0f/5.0f) + 32.0f;
        System.out.println(cels + " celsius = " + fahr + " fahrenheit");*/

        /*Q.10 Repeat 3 using iterative approach.*/
        int x = 10, y = 0;
        for(int i = 1; i<=x; i++)
        {
            y = i + y;

        }
        System.out.println(y);
    }
}
