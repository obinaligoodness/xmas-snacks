package chapterTwo;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int total = 0;
        int gradeCounter = 1;

        while(gradeCounter<=10){
            System.out.println("Enter grade ranging from 0 - 100");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }
        double average = total / 10;
        System.out.println(average);
    }
}
