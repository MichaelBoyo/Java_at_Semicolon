package C2_Java;

import java.util.Scanner;
public class Diameter {
    public static void main(String... book){

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        int radius = Input.nextInt();

        int diameter = 2 * radius;
        double circumference = 2 * 3.14159 * radius;
        double area = 3.14159 * radius * radius;

        System.out.printf("The Diameter is %d%nThe Circumference is %f%nThe area is %f", diameter, circumference, area);
    }
}