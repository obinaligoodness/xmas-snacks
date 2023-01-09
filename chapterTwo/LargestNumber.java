package chapterTwo;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int largest = 0;
       while(counter<=10){
           System.out.println("Enter the number of unit sold");
          int number = input.nextInt();
           counter = counter + 1;
           if(number>=largest){
               largest = number;
           }
       }
        System.out.println(largest);
    }
}
