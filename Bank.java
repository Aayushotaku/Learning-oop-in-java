import Packages_and_Access_modifires.account;
public class Bank {
    public static void main(String[] args) {
        account a1 = new account();
        a1.name = "John Doe";
        a1.account_no = 123456789;
        a1.type = "Savings";
        a1.balance = 1000.00;
        a1.show();
    }
    
}
