package com.codewithharry.shape;

public class Circle extends shapes{
    Circle(int dim1)
    {
        super(dim1, -1);
    }
    public double area(){
        return Math.PI * this.dim1 * this.dim2;
    }
}
