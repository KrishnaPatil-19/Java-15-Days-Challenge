package com.company;

import org.w3c.dom.ls.LSOutput;

class Base
{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I'm in base and setting x now");
        this.x = x;
    }

    public void printMe()
    {
        System.out.println("I am constructor");
    }
}

class Derived extends Base
{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Animal
{
    public String animal = "I a living being from kingdom Animalia.";
    public void pAnimal()
    {
        System.out.println(animal);
    }
}

class Dog extends Animal
{
    public String species = "I am Dog, a species from kingdom Animalia.";
    public void pDog()
    {
        System.out.println(species);
    }
}

public class cwh_45_inheritance {
    public static void main(String[] args) {
/*//        Creating an object of Base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

//        Creating an object of Derived class
        Derived d = new Derived();
        d.setX(4);
        System.out.println(d.getX());*/

//        This feels like I'm playing God and creating new creatures at random :~)
        Animal canine = new Animal();
        System.out.println(canine.animal);
        Dog GreatDane = new Dog();
        System.out.println(GreatDane.species);
    }
}
