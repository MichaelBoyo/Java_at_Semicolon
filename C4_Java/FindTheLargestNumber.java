package C4_Java;

import java.util.Scanner;

public class FindTheLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int largest1 = 0;
        int largest2 = 0;

        int i = 1;
        while (i <= 10) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            if (number > largest1) {
                largest1 = number;
            } else if (number != largest1 && number > largest2) {
                largest2 = number;
            }
            i++;
        }
        System.out.printf("%d is the largest%n", largest1);
        System.out.printf("%d is the second largest", largest2);
    }
}
