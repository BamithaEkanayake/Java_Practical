package com.mycompany.itemobj;
public class ItemObj 
{

    public static void main(String[] args) 
    {
        Item n1=new Item(12,"Colombo");
        System.out.println("Location: "+n1.getLocation());
        System.out.println("Description: "+n1.getDescription());
        
        n1.setLocation(156);
        n1.setDescription("Alawwa");
        System.out.println("Location: "+n1.getLocation());
        System.out.println("Description: "+n1.getDescription());
        
        Monster m1=new Monster(185,"Kurunegala");
        System.out.println("Location: "+m1.getLocation());
        System.out.println("Description: "+m1.getDescription());
    }
}
