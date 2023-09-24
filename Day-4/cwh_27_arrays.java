package com.company;

public class cwh_27_arrays {
    public static void main(String[] args) {
        /*float [] marks = {98.1f,45.7f,79.5f,99.5f,80.5f};
        String [] students = {"Krishna", "Bhuvan", "Mohit", "Tushar"};
        System.out.println(students.length);
        System.out.println(students[1]);*/

        int [] marks = {98,45,79,99,80};
        System.out.println(marks.length);
        //Displaying the array (naive way)
        System.out.println("Displaying array using the naive method : ");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //Displaying the array (for loop)
        System.out.println("Displaying array using for loop : ");
        for (int i = 0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }

//        Quick quiz: Display array in reverse order (for loop)
        System.out.println("Displaying the array in reverse order : ");
        for (int i = marks.length - 1; i>=0; i--)
        {
            System.out.println(marks[i]);
        }

//        Quick-quiz: Displaying array using for-each loop
        System.out.println("Displaying using for-each loop : ");
        for(int element: marks)
        {
            System.out.println(element);
        }
    }
}
