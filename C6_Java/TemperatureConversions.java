package C6_Java;

import java.util.Scanner;

public class TemperatureConversions {
    private static double kelvin(double celsius){
        return celsius + 273.15;
    }
    private static double celsius(double kelvin){
        return kelvin - 273.15;
    }

    public static void main(String[] args) {
        System.out.println("Enter a kelvin to celsius equivalent: ");
        Scanner scanner= new Scanner(System.in);
        System.out.println(kelvin(scanner.nextDouble()));

        System.out.println("Enter a celsius to kelvin equivalent: ");
        scanner= new Scanner(System.in);
        System.out.println(celsius(scanner.nextDouble()));


    }
}
