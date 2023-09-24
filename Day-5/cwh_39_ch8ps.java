package com.company;

import java.lang.Math;
class employee
{
    int Salary;
    String name;
    public String getName()
    {
        return name;
    }
    public int getSalary()
    {
        return Salary;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setSalary(int n)
    {
        Salary = n;
    }

}

class CellPhone
{
    public void vibrate()
    {
        System.out.println("Vibrating...");
    }
    public void ring()
    {
        System.out.println("Ringing...");
    }
    public void callFriend()
    {
        System.out.println("Vibrating...");
    }

}
class Square
{
    int side;
    public int area()
    {
        return side * side;
    }
    public int perimeter()
    {
        return 4 * side;
    }
}

class Rectangle
{
    int l, b;
    public int area()
    {
        return l * b;
    }
    public int perimeter()
    {
        return 2*(l+b);
    }
}

class CJ
{
    public void hit()
    {
        System.out.println("CJ's hitting the ballas!");
    }
    public void run()
    {
        System.out.println("CJ's a busta, Ryder said calmly.");
    }
    public void chill()
    {
        System.out.println("CJ is chillin' with Sweet.");
    }
}

class Circle
{
    int radius;

    public double circumference()
    {
        return 2 * Math.PI * radius;
    }
    public double area()
    {
        return Math.PI * radius * radius;
    }
}

public class cwh_39_ch8ps {
    public static void main(String[] args) {
        /*Q.1 Create a class Employee with following properties and methods : -
            a. Salary (property)(int).
            b. getSalary (method returning int).
            c. name (property)(string).
            d. getName (method returning string).
            e. setName (method changing name).*/
        /*employee Krishna = new employee();
        Krishna.setSalary(100000);
        Krishna.setName("Krishna");
        System.out.println(Krishna.getName());
        System.out.println(Krishna.getSalary());*/

        /*Q.2 Create a class cellphone with methods to print "ringing...", "vibrating...", etc.*/
        /*CellPhone vivo = new CellPhone();
        vivo.callFriend();
        vivo.ring();
        vivo.vibrate();*/

        /*Q.3 Create a class square with a method to initialize its side, calculating area, perimeter, etc.*/
        /*Square sq = new Square();
        sq.side = 5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());*/

        /*Q.4 Create a class Rectangle & repeat 3rd question.*/
        /*Rectangle rc = new Rectangle();
        rc.l = 10;
        rc.b = 6;
        System.out.println(rc.area());
        System.out.println(rc.perimeter());*/

        /*Q.5 Create a class CarlJohnson for Rockstar Games capable of hitting (print hitting), running, firing, etc.*/
        CJ ksp = new CJ();
        ksp.hit();
        ksp.run();
        ksp.chill();

        /*Q.6 Repeat Q.4 for a Circle.*/
        /*Circle circ = new Circle();
        circ.radius = 5;
        System.out.println(circ.circumference());
        System.out.println(circ.area());*/
    }
}
