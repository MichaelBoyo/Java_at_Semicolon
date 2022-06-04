package Java_Flex;

import java.util.Scanner;

public class Zubu {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        int Number = scanner.nextInt();

        if (Number % 2 == 0) {
            System.out.printf("%d is an even number", Number);
        } else {
            System.out.printf("%d is an odd Number", Number);
        }
    }
}
