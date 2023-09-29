package com.company;

public class cwh_80_try {
    public static void main(String[] args) {
        int a = 6000, b = 0;
//        Without try
        int c = a / b;
        System.out.println("result is " + c);
//        With try
        /*try {
            int c = a / b;
            System.out.println("result is " + c);
        }
        catch (Exception e)
        {
            System.out.println("Failed to divide, Reason: ");
            System.out.println(e);
        }*/
    }
}
