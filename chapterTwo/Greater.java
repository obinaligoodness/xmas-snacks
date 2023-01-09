package chapterTwo;

import java.util.Scanner;
public class Greater{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number ");
        int firstNumber = input.nextInt();
        int highestNumber = firstNumber;

        System.out.println("Enter your second number");
        int secondNumber = input.nextInt();
        if( secondNumber>highestNumber){
            highestNumber = secondNumber;
            System.out.println(highestNumber);
        }


        System.out.println("Enter your third number");
        int thirdNumber = input.nextInt();
        if (thirdNumber > highestNumber) {
            highestNumber = thirdNumber;
            System.out.println(highestNumber);
        }
        }


    }


