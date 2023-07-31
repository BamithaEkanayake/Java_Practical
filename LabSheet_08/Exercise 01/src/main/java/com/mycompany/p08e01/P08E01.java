package com.mycompany.p08e01;
public class P08E01 
{
    public static void main(String[] args) 
    {
        CheckingAccount b1=new CheckingAccount();
        SavingsAccount b2=new SavingsAccount();
        
        b1.setBalance(1000000.00f);
        b2.setBalance(20000000.00f);
        
        System.out.println("Interest in CheckingAccount: "+b1.calculateInterest());
        System.out.println("Interest in SavingsAccount: "+b2.calculateInterest());
        
    }
}
