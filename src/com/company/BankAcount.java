package com.company;

public class BankAcount {
    private double amount;
    public double getAmount(){
        return amount;
    }
    public double deposit(double som){
        return amount+=som;

    }
    public void withdraw(int som) throws LimitExpetion{
        if (amount<som);
        throw new LimitExpetion(" У вас недостаточно денег на счету.\nСчитано с карты :"+amount,amount);
    }

}
