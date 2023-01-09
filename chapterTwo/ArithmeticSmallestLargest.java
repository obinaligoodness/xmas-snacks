package chapterTwo;

import java.util.Scanner;

public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int highestNumber = 0;
        int lowestNumber = 0;
        System.out.println("Enter your first integer");
        int a = input.nextInt();

        System.out.println("Enter your second integer");
        int b = input.nextInt();

        System.out.println("Enter your third integer");
        int c = input.nextInt();

        int sum = a + b + c;
        int product = a * b * c;
        int average = (a + b + c) / 3;
        if (a >= b && a >= c) {
            highestNumber = a;
        } else if (b >= a && b >= c) {
            highestNumber = b;
        } else {
            highestNumber = c;
        }
        if (a <= b && a <= c) {
            lowestNumber = a;
        } else if (b <= a && b <= c) {
            lowestNumber = b;
        } else {
            lowestNumber = c;
        }

        System.out.printf("%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n","The sum of the integers is: ",sum,"The product of your integer is: ",product,"The average is: ",average,"The highest number is: ",highestNumber,"The lowest number is: ",lowestNumber);
    }
}