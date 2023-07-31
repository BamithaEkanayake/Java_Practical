package com.mycompany.p08e02;
public class Triangle implements Shape
{
    private double lengthT,height;
            
    public double calculateArea()
    {
        return lengthT*height/2;
    }
    
    //Assume that this is a Equilateral Triangle
    public double calculatePerimeter()
    {
        return 3*lengthT;
    }
    
    public Triangle(double lengthT,double height)
    {
        this.lengthT=lengthT;
        this.height=height;
    }
    
    public void setLengthR(double lT)
    {
        lengthT=lT;
    }
    public void setWidth(double h)
    {
        height=h;
    }
    
    public double getLengthT()
    {
        return lengthT;
    }    
    public double getHeight()
    {
        return height;
    }
}
