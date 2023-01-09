package chapterTwo;

public class WorrldPopulation {
    public static void main(String[] args) {

        double wP;
        wP = 7_837_000_000.0;
       double annualpopulation = 67_000_000.0;
       double wP1 = wP + annualpopulation;
       double wP2 = wP1 + annualpopulation;
       double wP3 = wP2 + annualpopulation;
       double wP4 = wP3 + annualpopulation;
       double wP5 = wP4 + annualpopulation;

       System.out.println("World  population in one year: " + wP1);
        System.out.println("World  population in two years: " + wP2);
        System.out.println("World  population in three years: " + wP3);
        System.out.println("World  population in four years: " + wP4);
        System.out.println("World  population in five years: " + wP5);
    }
}
