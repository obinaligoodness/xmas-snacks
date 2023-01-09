package chapterTwo;

import java.util.Scanner;
//performs a sample payroll calculation
public class Display {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int b= input.nextInt();
        System.out.print("Enter a second integer: ");
        int c = input.nextInt();
        int a = b*c;
        System.out.println(a);



    }
}
