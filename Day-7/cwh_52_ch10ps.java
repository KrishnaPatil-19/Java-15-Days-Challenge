package com.company;

import java.lang.Math;

class Circle{
    public int radius;
    /*Circle()
    {
        System.out.println("I am non parameterized constructor of circle.");
    }*/
    Circle(int r)
    {
        System.out.println("I am a circle parameterized constructor : ");
        this.radius = r;
    }
    public float circleArea(){
        return (float) (Math.PI * this.radius * this.radius);
    }
}

class Cylinder extends Circle{
    public int height;
    Cylinder(int r, int h){
        super(r);
        System.out.println("I am Cylinder parameterized constructor : ");
        this.height = h;
    }
    public double cylinderVolume(){

        return (float) (Math.PI * this.radius * this.radius * this.height);
    }
}

class Rectangle{
    Rectangle(){
        System.out.println("I am a Rectangle non-parameterized constructor : ");
    }
    Rectangle(int l, int b){
        System.out.println("I am a Rectangle parameterized constructor : ");
        this.length = l;
        this.breadth = b;
    }
    public int length;
    public int breadth;
    public int rArea;


    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void rectangleArea(){
        rArea = this.length * this.breadth;
    }
    public int getrArea() {
        return rArea;
    }

}

class Cuboid extends Rectangle{
    Cuboid(){
        System.out.println("I am a Cuboid non-parameterized constructor : ");
    }

    public int height;
    public int cVol;


    public void setHeight(int height) {
        this.height = height;
    }

    Cuboid(int l, int b, int h) {
        super(l, b);
        System.out.println("I am a Cuboid parameterized constructor");
        this.height = h;
    }

    public void cuboidVolume() {
        cVol = this.length * this.breadth * this.height;
    }
    public int getcVol() {
        return cVol;
    }
}

public class cwh_52_ch10ps {
    public static void main(String[] args) {
        /*Q.1 Create a class Circle and use inheritance to create another class Cylinder from it.*/
        /*Cylinder c = new Cylinder(6,18);
        System.out.println("Area of Circle c (parent class) = " + c.circleArea());
        System.out.println("Volume of Cylinder c (derived class) = " + c.cylinderVolume());*/

//        Circle objc = new Circle(12);


        /*Q.2 Create a class Rectangle and use inheritance to create another class cuboid. Try to keep it as close to real world scenario as possible.*/
        /*Cuboid r = new Cuboid(12,4,5);
        System.out.println("Area of Rectangle r (parent class) = " + r.rectangleArea());
        System.out.println("Volume of Cuboid r (derived class) = " + r.cuboidVolume());*/

        /*Q.3 Create methods for area and volume in (1).*/
        //Done in (1).

        /*Q.4 Create methods for area & volume in (2). Also create getters and setters.*/
//        Cuboid r = new Cuboid(12,4,5);
        /*r.setHeight(12);
        r.setLength(4);
        r.setHeight(5);*/
        /*r.rectangleArea();
        r.cuboidVolume();
        System.out.println(r.getrArea());
        System.out.println(r.getcVol());*/

        /*Q.5 What is the order of constructor execution for the following inheritance hierarchy :
                Base
                 V
              Derived1
                 V
              Derived2
         Derived2 obj = new Derived2();
        Which constructor(s) will be executed & in what order?*/
//        All three constructors will be executed and the order of execution will be : Base>Derived1>Derived2

    }
}
