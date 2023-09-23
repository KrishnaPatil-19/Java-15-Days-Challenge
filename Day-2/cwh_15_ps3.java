package com.company;

public class cwh_15_ps3 {
    public static void main(String[] args) {
//        Q.1 Write a java program to convert a String to lowercase
        String name = "Krishna Patil";
        name = name.toLowerCase();
        System.out.println(name);

//        Q.2 Write a java program to replace spaces with underscores
        String text = "to lower case";
        text = text.replace(" ", "_");
        System.out.println(text);

        /*Q.3 Write a java program to fill in a letter template which looks like below : -
           letter = "Dear <|name|>, Thanks a lot"
           Replace <|name|> with a string (some name)
         */
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>", "Krishna");
        System.out.println(letter);

//        Q.4 Write a java program to detect double and triple spaces in a string
        String myString = ("This string contains  and   triple spaces");
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        /*Q.5 Write a program to format the following letter using escape sequence characters : -
            letter = "Dear Harry, This Java Course is nice. Thanks"
        */
        String myLetter = "Dear Harry, \n\tThis Java Course is nice. \nThanks";
        System.out.println(myLetter);

    }
}
