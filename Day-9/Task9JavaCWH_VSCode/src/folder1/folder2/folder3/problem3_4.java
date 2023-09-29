//Here both problem3 and problem4 are solved

package folder1.folder2.folder3;

class Calculator{

    public void calculate(int a, int b)
    {
        System.out.println("Your result is : " + a+b);
    }
}
class ScCalculator{
    public void calculate(int a, int b)
    {
        System.out.println("Your result is : " + Math.sin(a+b));
    }
}
class HyCalculator{
    public void calculate(int a, int b)
    {
        System.out.println("Your result is : " + a+b);
        System.out.println("Your result is : " + Math.sin(a+b));
    }
}

public class problem3_4
{
    protected int proInt = 4;
    int defInt = 41;
    public static void main(String[] args) {
        System.out.println("Hello guys...");
    }
}