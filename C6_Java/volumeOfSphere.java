package C6_Java;

import java.util.Scanner;

public class volumeOfSphere {
    private static double sphereVolume(double radius){
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        System.out.println("the volume of sphere is "+ sphereVolume(radius));
    }
}
