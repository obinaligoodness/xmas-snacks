package chapterTwo;

import java.util.Scanner;

public class Jumia {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number\npress 1 for books\npress 2 for bags\npress 3 for shoes");
        int number = input.nextInt();
        if(number>=1 && number<=3){
            while(number==1){
            System.out.println("How many books would you like to buy?");
              int unit = input.nextInt();
              int price = unit * 300;
              System.out.printf("the price is %d%n",price);
              System.out.println("Do you still want to continue");
               boolean decision = input.nextBoolean();
               if(decision == true ){
                   System.out.println("Enter a number\npress 1 for books\npress 2 for bags\npress 3 for shoes");
                   number = input.nextInt();
                   while(number==2){
                       System.out.println("How many bags would you like to buy?");
                       int unit2 = input.nextInt();
                       int price2 = unit2 * 6000;
                       System.out.printf("the price is %d%n",price2);
                       System.out.println("Do you still want to continue");
                       boolean decision2 = input.nextBoolean();
                       if(decision2 == true ){
                           System.out.println("Enter a number\npress 1 for books\npress 2 for bags\npress 3 for shoes");
                           number = input.nextInt();
                           while(number==3){
                               System.out.println("How many shoes would you like to buy?");
                               int unit3 = input.nextInt();
                               int price3 = unit3 * 5000;
                               System.out.printf("the price is %d%n",price3);
                               System.out.println("Do you still want to continue");
                               System.out.println("Enter a number\npress 1 for books\npress 2 for bags\npress 3 for shoes");
                       number = number + 2;

               }

        }

}
}}}}}
