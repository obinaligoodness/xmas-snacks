package chapterTwo;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int a = input.nextInt();
        int asquare = a * a;

        if (a > 100 && asquare > 100) {
            System.out.printf("%d > 100 and %d > 100%n", a, asquare);
        }
        if (a < 100 && asquare < 100) {
            System.out.printf("%d < 100 and %d < 100 %n", a, asquare);
        }
        if (a != 100 && asquare != 100) {
            System.out.printf("%d != 100 and %d != 100 %n", a, asquare);
        }
        if (a == 100 && asquare == 100) {
            System.out.printf("%d == 100 and %d == 100 %n", a, asquare);
        }
    }
}