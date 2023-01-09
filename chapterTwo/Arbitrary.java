package chapterTwo;

import java.util.Scanner;

public class Arbitrary {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int total = 0;
        int gradeCounter= 0;

        System.out.println("Enter grade or -1 to quit");
        int grade = input.nextInt();

        while(grade!= -1){
            total = total + grade;
            gradeCounter = gradeCounter + 1;
            System.out.println("Enter grade or -1 to quit");
             grade = input.nextInt();
        }

        if(gradeCounter!=0){
            double average = (double) total / gradeCounter;
            System.out.printf("The total grades entered is:%d%n",total);
            System.out.printf("the average is:%.2f",average);
        }
    }
}
