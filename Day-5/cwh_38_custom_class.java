/* lecture 36 & 37 were theoretical lectures about OOP Basic concepts & Terminologies. */

package com.company;

class Employee{
    int id;
    int salary;
    String name;
    public void printDetails()
    {
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
        System.out.println();
    }
    public int getSalary()
    {
        return salary;
    }
}

public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class.");
        Employee krishna = new Employee(); //Instantiating a new Employee object
        Employee bhuvan = new Employee(); //Instantiating a new Employee object

        // Setting Attributes for Krishna
        krishna.id = 19;
        krishna.salary = 34;
        krishna.name = "Krishna Patil";

        // Setting Attributes for Krishna
        bhuvan.id = 17;
        bhuvan.salary = 33;
        bhuvan.name = "Bhuvan  Bayas";

        // Printing the attributes
        krishna.printDetails();
        bhuvan.printDetails();
        int salary = krishna.getSalary();
        System.out.println(salary);
//        System.out.println(krishna.id);
//        System.out.println(krishna.name);
    }
}
