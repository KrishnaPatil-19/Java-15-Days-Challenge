package com.company;

@FunctionalInterface
interface myFunctionalInteface{
    void thisMethod();
//    void thisMethod2();
}

/*class NewPhone extends Phone{ //Class Phone was declared in a seperate file which is port of another project but the code in the lecture was written as seen in this file.
    @Override
    public void showTime(){
        System.out.println("Time is 8PM");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}*/
public class cwh_108_java_annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        /*NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(5, 6);*/ //Refer to comment on line 9
    }
}