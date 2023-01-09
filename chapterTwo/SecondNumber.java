package chapterTwo;

import java.util.Scanner;

public class SecondNumber {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int firstNumber = input.nextInt();

        System.out.println("Enter an integer");
        int secondNumber = input.nextInt();

        System.out.println("Enter an integer");
        int thirdNumber = input.nextInt();

        System.out.println("Enter an integer");
        int fourthNumber = input.nextInt();

        if(firstNumber>secondNumber && firstNumber>thirdNumber && firstNumber>fourthNumber){
        System.out.println("The highest number is: " + firstNumber);
        }
        else
         if(secondNumber>firstNumber && secondNumber>thirdNumber && secondNumber>fourthNumber){
             System.out.println("The highest number is: " + secondNumber);
        }
         else
        if(thirdNumber>firstNumber && thirdNumber>secondNumber && thirdNumber>fourthNumber){
        System.out.println("The highest number is: " + thirdNumber);}

        else
        if(fourthNumber>firstNumber && fourthNumber>secondNumber && fourthNumber>thirdNumber){
        System.out.println("The highest number is: " + fourthNumber);}


        if(firstNumber<secondNumber && firstNumber>thirdNumber && firstNumber>fourthNumber){
        System.out.println("The second highest number is: " + firstNumber);}

        else
        if(firstNumber>secondNumber && firstNumber<thirdNumber && firstNumber>fourthNumber){
        System.out.println("The second highest number is: " + firstNumber);}

        else
        if(firstNumber>secondNumber && firstNumber>thirdNumber && firstNumber<fourthNumber){
        System.out.println("The second highest number is: " + firstNumber);}

        else
        if(secondNumber<firstNumber && secondNumber>thirdNumber && secondNumber>fourthNumber){
        System.out.println("The second highest number is: " + secondNumber);}

        else
        if(secondNumber>firstNumber && secondNumber<thirdNumber && secondNumber>fourthNumber){
        System.out.println("The second highest number is: " + secondNumber);}

        else
        if(secondNumber>firstNumber && secondNumber>thirdNumber && secondNumber<fourthNumber){
        System.out.println("The second highest number is: " + secondNumber);}

        else
        if(thirdNumber<firstNumber && thirdNumber>secondNumber && thirdNumber>fourthNumber){
        System.out.println("The second highest number is: " + thirdNumber);}
        else
        if(thirdNumber>firstNumber && thirdNumber<secondNumber && thirdNumber>fourthNumber){
        System.out.println("The second highest number is: " + thirdNumber);}

        else
        if(thirdNumber>firstNumber && thirdNumber>secondNumber && thirdNumber<fourthNumber){
        System.out.println("The second highest number is: " + thirdNumber);}

        else
        if(fourthNumber<firstNumber && fourthNumber>secondNumber && fourthNumber>thirdNumber){
        System.out.println("The  second highest number is: " + fourthNumber);}

        else
        if(fourthNumber>firstNumber && fourthNumber<secondNumber && fourthNumber>thirdNumber){
        System.out.println("The second highest number is: " + fourthNumber);}

        else
        if(fourthNumber>firstNumber && fourthNumber>secondNumber && fourthNumber<thirdNumber){
        System.out.println("The second highest number is: " + fourthNumber);}



        if(firstNumber<secondNumber && firstNumber<thirdNumber && firstNumber<fourthNumber){
        System.out.println("The smallest number is: " + firstNumber);}

        else
        if(secondNumber<firstNumber && secondNumber<thirdNumber && secondNumber<fourthNumber){
        System.out.println("The smallest number is: " + secondNumber);}

        else
        if(thirdNumber<firstNumber && thirdNumber<secondNumber && thirdNumber<fourthNumber){
        System.out.println("The smallest number is: " + thirdNumber);}

        else
        if(fourthNumber<firstNumber && fourthNumber<secondNumber && fourthNumber<thirdNumber){
        System.out.println("The smallest number is: " + fourthNumber);}

    }
}
