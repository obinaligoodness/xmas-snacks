package chapterTwo;

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double retailPrice = 0;
        double total = 0;
        double product1;
        double product2;
        double product3;
        double product4;
        double product5;

        product1 = 2.98;
        product2 = 4.50;
        product3 = 9.98;
        product4 = 4.49;
        product5 = 6.87;

        System.out.println("Enter the product number or 6 to quit");
        int productNumber = input.nextInt();

        System.out.println("Enter quantity sold");
        int quantitySold = input.nextInt();

        while(productNumber<=5){

                switch (productNumber / 1) {
                    case 1:
                        retailPrice = 2.98 * quantitySold;
                        System.out.println(retailPrice);
                        System.out.println("Do you still want to continue?");
                       boolean condition = input.nextBoolean();
                        if(condition==true) {
                            System.out.println("Enter a product number or 6 to quit");
                            productNumber = input.nextInt();
                            System.out.println("Enter quantity sold");
                            quantitySold = input.nextInt();
                            retailPrice = productNumber * quantitySold;
                            System.out.println(retailPrice);
                        }
                        else  System.out.println("Enter 6 to quit");
                        productNumber = input.nextInt();
                        if(productNumber==6){
                            System.out.println("Thank you!");
                        }

                            break;

                    case 2:
                        retailPrice = 4.50 * quantitySold;
                        System.out.println(retailPrice);
                        System.out.println("Do you still want to continue?");
                        condition = input.nextBoolean();
                        if(condition==true) {
                            System.out.println("Enter a product number or 6 to quit");
                            productNumber = input.nextInt();
                            System.out.println("Enter quantity sold");
                            quantitySold = input.nextInt();
                            retailPrice = productNumber * quantitySold;
                            System.out.println(retailPrice);
                        }
                        else  System.out.println("Enter 6 to quit");
                        productNumber = input.nextInt();
                        if(productNumber==6){
                            System.out.println("Thank you!");
                        }
                        break;

                    case 3:
                        retailPrice = 9.98 * quantitySold;
                        System.out.println(retailPrice);
                        System.out.println("Do you still want to continue?");
                        condition = input.nextBoolean();
                        while(condition==true) {
                            System.out.println("Enter a product number or 6 to quit");
                            productNumber = input.nextInt();
                            System.out.println("Enter quantity sold");
                            quantitySold = input.nextInt();
                            retailPrice = productNumber * quantitySold;
                            System.out.println(retailPrice);
                        }
                        if(condition==false){
                         System.out.println("Enter 6 to quit");
                        productNumber = input.nextInt();
                        if(productNumber==6) {
                            System.out.println("Thank you!");
                        }
                        }
                        break;

                    case 4:
                        retailPrice = 4.49 * quantitySold;
                        System.out.println(retailPrice);
                        System.out.println("Do you still want to continue?");
                        condition = input.nextBoolean();
                        if(condition==true) {
                            System.out.println("Enter a product number or 6 to quit");
                            productNumber = input.nextInt();
                            System.out.println("Enter quantity sold");
                            quantitySold = input.nextInt();
                            retailPrice = productNumber * quantitySold;
                            System.out.println(retailPrice);
                        }
                        else  System.out.println("Enter 6 to quit");
                        productNumber = input.nextInt();
                        if(productNumber==6){
                            System.out.println("Thank you!");
                        }
                        break;

                    case 5:
                        retailPrice = 6.87 * quantitySold;
                        System.out.println(retailPrice);
                        System.out.println("Do you still want to continue?");
                        condition = input.nextBoolean();
                        if(condition==true) {
                            System.out.println("Enter a product number or 6 to quit");
                            productNumber = input.nextInt();
                            System.out.println("Enter quantity sold");
                            quantitySold = input.nextInt();
                            retailPrice = productNumber * quantitySold;
                            System.out.println(retailPrice);
                        }
                        else  System.out.println("Enter 6 to quit");
                        productNumber = input.nextInt();
                        if(productNumber==6){
                            System.out.println("Thank you!");
                        }
                        break;
                }
            }
    }

}
