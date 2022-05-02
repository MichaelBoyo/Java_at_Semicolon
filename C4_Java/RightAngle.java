package C4_Java;

import java.util.Scanner;

public class RightAngle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base length for right-angle triangle: ");
        int base = scanner.nextInt();

        int i = 1;
        if (base > 1 && base < 10) {
            while (i <= base) {
                int j = 1;
                while (j <= i) {
                    System.out.print("*");
                    j++;
                }
                System.out.println();
                i++;
            }
        } else {
            System.out.println("Enter base length for right-angle triangle between 1-10: ");
        }

    }
}
