# BankAccountManagement
PART II: Bank Account Management

For this part, you are provided with two files: Account.java and Transactions.java

files. The Account.java file contains the implementation of a class for representing bank

accounts.

The class details are given below:

Instance Variables

accountHolder - The name of the person who owns the card.

accountNumber - A unique identifier number.

balance - The current balance of the account.

Methods

Account() - The constructor, taking the account holder's name, accountNumber and

balance.

toString() - Returns a string representation of the Account object. It contains the account

holder's name, the account number, and the balance



getBalance() - Returns the current balance.

Deposit() - Takes an amount as an input and updates the current balance.

Withdrawal() - Takes a withdrawal amount as a parameter and updates the current balance.

You are required to modify the provided files to carry out the following tasks:

1. Create a new application named ManageAccount.java (similar to

Transactions.java) that uses the Account class as follows:

i. Creates three new Accounts initialized as specified below :

“Donald Trump" with £400 as initial balance and account number: 20230715

"Bill Gates" with £500 as initial balance and account number 31558040

"Tom Cruise" with £600 as initial balance and account number 44003050

ii. Deposits £50 in the first account, and prints resulting balance

iii. Withdraws £400 from the second account, and prints resulting balance

iv. Deposits £75 in the first account, and prints resulting balance

v. Prints out Account info for all three accounts

<img width="738" alt="screen shot 2017-06-18 at 12 51 04" src="https://user-images.githubusercontent.com/11363501/27260489-4177d122-5425-11e7-9a5e-584f8e4d4354.png">
<img width="595" alt="screen shot 2017-06-18 at 12 51 42" src="https://user-images.githubusercontent.com/11363501/27260488-4176bf62-5425-11e7-8d2f-2ee1ca58f3c4.png">

2. Examine the getBalance() method in the Account class. Note that it

returns the balance in the account. Add some more code in Manage

Account .java to use the getBalance() method to get the balances of

the three accounts and add them together to obtain the total amount of

money in the bank. Print the total and verify that you are getting the right

amount

3. Modify the withdraw() method to print an appropriate message, when

there is not sufficient fund in the account.

6

4. Add another version of the withdraw() method. This version does NOT

charge a withdrawal fee, so it has only one parameter. ( Java allows you to

define alternative versions of methods using the same method name as

long as the different versions also have different a different number of

parameters)

5. Use this version of the method in ManageAccount.java to withdraw the

taxes from the accounts. (Reminder: The name of this method should still

be withdraw(). You need to write some additional code in

ManageAccount.java to "tax" the accounts by withdrawing 15% from

each of the first three accounts

6. Add another version of the constructor, which takes only 2 parameters:

name and account number (i.e., no initial balance). This constructor creates

an Account object with initial balance £0. Modify ManageAccount.java to

use this version of the constructor to create the “Inland revenue” account.

7. Add additional code to the ManageAccount.java to deposit the total tax

to the “Inland revenue” account.

8. Create a new method that adds interest to the account. The amount added

should be computed according to the rate given by its parameter. For

example, if the acct1 balance is £100.00 and the method is invoked as

follows: acct1.addInterest(0.015); the balance of acct1 should increase by

1.5% (so £100 + £1.50 = £101.50 ). Test your method by invoking it four

times to add interest to all the accounts (including Inland Revenue’s!).

9. Add a method to record the date when the account is opened and test it

using the Account.java

10. Provide an Overdraft facility in the Account.java file which allows a

withdraw as long as the current balance has not reached the overdraft limit.

Test this using the Account.java
