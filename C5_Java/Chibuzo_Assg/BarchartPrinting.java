package C5_Java.Chibuzo_Assg;

import java.util.Scanner;

public class BarchartPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 5 numbers between 1 and 30:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();


        for (int i= 1;i<= num1;i++ ) {
            System.out.print("*");
        }
        System.out.printf("%n");


        for (int i = 1; i <= num2; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= num3; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 1; i <= num4; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 1; i <= num5; i++) {
            System.out.print("*");
        }
    }
}
