package com.company;

public class cwh_26_arrays {
    public static void main(String[] args) {
        /* classroom of 500 students - you have to store marks of these 500 students
            you have 2 options : -
                1. Create 500 variables.
                2. Create an array.
         */
        // There are three main ways to create arrays in java : -
        // 1. Declaration and memory allocation : -
        //int [] marks = new int[5];

        // 2. Declaration and then memory allocation : -
        /*int [] marks;
        marks = new int[5];
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 86;
        // marks[5] = 69; //throws an error*/

        // 3. Declaration, memory allocation and initialization together : -
        int [] marks = {100,60,70,90,86};
        System.out.println(marks[3]);
    }
}
