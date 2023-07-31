package com.mycompany.encapmain;
public class EncapMain 
{

    public static void main(String[] args) 
    {
        Employee a1=new Employee("Bogdan",50000.00f,10000.00f);
                                
        System.out.println("Name: "+a1.getName());
        System.out.println("Salary: "+a1.getSalary());  
        System.out.println("Bonus: "+a1.getBonus());  
        System.out.println("Bonus Amount: "+a1.bonusAmount());  
    }
}
