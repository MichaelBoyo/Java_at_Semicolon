package C3_Java.Chibuzo_Assg;

import java.util.Scanner;

public class ComputingBMI {
    public static void main(String... args){

        Scanner Input = new Scanner(System.in);

        System.out.print("Enter Weight in pounds: ");
        double Weight = Input.nextDouble();

        System.out.print("Enter height in inches: ");
        double Height = Input.nextDouble();

        double WeightInKg = Weight * 0.45359237;
        double HeightInMeters = Height * 0.0254;

        double BMI = WeightInKg / Math.pow(HeightInMeters, 2);

        System.out.printf("BMI is %.4f", BMI);
    }
}