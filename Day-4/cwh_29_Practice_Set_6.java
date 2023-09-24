package com.company;

public class cwh_29_Practice_Set_6 {
    public static void main(String[] args) {
        /*Q.1 Create an array of 5 floats and calculate their sum.*/
        /*float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element: marks)
        {
            sum += element;
        }
        System.out.println("The value of sum is = " + sum);*/

        /*Q.2 Write a program to find out whether a given integer is present in an array or not.*/
        /*float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 45.8f;
        boolean isInArray = false;
        for(float element: marks)
        {
            if(num==element)
            {
                isInArray = true;
                break;
            }
        }
            if (isInArray)
            {
                System.out.println("The value is present in the Array.");
            }
            else
            {
                System.out.println("The value isn't present in the Array.");
            }*/

        /*Q.3 Calculate average marks from an array containing marks of all students in Physics using for-each loop.*/
        /*float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element: marks)
        {
            sum += element;
        }
        System.out.println("The value of average marks is = " + sum/ marks.length);*/

        /*Q.4 Create a java program to add 2 matrices of size 2x3.*/
        /*int [][] mat1 = {{1,2,3}, {4,5,6}};
        int [][] mat2  = {{2,6,13}, {3,7,1}};
        int [][] result = {{0,0,0},{0,0,0}};

        for(int i = 0; i<mat1.length; i++) //row number of times
        {
            for (int j = 0; j<mat1[i].length; j++) //column number of times
            {
                System.out.format("Setting value for i = %d and j = %d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        //Printing the elements of the 2-D array.
        for(int i = 0; i<mat1.length; i++) //row number of times
        {
            for (int j = 0; j<mat1[i].length; j++) //column number of times
            {
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(""); //Prints a new-line
        }*/

        /*Q.5 Write a Java program to reverse an array.*/
       /* int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(arr.length, 2);
        int temp;
        for(int i=0; i<n; i++)
        {
//            Swap a[i] and a[l-1-i]
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }

        for (int element: arr) {
            System.out.print(element + " ");
        }*/


        /*Q.6 Write a Java program to find out maximum element in an array.*/
        /*int [] arr = {2,6,1,3,4,0,1,0};
        int max = 0;
        for(int e: arr)
        {
            if(e>max)
            {
                max = e;
            }
        }
        System.out.println("The value of maximum element in the array is : " + max );*/

        /*Q.7 Write a Java program to fin d out minimum element in an array.*/
       /* int [] arr = {2,6,1,3,5,9};
        int max = Integer.MAX_VALUE;
        for(int e: arr)
        {
            if(e<max)
            {
                max = e;
            }
        }
        System.out.println("The value of minimum element in the array is : " + max);*/

        /*Q.8 Write a Java program to find out whether an array is sorted or not.*/
        boolean isSorted = true;
        int [] arr = {2,6,1,3,5,9};
//        int [] arr = {1,2,3,4,5,6};
        for (int i = 0; i<arr.length-1; i++)
        {
            if (arr[i] > arr[i+1])
            {
                isSorted = false;
                break;
            }
        }
        if (isSorted)
        {
            System.out.println("The Array is sorted.");
        }
        else
        {
            System.out.println("The Array is not sorted.");
        }

    }
}
