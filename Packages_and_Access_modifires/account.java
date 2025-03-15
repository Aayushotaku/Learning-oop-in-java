 
package Packages_and_Access_modifires;

public class account {
    public String name;
    public int account_no;
    public String type;
     public double balance;
     public void show() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + account_no);
        System.out.println("Type: " + type);
        System.out.println("Balance: " + balance);
    }
}
//This package is used on bank.java to import the account class. 
