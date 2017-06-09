package com.mavesonzini;

/**
 * Created by mave on 09/06/2017.
 */
public class ManageAccount {

    public static void main(String[] args) {

        Account newAccount1 = new Account("Donald trump", 20230715, 400.00);
        Account newAccount2 = new Account("Bill Gates", 31558040, 500.00);
        Account newAccount3 = new Account("Tom Cruise", 44003050, 600.00);

        //Question 1
        newAccount1.deposit(50.00);
        System.out.println(newAccount1.balance);

        newAccount2.withdraw(400.00, 2.50);
        System.out.println(newAccount2.balance);

        newAccount1.deposit(75.00);
        System.out.println(newAccount1.balance);

        System.out.println(newAccount1.toString());
        System.out.println(newAccount2.toString());
        System.out.println(newAccount3.toString());
    }
}
