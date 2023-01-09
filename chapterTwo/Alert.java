
package chapterTwo;

import java.util.Scanner;

public class Alert {
    private String name;
    private String type;
    private String ac_no;
    private float balance;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setType(String t) {
        type = t;
    }

    public String getType() {
        return type;
    }

    public void setAc_no(String a) {
        ac_no = a;
    }

    public String getAc_no() {
        return ac_no;
    }

    public void deposit(float cash) {
        if(cash>0)
        this.balance = cash;
    }

    public float getDeposit() {
        return balance;
    }
    public void withdraw(float cash) {
        if (cash > 0) {
            if(cash<balance)
            this.balance -= cash;
        }
    }

    public float getWithdraw() {
        return balance;
    }

    public float getBalance() {
        return balance;
    }
}