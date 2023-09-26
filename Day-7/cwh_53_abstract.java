package com.company;

abstract class Parent{
    public Parent(){
        System.out.println("Me base ka constructor hu.");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}

abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I am good");
    }
}

public class cwh_53_abstract {
    public static void main(String[] args) {
//        Parent c = new Parent(); throws error
        Child c = new Child();
    }
}


/*Footnotes : -
* 1. Object of abstract classes cannot be made as abstract classes are just templates for another classes.*/
