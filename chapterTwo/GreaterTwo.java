package chapterTwo;

import java.util.Scanner;

public class GreaterTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first number");
        int  firstNum = input.nextInt();
        System.out.println("Enter your second number");
        int secondNum = input.nextInt();
        System.out.println("Enter your third number ");
        int thirdNum = input.nextInt();
        System.out.println("Enter your fourth number ");
        int fourthNum = input.nextInt();

        if(firstNum >= secondNum && firstNum >= thirdNum && firstNum >= fourthNum){
            System.out.println(firstNum);}
        else if (secondNum >= firstNum && secondNum >= thirdNum && secondNum>= fourthNum){
            System.out.println(secondNum);
        }
        else if (thirdNum>=firstNum && thirdNum>=secondNum && thirdNum>= fourthNum){
            System.out.println(thirdNum);
        }
        else
            System.out.println(fourthNum);
    }
}