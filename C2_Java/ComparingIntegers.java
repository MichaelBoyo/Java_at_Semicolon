package C2_Java;

import java.util.Scanner;

public class ComparingIntegers{

    public static void main(String... args){

        Scanner InputValue = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int Num = InputValue.nextInt();

        if (Num != 100) {
            System.out.printf("%d is not equal to 100%n", Num);
        }
        if (Num == 100) {
            System.out.printf("%d is equal to 100%n", Num);
        }
        if (Num > 100) {
            System.out.printf("%d is greater than 100%n", Num);
        }
        if (Num < 100) {
            System.out.printf("%d is lesser than 100%n", Num);
        }

        int square = Num * Num;

        if (square != 100) {
            System.out.printf("The square of %d is not equal to 100%n", Num);
        }
        if (square == 100) {
            System.out.printf("The square of %d is equal to 100%n", Num);
        }
        if (square > 100) {
            System.out.printf("The square of %d is greater than 100%n", Num);
        }
        if (square < 100) {
            System.out.printf("The square of %d is lesser than 100%n", Num);
        }
    }
}