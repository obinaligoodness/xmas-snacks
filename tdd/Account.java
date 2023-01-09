package tdd;

public class Account {
    private int balance;
    private int withdraw;
    public void deposit(int amount) {
        if(amount >= 0)
        this.balance += amount;
    }
    public void withdraw(int amount ){
       if(amount<=balance && amount>0)
        this.withdraw = balance - withdraw;
    }

    public int getBalance() {
        return balance;
    }

    public int getWithdraw() {
        return withdraw;
    }
}
