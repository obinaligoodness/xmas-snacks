package chapterTwo;

public class Principal {
    public static void main(String[] args) {
        int principal = 1000;
        double rate = 0.05;
        System.out.printf("%s%20s%n","year","Amount");
        for(int year = 1; year <= 10 ; ++year){
            double amount = principal * Math.pow(1+0.05,year);
            System.out.printf("%4d %,20.2f%n",year,amount);
        }
    }
}
