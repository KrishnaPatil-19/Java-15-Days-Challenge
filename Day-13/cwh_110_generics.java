package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class myGeneric<T1, T2>{
    int val =  344;
    private T1 t1;
    private T2 t2;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public myGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }
}

public class cwh_110_generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
//        ArrayList<int> arrayList = new ArrayList<>(); //This will produce an error
//        arrayList.add("Str1");
        arrayList.add(54);
        arrayList.add(643);
//        arrayList.add(new Scanner(System.in));

        int a = arrayList.get(0);
//        System.out.println(a);

        myGeneric<String, Integer> g1 = new myGeneric(23,"MYString", 56);
        String str = g1.getT1();
        System.out.println(str);
    }
}
