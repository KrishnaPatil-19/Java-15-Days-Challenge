//Part of 5th Exercise.
//Yet to be completed.

package com.codewithharry.shape;

/*class Rectangle{
    public void rectArea(int l, int b)
    {
        System.out.println("Area of Rectangle = " + 2*(l+b));
    }
}

class Square{

    public void sqArea(int l) {
        System.out.println("Area of Square = " + 4*l);
    }
}

class Circle{
    public int radius;
    Circle(int r){
        this.radius = r;
    }
    public float circleArea(){
        return (float) (Math.PI * this.radius * this.radius);
    }
}

class Cylinder extends Circle{
    public int height;
    Cylinder(int r, int h){
        super(r);
        this.height = h;
    }
    public double cylinderVolume(){

        return (float) (Math.PI * this.radius * this.radius * this.height);
    }
}*/



public class shapes {
    int dim1, dim2;
    shapes(int dim1, int dim2)
    {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public int getDim1(){
        return this.dim1;
    }
    public int getDim2(){
        return this.dim2;
    }
    public void setDim1(int dim1){
        this.dim1 = dim1;
    }
    public void setDim2(int dim2){
        this.dim2 = dim2;
    }

    public static void main(String[] args) {
        System.out.println("This is solution for Ex5");
        Rectangle rc = new Rectangle(5,4);
        System.out.println(rc.area());
    }
}
