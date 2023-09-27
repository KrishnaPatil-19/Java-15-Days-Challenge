package com.company;

class C1{
    public int x = 5;
    protected int y = 6;
    int z = 7;
    private int a = 8;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

class C2 extends C1{

}

class C3{

}

public class cwh_66_access_modifiers {
    public static void main(String[] args) {
        C1 c = new C1();
//        c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
//        System.out.println(c.a);
    }
}
