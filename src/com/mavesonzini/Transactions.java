package com.mavesonzini;

/**
 * Created by mave on 09/06/2017.
 */
public class Transactions {
    public static void main(String[] args) {
        Account account1 = new Account("Ted Murphy", 72354, 102.56);
        Account account2 = new Account("Jane Smith", 69713, 40.00);
        Account account3 = new Account("Edward Demsey", 03757, 759.2);

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);

        account1.deposit(25.85);
        account1.withdraw(60, 2.50);

        System.out.println();
        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println(account3.toString());
    }
}
