/*Advanced Java pt 2 from vid 105 and onwards.
  Lec 105 was purely theoretical.*/

package com.company;

/**
 * This class is to demonstrate what Java doc is and how its used in Java industry.
 * @author Krishna (Caesar ROI)
 * @version 0.1
 * @since 2004
 * @see <a href="https://docs.oracle.com/en/java/javase/21/docs/api/index.html">Java Docs</a>
 */

public class cwh_106_javadoc {
    public void add(int a, int b){
        System.out.println("The sum is: " + a+b);
    }
    public static void main(String[] args) {
        System.out.println("This is my main method");
    }
}
