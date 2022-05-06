package Chibuzo_Assg;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum;
        System.out.print("Enter first number: ");
        int number = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num = scanner.nextInt();
        int redo;
        do {
            sum = num + number;
            System.out.println("the sum is " + sum);

            System.out.println("Enter 1 to perform the operation again or 0 to terminate: ");
            redo = scanner.nextInt();

        } while (redo == 1);
    }
}
