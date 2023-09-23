/*Filename : - cwh_17_logical*/

package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("For Logical AND");
        boolean a = true;
        boolean b = false;
        if(a&&b){
               System.out.println("Y");
        }
        else {
               System.out.println("N");
        }
        System.out.println("For logical OR");
        if (a||b)
        {
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
        System.out.println("For logical NOT");
        System.out.println(!a);
        System.out.println(!b);
    }
}