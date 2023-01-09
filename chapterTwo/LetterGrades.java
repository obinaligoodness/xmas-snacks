package chapterTwo;

import java.util.Scanner;

public class LetterGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        System.out.println("Enter grade in range 0 - 100");

        while(input.hasNext()){
            int grade = input.nextInt();
            total += grade;
            ++gradeCounter;

            switch(grade/10){
                case 10:
                case 9:
                ++aCount;
                break;
                case 8:
                ++bCount;
                break;
                case 7:
                ++cCount;
                break;
                case 6:
                ++dCount;
                break;
                default:
                    ++fCount;
              break;
            }
        }

        System.out.printf("%nGrade report %n");
        if(gradeCounter!=0){
            double average = (double) total/gradeCounter;
            System.out.printf("The total of the %d grades you entered is %d%n",gradeCounter,total);
            System.out.printf("The average grade is %.2f%n",average);
            System.out.printf("Number of A grades: %d%nNumber of B grade: %d%nNumber of C grade:%d%nNumber of D grade:%d%nNumber of F grades: %d%n",
                    aCount,bCount,cCount,dCount,fCount);
        }
        else{
            System.out.println("No grade entered");
        }

    }
}
