package chapterTwo;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);
        System.out.println("Enter an integer ");
        int number = inout.nextInt();
        System.out.println("Enter another integer ");
        int number2 = inout.nextInt();
        int answer = (number * 3) / (number2 * 2);

        if ((number * 3) % (number2 * 2) == 0) {
            System.out.print(answer);
        } else
            System.out.print("your first integer tripled is not a multiple of your second integer doubled ");

    }
}
