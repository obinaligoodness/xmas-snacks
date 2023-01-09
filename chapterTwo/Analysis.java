package chapterTwo;

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        int gradeCounter = 1;

        while(gradeCounter<=10){
            System.out.println("Enter result (1 = passed , 2 = failed)");
            int result = input.nextInt();
            if(result == 1){
                passes = passes + 1;
            }
            else if (result == 2) {
                failures = failures + 1;
            }
            gradeCounter = gradeCounter + 1;
        }
        System.out.printf("passed: %d%nfailed: %d%n",passes,failures);
        if(passes>8){
            System.out.println("Bonus to instructor");
        }
    }
}
