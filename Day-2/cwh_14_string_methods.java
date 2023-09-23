package com.company;

public class cwh_14_string_methods {
    public static void main(String[] args) {
        String name = "Krishna";
//        System.out.println(name);
        int value = name.length();
//        System.out.println(value);

//        String lstring = name.toLowerCase();
//        System.out.println(lstring);
//
//        String ustring = name.toUpperCase();
//        System.out.println(ustring);
//
//        String nonTrimmedString = "      Krishna      ";
//        System.out.println(nonTrimmedString);
//        String trimmedString = nonTrimmedString.trim();
//        System.out.println(trimmedString);

//        System.out.println(name.substring(2));
//        System.out.println(name.substring(1,4));

        /*System.out.println(name.replace('r', 'b'));
        System.out.println(name.replace("h", "van"));*/

        /*System.out.println(name.startsWith("Bhu"));
        System.out.println(name.endsWith("na"));*/

//        System.out.println(name.charAt(4));

//        String modifiedName = "Krishnhna";
        /*System.out.println(modifiedName.indexOf("h"));
        System.out.println(modifiedName.indexOf("hn", 4));*/
//        System.out.println(modifiedName.lastIndexOf("hn", 6));

//        System.out.println(name.equals("Krishna"));
        System.out.println(name.equalsIgnoreCase("KriShNa"));

        System.out.println("I am escape sequence \t character");
    }
}
