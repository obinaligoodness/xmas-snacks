package tdd;

import java.util.Scanner;

public class Bike {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total= 0;
        int gradecounter=1;

        while(gradecounter<=3){
            System.out.println("Enter grade");
           int grade = input.nextInt();
            total = total + grade;
            gradecounter =gradecounter + 1;
        }
    double average = total/3;
        System.out.println(average);
    }}