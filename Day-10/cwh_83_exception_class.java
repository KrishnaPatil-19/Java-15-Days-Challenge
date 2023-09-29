package com.company;

import java.util.Scanner;

class myException extends Exception{
    @Override
    public String toString(){
        return " I am toString()";
    }

    @Override
    public String getMessage(){
        return " I am getMessage()";
    }
}

public class cwh_83_exception_class {
    public static void main(String[] args) {
        int a;
        Scanner ip = new Scanner(System.in);
        a = ip.nextInt();
        if(a<99)
        {
            try {
//                throw new myException();
                throw new ArithmeticException("This is an exception");
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
    }
}
