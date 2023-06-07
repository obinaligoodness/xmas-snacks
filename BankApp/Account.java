package BankApp;

import java.util.Objects;

public class Account {
    private String accountName;
    private int accountNumber;
    private int balance;
    private String pin;

        public void deposit(double amount) {
            balance+=amount;
        }
        public void withdraw(int amount,String pin) {
            if(pin.equals(this.pin))
                balance -= amount;
        }
        public int  checkBalance(String pin){
            if(Objects.equals(pin, this.pin)) {
                return balance;}
            return 0;
       }

    public Account(int accountNumber, String accountName, String pin){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.pin = pin;
    }


    public int getAccountNumber() {
            return accountNumber;
    }
}
