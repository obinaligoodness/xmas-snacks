package chapterTwo;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        int year = 0;
        double worldPopulation = 7_837_000_000.0;
        double numericalIncrease = 67_000_000.0;

        System.out.printf("%s%35s%20s%n","Year","Anticipated World population","Numerical increase");
        while(year<75){
            year = year + 1;
            worldPopulation+=numericalIncrease;
            System.out.printf("%4d %20.2f %26.2f%n",year,worldPopulation,numericalIncrease);

        }

    }
}
