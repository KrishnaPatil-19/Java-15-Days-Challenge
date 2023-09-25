package com.company;

class oneClass
{
    int a;

    public int getA() {
        return a;
    }

    oneClass(int v)
    {
        this.a = v;
    }
    public int returnOne()
    {
        return 1;
    }
}

class twoClass extends oneClass
{
    twoClass(int c)
    {
        super(c);
        System.out.println("I am a constructor.");
    }
}

public class cwh_47_this_super {
    public static void main(String[] args) {
        oneClass e = new oneClass(65);
        twoClass d = new twoClass(5);
        System.out.println(e.getA());
    }
}
