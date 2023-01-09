package chapterTwo;

import java.util.Scanner;

public class TaxCalculator {
    private String name;
    private int salary;


    public void setName(String name){
        this.name = name;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }


    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
       String naMe = input.nextLine();
       taxCalculator.setName(naMe);

        System.out.println("Enter your earning for the year");
        int salaRy = input.nextInt();
        taxCalculator.setSalary(salaRy);

        if(salaRy==30000){
            int tax = (salaRy/100) * 15;
            System.out.printf("Hello %s your annual tax is %d%n",naMe,tax);
        }
        else if(salaRy>30000){
            int tax = (salaRy/100) * 20;
            System.out.printf("Hello %s your annual tax is %d%n",naMe,tax);
        }

    }
}
