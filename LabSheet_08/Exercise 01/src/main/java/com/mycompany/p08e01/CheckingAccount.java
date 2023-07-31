package com.mycompany.p08e01;
class CheckingAccount extends BankAccount
{
    private static final double INTEREST = 0.12;
    
    public double calculateInterest()
    {
        return getBalance()*INTEREST;
    }
}
