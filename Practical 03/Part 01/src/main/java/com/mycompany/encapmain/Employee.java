package com.mycompany.encapmain;
public class Employee 
{
    private String name;
    private int age;
    private float salary;    
    
    public void setName(String n)
    {
        this.name=n;
    }
    
    public void setAge(int a)
    {
        this.age=a;
    }
    
    public void setSalary(float s)
    {
        this.salary=s;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public float getSalary()
    {
        return salary;
    }   

}
