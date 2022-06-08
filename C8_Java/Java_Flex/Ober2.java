package C8_Java.Java_Flex;

import java.util.Random;
import java.util.Scanner;

import static C8_Java.Java_Flex.Ober.displayAndCountCorrectAnswer;
import static C8_Java.Java_Flex.Ober.displayln;

public class Ober2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(50);
        displayln("you must get at least 5 correctly to end");


        int correctAnswer = 0;
        int wrongAnswer = 0;
        String operators = "+-/*%^";


        int i = 1;
        do {
            char operator = getRandomOperator(random, operators);
            int a;
            int b;
            a = printRandom(random);
            printChar(operator);
            b = printRandom(random);
            display(":");
            long input = scanner.nextLong();
            switch (operator) {

                case '*' -> {
                    if (input == (long) a * b) {
                        correctAnswer = displayAndCountCorrectAnswer(correctAnswer);
                    } else {
                        displayln("incorrect, answer is " + a * b);
                        wrongAnswer++;
                    }
                }
                case '-' -> {
                    if (input == a - b) {
                        correctAnswer = displayAndCountCorrectAnswer(correctAnswer);
                    } else {
                        displayln("incorrect, answer is " + (a - b));
                        wrongAnswer++;
                    }
                }
                case '+' -> {
                    if (input == a + b) {
                        correctAnswer = displayAndCountCorrectAnswer(correctAnswer);
                    } else {
                        displayln("incorrect, answer is " + (a + b));
                        wrongAnswer++;
                    }
                }
                case '/' -> {
                    if (input == a / b) {
                        correctAnswer = displayAndCountCorrectAnswer(correctAnswer);
                    } else {
                        displayln("incorrect, answer is " + (a / b));
                        wrongAnswer++;
                    }
                }
                case '%' -> {
                    if (input == a % b) {
                        correctAnswer = displayAndCountCorrectAnswer(correctAnswer);
                    } else {
                        displayln("incorrect, answer is " + (a % b));
                        wrongAnswer++;
                    }
                }
                case '^' -> {
                    if (input == Math.pow(a, i)) {
                        correctAnswer = displayAndCountCorrectAnswer(correctAnswer);
                    } else {
                        displayln("incorrect, answer is " + Math.pow(a, i));
                        wrongAnswer++;
                    }
                }
            }
            i++;
        } while (correctAnswer != 5);
        int finalScore = correctAnswer - wrongAnswer;
        System.out.printf("You got %d right and %d wrong. so your score is %d", correctAnswer, wrongAnswer, finalScore);
    }

    private static void printChar(char operator) {
        System.out.print(operator);
    }

    private static char getRandomOperator(Random random, String operator) {
        return operator.charAt(random.nextInt(operator.length()));
    }

    private static int printRandom(Random random) {
        int j = random.nextInt(50) + 1;
        System.out.print(j);
        return j;
    }

    public static void display(String message) {
        System.out.print(message);
    }
}
