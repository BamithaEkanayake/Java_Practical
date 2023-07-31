package com.mycompany.encapmain;
public class EncapMain 
{
    public static void main(String[] args) 
    {
        Employee a1=new Employee("Michal",24,25000.00f);
                
        System.out.println("Name: "+a1.getName());
        System.out.println("Age: "+a1.getAge());
        System.out.println("Salary: "+a1.getSalary());  
    }

}
