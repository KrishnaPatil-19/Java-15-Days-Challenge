//Problem 2 of PS 12

import java.util.Scanner;

class message{
    public void msg(int a)
    {
        if (a==1)
        {
            System.out.println("Problem 2 of PS 12 solved.");
        }
        else
        {
            System.out.println("Wrong code");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        message ps12 = new message();
        ps12.msg(n);
    }
}