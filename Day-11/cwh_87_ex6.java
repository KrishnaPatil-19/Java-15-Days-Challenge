package com.company;

class invalidInputException extends Exception{
    @Override
    public String toString(){
        return "Cannot add 8 & 9";
    }

    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}

class cannotDivideByZeroException extends Exception{
    @Override
    public String toString(){
        return "Cannot divide by 0";
    }

    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}

class maxInputException extends Exception{
    @Override
    public String toString(){
        return "Input cannot exceed 100000";
    }

    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}
class maxMultiplierException extends Exception{
    @Override
    public String toString(){
        return "Multiplier cannot exceed 7000";
    }

    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}

class customCalculator{
   public double add(double a, double b) throws invalidInputException, maxInputException{
       if (a>100000 || b>100000){
           throw new maxInputException();
       }
        if(a==8 || b==9)
        {
            throw new invalidInputException();
        }
        return a + b;
    }
    double sub(double a, double b) throws maxInputException{
        if (a>100000 || b>100000){
            throw new maxInputException();
        }
        return a - b;
    }
    double mul(double a, double b) throws maxInputException, maxMultiplierException{
        if (a>100000 || b>100000){
            throw new maxInputException();
        }
        if(a>7000 || b>7000)
        {
            throw new maxMultiplierException();
        }
        return a * b;
    }
    double div(double a, double b) throws cannotDivideByZeroException, maxInputException{
        if (a>100000 || b>100000){
            throw new maxInputException();
        }
       if (b==0){
           throw new cannotDivideByZeroException();
       }
        return a / b;
    }
}

public class cwh_87_ex6 {
    public static void main(String[] args) throws invalidInputException, cannotDivideByZeroException, maxInputException, maxMultiplierException{
        customCalculator c = new customCalculator();
//        System.out.println(c.add(8,9));
//        System.out.println(c.div(8,0));
//        System.out.println(c.sub(9,8));
//        System.out.println(c.mul(2,7001));
         /*

        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */

    }
}
