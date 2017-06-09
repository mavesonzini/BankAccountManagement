package com.mavesonzini;
/**
 * Created by mave on 09/06/2017.
 */

import  java.text.NumberFormat;

public class Account {
    int accountNumber;
    double balance;
    String name;

    public Account(String x, int y, double z) {
        name = x;
        accountNumber = y;
        balance = z;
    }

    public void deposit(double x) {
        balance = balance + x;
    }

    public void withdraw(double x, double fee) {
        balance = balance - x - fee;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (accountNumber + "\t" + name + "\t" + fmt.format((balance)));
    }
}
