package chapterTwo;

public class BankTest{
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setName("Obinali Goodness");

        String output = bank.getName();
        System.out.println(output);


        System.out.println(bank.getbalance());

        bank.deposit(2000.00);
       System.out.println(bank.getbalance());

        bank.withdraw(230);
       System.out.println(bank.getbalance());
    }
}