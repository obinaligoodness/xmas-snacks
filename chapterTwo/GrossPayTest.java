package chapterTwo;

import java.util.Scanner;

public class GrossPayTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the hours worked");
        int hoursWorked = input.nextInt();
        System.out.println("Enter hourly Rate");
        int hourlyRate = input.nextInt();


        if(hoursWorked<=40) {
            double grossPay = hoursWorked * hourlyRate;
            System.out.printf("Your gross pay is %.2f",grossPay);
        }

           else if(hoursWorked>40){
               double grossPay = ((hoursWorked - 40) * (20 * 1.5)) + (40 * hourlyRate);
                System.out.printf("Your gross pay is %.2f",grossPay);
        }



    }
}
