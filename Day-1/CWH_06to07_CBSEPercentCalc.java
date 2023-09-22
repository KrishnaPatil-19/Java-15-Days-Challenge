/*Exercise 1.1 : - Write a Program to calculate percentage of a given student in CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard (marks out of 100)*/

package com.company;

import java.util.Scanner;

public class CWH_06to07_CBSEPercentCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float eng, phy, chem, maths, bio, res;
        System.out.print("Enter max possible marks in a subject : ");
        float total = sc.nextFloat();
        System.out.print("Enter you marks in English : ");
        eng = sc.nextFloat();
        System.out.print("Enter you marks in Physics : ");
        phy = sc.nextFloat();
        System.out.print("Enter you marks in Chemistry : ");
        chem = sc.nextFloat();
        System.out.print("Enter you marks in Mathematics : ");
        maths = sc.nextFloat();
        System.out.print("Enter you marks in Biology : ");
        bio = sc.nextFloat();
        res = (eng + phy + chem + maths + bio) * 100 / (total*5);
        System.out.println("Your total percentage = " + res + "%");
    }
}
