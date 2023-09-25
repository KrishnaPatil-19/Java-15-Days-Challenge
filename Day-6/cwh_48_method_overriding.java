package com.company;

class A{
    public int a;
    public int krishna(){
        return 4;
    }

    //meth here stands for method and doesn't mean the blue-stuff bootleg Heisenberg made in a RV with his crackhead assistant.
    public void meth2(){
        System.out.println("Im method 2 of class A");
    }
}

class B extends A{
    @Override
    public void meth2(){
        System.out.println("Im method 2 of class B");
    }
    public void meth3(){
        System.out.println("I'm method 3 of class B");
    }
}

public class cwh_48_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
