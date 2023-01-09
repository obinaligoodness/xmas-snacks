package chapterTwo;

import java.util.Scanner;

public class TrialTest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Trial trial = new Trial ();
        System.out.println("Enter your name ");
        String firstNam = input.nextLine();
                trial.setName(firstNam);
        System.out.println(trial.getName());

    }
}