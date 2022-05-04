package Chibuzo_Assg;

import java.util.Scanner;

public class RandomNumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a mystery number is stored, guess the number: ");
        int guess = scanner.nextInt();
        int i = 40;

        while (guess != i) {
            if (guess > i) {
                System.out.println("too high, try again");
            }
            if (guess < i) {
                System.out.println("too low, try again");
            }
            System.out.print("a mystery number is stored, guess the number: ");
            guess = scanner.nextInt();
        }
        System.out.println("your guess is correct.. Bravo!!!");
    }
}