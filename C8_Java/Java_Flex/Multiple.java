package C8_Java.Java_Flex;

import java.util.Scanner;
public class Multiple {
    public static void main (String... args) {

        Scanner Input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int firstNumber = Input.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNumber = Input.nextInt();

        int firstNumberTripled = firstNumber * firstNumber * firstNumber;
        int secondNumberDoubled = secondNumber * secondNumber;

        if (secondNumberDoubled % firstNumberTripled == 0) {
            System.out.printf("%d is a multiple of %d", firstNumberTripled, secondNumberDoubled);
        }
        if (secondNumberDoubled % firstNumberTripled != 0) {
            System.out.printf("%d is not a multiple of %d", firstNumberTripled, secondNumberDoubled);
        }
    }

}