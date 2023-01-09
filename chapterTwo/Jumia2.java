package chapterTwo;

import java.util.Scanner;

public class Jumia2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number\npress 1 for books\npress 2 for bags\npress 3 for shoes");
        int number = input.nextInt();
        while(number>=1 && number<=3){
            if(number==1){
        System.out.println("How many books would you like to buy?");
        int unit = input.nextInt();
        int price = unit * 300;
        System.out.printf("The price is %d%n",price);
        System.out.println("Do you still want to continue?");
        boolean decision = input.nextBoolean();
        if(decision==true){System.out.println("Enter a number\npress 1 for books\npress 2 for bags\npress 3 for shoes");
        number=input.nextInt();}
        else if(decision==false){System.out.println("Thank you");
        number=-1;}
        }
            if(number==2){
                System.out.println("How many bags would you like to buy?");
                int unit = input.nextInt();
                int price = unit * 500;
                System.out.printf("The price is %d%n",price);
                System.out.println("Do you still want to continue?");
                boolean decision = input.nextBoolean();
                if(decision==true){System.out.println("Enter a number\npress 1 for books\npress 2 for bags\npress 3 for shoes");
                    number=input.nextInt();}
                else if(decision==false){System.out.println("Thank you");
                number = -1;}
            }

            if(number==3){
                System.out.println("How many shoes would you like to buy?");
                int unit = input.nextInt();
                int price = unit * 700;
                System.out.printf("The price is %d%n",price);
                System.out.println("Do you still want to continue?");
                boolean decision = input.nextBoolean();
                if(decision==true){System.out.println("Enter a number\npress 1 for books\npress 2 for bags\npress 3 for shoes");
                    number=input.nextInt();}
                else if(decision==false){System.out.println("Thank you");
                number = -1;}
            }
    }





















    }}

