package com.mycompany.p08e01;
abstract class BankAccount 
{
    private int accountNumber;
    private double balance;    
        
    public void setAccNo(int accountNumber)
    {
        this.accountNumber=accountNumber;        
    }
    
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    
    public int getAccNo()
    {
        return accountNumber;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public abstract double calculateInterest();
}
