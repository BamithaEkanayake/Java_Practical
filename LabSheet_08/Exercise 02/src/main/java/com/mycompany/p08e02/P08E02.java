package com.mycompany.p08e02;
public class P08E02 
{
    public static void main(String[] args) 
    {
        Circle c=new Circle(5);
        System.out.println("Area: "+c.calculateArea());
        System.out.println("Perimeter: "+c.calculatePerimeter());

        Rectangle r=new Rectangle(5,6);
        System.out.println("Area: "+r.calculateArea());
        System.out.println("Perimeter: "+r.calculatePerimeter());
        
        Triangle t=new Triangle(10,8);
        System.out.println("Area: "+t.calculateArea());
        System.out.println("Perimeter: "+t.calculatePerimeter());
        
    }
}
