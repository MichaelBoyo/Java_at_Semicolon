package C3_Java.Chibuzo_Assg;

import java.util.Scanner;

public class CostOfDriving {
    public static void main(String... args){

        Scanner Input = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double DrivingDistance = Input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double MilesPerGallon = Input.nextDouble();

        System.out.print("Enter price per gallon: ");
        double PricePerGallon = Input.nextDouble();

        double CostOfDriving = (DrivingDistance * PricePerGallon) / MilesPerGallon;

        System.out.printf("The cost of Driving is $%.2f", CostOfDriving);
    }
}