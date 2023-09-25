package com.company;

import java.awt.*;
import java.lang.Math;
class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

}
class rectangle {
    private int length;
    private int breadth;

    public rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

class Sphere {
    private double radius;
    private double height;

    public Sphere(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = radius * 2.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double volume() {
        return  4.0 /3.0 * Math.PI * radius * radius * radius;
    }

}

    public class cwh_44_ps09 {
        public static void main(String[] args) {
            /*Q.1 Create a class cylinder and use getters and setters to set its radius and height.*/
        /*Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(6);
        System.out.println(myCylinder.getRadius());*/

            /*Q.2 Use (1) to calculate surface area and volume of the cylinder.*/
        /*Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());*/

            /*Q.3 Use a constructor and repeat (1).*/
        /*Cylinder myCylinder = new Cylinder(9,12);
//        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
//        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
*/
            /*Q.4 Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters.*/
            rectangle r = new rectangle(12,15);
            System.out.println(r.getLength());
            System.out.println(r.getBreadth());

            /*Q.5 repeat (1) for a sphere.*/
            Sphere sp = new Sphere(5.0,10.0);
            System.out.println(sp.getRadius());
            System.out.println(sp.getHeight());
            System.out.println(sp.volume());
            System.out.println(sp.surfaceArea());

        }
    }
