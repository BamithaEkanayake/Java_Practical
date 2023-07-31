package com.mycompany.itemobj;
public class Item 
{
    protected int location;
    protected String description;
    
    public Item(int l,String d)
    {
        location=l;
        description=d;
    }
    
    //Setter Method
    public void setLocation(int l)
    {
        location=l;
    }
    
    public void setDescription(String d)
    {
        description=d;
    }
    
    public int getLocation()
    {
        return location;
    }
    
    public String getDescription()
    {
        return description;
    }
}
