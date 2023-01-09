package chapterTwo;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer ");
        int number = input.nextInt();
        if (number % 3 == 0) {
            System.out.println("The integer is divisible by 3");
        }
        if (number % 3 != 0) {
            System.out.println("The integer is not divisible by 3");
        }
    }
}
