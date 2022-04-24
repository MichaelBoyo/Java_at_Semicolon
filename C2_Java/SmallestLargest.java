package C2_Java;

import java.util.Scanner;

public class SmallestLargest {
    public static void main(String... args) {

        Scanner InputFigures = new Scanner(System.in);

        System.out.print("Enter five numbers: ");
        int firstNumber = InputFigures.nextInt();
        int secondNumber = InputFigures.nextInt();
        int thirdNumber = InputFigures.nextInt();
        int fourthNumber = InputFigures.nextInt();
        int fifthNumber = InputFigures.nextInt();

        int maxNum = Math.max(firstNumber, Math.max(secondNumber, Math.max(thirdNumber, Math.max(fourthNumber, fifthNumber))));
        System.out.printf("%d is the largest number%n", maxNum);

        int minNum = Math.min(firstNumber, Math.min(secondNumber, Math.min(thirdNumber, Math.min(fourthNumber, fifthNumber))));
        System.out.printf("%d is the smallest number%n", minNum);

    }
}
