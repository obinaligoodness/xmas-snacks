package chapterTwo;

import java.util.Scanner;

public class Crytography {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer");
        int a = input.nextInt();
        System.out.println("Enter second integer");
        int b = input.nextInt();
        System.out.println("Enter third integer");
        int c = input.nextInt();
        System.out.println("Enter fourth integer");
        int d = input.nextInt();

        int first = (a + 7) % 10 ;
        int second = d;
        int third = a;
        int fourth = b;
        System.out.printf("%d%d%d%d",first,second,third,fourth);


    }
}
