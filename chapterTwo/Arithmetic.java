package chapterTwo;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer");
        int a = input.nextInt();
     System.out.println("Enter your second integer ");
     int b = input.nextInt();
     int asquare = a*a;
     int bsquare = b*b;
     System.out.printf("%s%d%n%s%d%n%s%d%n%s%d","the square of your first integer is ",asquare,"the square of your first integer is ",bsquare,"the square of your first integer + the square of your second integer ",asquare+bsquare,"the square of your first integer - the square of your second integer ",asquare-bsquare);
    }
}
