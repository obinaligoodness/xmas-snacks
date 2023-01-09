package chapterTwo;

import java.util.Scanner;

public class AlertTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Alert alert = new Alert();
        System.out.println("Enter your name ");
        String myName = input.nextLine();
        alert.setName(myName);
        System.out.println("Enter account type:");
        String myType = input.nextLine();
        alert.setType(myType);
        System.out.println("Enter your account number: ");
        String acc = input.nextLine();
        alert.setAc_no(acc);
        System.out.println(alert.getName() + " " + alert.getType() + " " + alert.getAc_no());
        System.out.println("Enter deposit amount: ");
        float deposit = input.nextFloat();
        alert.deposit(deposit);
        System.out.println(alert.getDeposit());
        System.out.println("Enter withdraw amount");
        float withdraw = input.nextFloat();
        alert.withdraw(withdraw);
        System.out.println(alert.getWithdraw());
    }
}
