package chapterTwo;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double milesPerGallonForEachTrip = 0;
        int gasTotal = 0;
        int mileTotal = 0;
        int counter = 0;


        System.out.println("Enter miles driven or -1 to quit");
        int mile = input.nextInt();
        System.out.println("Enter gallon of gas used or -1 to quit");
        int gas = input.nextInt();

        while(mile!= -1 && gas != -1){
            milesPerGallonForEachTrip=(milesPerGallonForEachTrip + mile) / gas ;
            gasTotal = gasTotal + gas;
            mileTotal = mileTotal + mile;
            System.out.printf("%.2f miles per gallon%n",milesPerGallonForEachTrip);
            System.out.println("Enter miles driven or -1 to quit");
             mile = input.nextInt();
             System.out.println("Enter gallon of gas used or -1 to quit");
             gas = input.nextInt();
        }
        double combinedMilePerGallon = (double) mileTotal/gasTotal;
        System.out.printf("The combined miles per gallon obtained for all trips up to this point is %.2f miles per gallon",combinedMilePerGallon);


    }
}
