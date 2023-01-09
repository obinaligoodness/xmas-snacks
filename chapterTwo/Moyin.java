package chapterTwo;

import java.util.Scanner;

public class Moyin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int highestNumber = 0;

        System.out.println("Enter first integer");
        int firstNumber = input.nextInt();

        System.out.println("Enter your second integer");
        int secondNumber = input.nextInt();

        System.out.println("Enter your third integer");
        int thirdNumber = input.nextInt();

        System.out.println("Enter your fourth number");
        int fourthNumber = input.nextInt();

        System.out.println("Enter the last integer");
        int fifthNumber = input.nextInt();

        if(firstNumber>secondNumber && firstNumber>thirdNumber && firstNumber>fourthNumber && firstNumber>fifthNumber){
            System.out.printf( "%d%s%n",firstNumber, " is the highest number");
        }

        if(secondNumber>firstNumber && secondNumber>thirdNumber && secondNumber>fourthNumber && secondNumber>fifthNumber){
            System.out.printf( "%d%s%n",secondNumber, " is the highest number");
        }
        if(thirdNumber>firstNumber  && thirdNumber>secondNumber && thirdNumber>fourthNumber && thirdNumber>fifthNumber){
            System.out.printf( "%d%s%n",thirdNumber, " is the highest number");
        }
        if(fourthNumber>firstNumber && fourthNumber>secondNumber && fourthNumber>thirdNumber && fourthNumber>fifthNumber){
            System.out.printf( "%d%s%n",fourthNumber, " is the highest number");
        }
        if(fifthNumber>firstNumber && fifthNumber>secondNumber && fifthNumber>thirdNumber && fifthNumber>fourthNumber){
            System.out.printf( "%d%s%n",fifthNumber, " is the highest number");
        }
        if(firstNumber<secondNumber && firstNumber<thirdNumber && firstNumber<fourthNumber && firstNumber<fifthNumber){
            System.out.printf( "%d%s%n",firstNumber, " is the lowest number");
        }

        if(secondNumber<firstNumber && secondNumber<thirdNumber && secondNumber<fourthNumber && secondNumber<fifthNumber){
            System.out.printf( "%d%s%n",secondNumber, " is the lowest number");
        }
        if(thirdNumber<firstNumber  && thirdNumber<secondNumber && thirdNumber<fourthNumber && thirdNumber<fifthNumber){
            System.out.printf( "%d%s%n",thirdNumber, " is the lowest number");
        }
        if(fourthNumber<firstNumber && fourthNumber<secondNumber && fourthNumber<thirdNumber && fourthNumber<fifthNumber){
            System.out.printf( "%d%s%n",fourthNumber, " is the lowest number");
        }
        if(fifthNumber<firstNumber && fifthNumber<secondNumber && fifthNumber<thirdNumber && fifthNumber<fourthNumber){
            System.out.printf( "%d%s%n",fifthNumber, " is the lowest number");
        }


        }

        }

