package chapterTwo;

import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius");
        int radius = input.nextInt();
        int diameter = radius + radius;
        double circumference = 2 * 3.14159 * radius;
        double area = 3.14159*(radius * radius);

        System.out.printf("%s%d%n%s%.5f%n%s%.5f%n","diameter is: ",diameter,"circumference is: ",circumference,"area is: ",area);
    }
}
