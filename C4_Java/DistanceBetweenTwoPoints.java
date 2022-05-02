package C4_Java;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two points for x-axis: ");
        int x1= scanner.nextInt();
        int x2 = scanner.nextInt();

        System.out.print("Enter two points for y-axis: ");
        int y1 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int slope = y2 - y1 /x2 -x1;

        if(slope == -1 ){
            System.out.println("the points are located on a line perpendicular to an axis");
        }else {
            System.out.println("not perpendicular");
        }
    }
}
