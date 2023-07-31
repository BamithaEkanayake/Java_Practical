package com.mycompany.p08e02;
public class Circle implements Shape
{
    private double radius;
    
    public double calculateArea()
    {
        return Math.PI*radius*radius;
    }
    
    public double calculatePerimeter()
    {
        return Math.PI*2*radius;
    }
    
    public Circle(double radius)
    {
        this.radius=radius;
    }
    
    public void setRadius(double r)
    {
        radius=r;
    }
    
    public double getRadius()
    {
        return radius;
    }
}
