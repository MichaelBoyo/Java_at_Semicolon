package C5_Java.Chibuzo_Assg;

import java.util.Scanner;

public class RandomNumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 40;
        int guess;

        do{
            System.out.print("a mystery number is stored, guess the number: ");
            guess = scanner.nextInt();

            if (guess > i) {
                System.out.println("too high, try again");
            }
            if (guess < i) {
                System.out.println("too low, try again");
            }
        }
        while (guess != i);
        System.out.println("your guess is correct.. Bravo!!!");
    }
}