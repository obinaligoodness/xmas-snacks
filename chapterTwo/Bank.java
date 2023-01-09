package chapterTwo;

public class Bank{
    private String name;
    private int age;
    private double balance;
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }


        public double getbalance(){
            return balance;
        }
       public void deposit(double cash) { balance+=cash;}
       public void withdraw(double cash) {balance -= cash;}


    }
