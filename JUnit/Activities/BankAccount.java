package Activities;

import Activities.NotEnoughFundsException;

public class BankAccount {
    private Integer balance;

    //constructor
    public BankAccount(Integer initialBalance){
        balance=initialBalance;
    }

    //Add method to calculate
    //Balance amt after withdrawl
    public Integer withdraw(Integer amount){
        if(balance<amount){
            throw new NotEnoughFundsException(amount,balance);
        }
        balance-=amount;
        return balance;
    }
}

