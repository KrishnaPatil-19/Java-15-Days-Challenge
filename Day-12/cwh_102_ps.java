package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class cwh_102_ps {
    public static void main(String[] args) {
        /*Q.1 Create an ArrayList and store names of 10 students inside it. Print it using a for-each loop.*/
        ArrayList ar = new ArrayList<>();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
        for (Object o: ar){
            System.out.println(o);
        }

        /*Q.2 Use the date class in Java to print time in the following format : -
                21:47:02
        */
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());

        /*Q.3 Repeat Q.2 using calendar class.*/
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        /*Q.4 Repeat 2 using java.time API.*/
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String myDate = dt.format(df);
        System.out.println(myDate);

        /*Q.5 Create a Set in Java. Try to store duplicate elements inside this Set and verify that only one instance is stored.*/
        HashSet<Integer> s = new HashSet();
        s.add(5);
        s.add(6);
        s.add(46);
        s.add(68);
        s.add(9);
        s.add(6);
        System.out.println(s);

    }
}
