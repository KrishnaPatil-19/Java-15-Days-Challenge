//Lec 90 was purely theoretical

package com.company;

import java.util.*;

public class cwh_91_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(15);
        l2.add(18);
        l2.add(19);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,1);
        l1.addAll(0,l2);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        //l1.clear();
        l1.set(1,556);
        l1.isEmpty(); //returns true if an ArrayList is empty
        l1.remove(0); //removes the element at the specified index in an ArrayList
        for (int i=0; i<l1.size(); i++)
        {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
