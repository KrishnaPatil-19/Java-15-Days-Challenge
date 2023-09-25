//Video 41 is solution to rock, paper and scissor exercise.

/*Filename : - cwh_42_constructors.java*/

package com.company;

class MyMainEmployee
{
    private int id;
    private String name;
    private int salary;

    public MyMainEmployee()
    {
        id = 45;
        name = "Your-name-here";
    }
    public MyMainEmployee(String myName, int myId)
    {
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName, int myId, int mySalary)
    {
        id = myId;
        name = myName;
        salary = mySalary;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        this.name = n;
    }

    public void setId(int i)
    {
        this.id = i;
    }
    public void setSal(int sal) {this.salary = sal;}
    public int getId()
    {
        return id;
    }
    public int getSal()
    {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
//        MyMainEmployee ksp = new MyMainEmployee("Krishna", 19);
        MyMainEmployee ksp = new MyMainEmployee("Krishna", 19, 200000);
//        MyMainEmployee ksp = new MyMainEmployee();
        /*ksp.setName("Krishna");
        ksp.setId(19)*/;
        System.out.println(ksp.getId());
        System.out.println(ksp.getName());
        System.out.println(ksp.getSal());
    }
}