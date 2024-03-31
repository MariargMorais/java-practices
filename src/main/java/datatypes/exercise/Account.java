package datatypes.exercise;

import java.math.BigDecimal;

//Your task is to create a Java class called Account that models a simple bank account.
// The class should have the following methods:
//
//Constructor:
//The class should have a no-args constructor that initializes the balance (the only field in the class) to zero.
//
//Methods:
//public void deposit(BigDecimal amount): This method should allow you to deposit a specified amount into the account, increasing the account balance.
//public void withdraw(BigDecimal amount): This method should allow you to withdraw a specified amount from the account, decreasing the account balance.
//public String getBalanceString(): This method should return the current account balance as a String. Example return value: "50.00"
//
//Constraints:
//Use the java.math.BigDecimal class to handle precision in monetary values.
//You do not need to check for argument validity as this is not the point of this exercise.
//Assume that the balance can be both positive and negative.

public class Account {

    public Account (){
        this.balance = BigDecimal.ZERO;
    }

    public void deposit (BigDecimal amount){
        balance = balance.add(amount);
    }

    public void withdraw (BigDecimal amount){
        balance = balance.subtract(amount);
    }

    public String getBalanceString(){
        return  balance.toString();
    }

    private BigDecimal balance;
}
