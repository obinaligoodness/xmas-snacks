import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first number");
        int  firstNum = input.nextInt();
        System.out.println("Enter your second number");
        int secondNum = input.nextInt();
        System.out.println("Enter your third number ");
        int thirdNum = input.nextInt();
                if(firstNum >= secondNum && firstNum >= thirdNum){
                    System.out.println(firstNum);}
                    else if (secondNum >= firstNum && secondNum >= thirdNum){
                        System.out.println(secondNum);
                }
                    else
                        System.out.println(thirdNum);
    }
}