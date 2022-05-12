package C3_Java.Chibuzo_Assg;

import java.util.Scanner;

public class AreaOfTriangle{
    public static void main(String... args){

        Scanner Input = new Scanner(System.in);

        System.out.print("Enter three points for a triangle: ");
        double PointX1 = Input.nextDouble();
        double PointY1 = Input.nextDouble();
        double PointX2 = Input.nextDouble();
        double PointY2 = Input.nextDouble();
        double PointX3 = Input.nextDouble();
        double PointY3 = Input.nextDouble();

        double area = (PointX1 * (PointY2 - PointY3) + PointX2 * (PointY3 - PointY1) + PointX3 * (PointY1 - PointY2)) / 2;
        double TotalArea = Math.abs(area);

        System.out.printf("The area of the triangle is %.1f", area);
    }
}