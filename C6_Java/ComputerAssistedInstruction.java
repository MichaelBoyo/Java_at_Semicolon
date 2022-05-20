package C6_Java;

import java.security.SecureRandom;
import java.util.Objects;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    static Scanner input = new Scanner(System.in); static SecureRandom random = new SecureRandom();
    static int correct = 0; static int wrong = 0;
    static String[] correctAnswer = {"Very good", "Excellent!", "Nice work!", "Keep up the good work!"};
    static String[] wrongAnswer = {"No. Please try again", "Wrong. Try once more.", "Don't give up!", "No. Keep trying."};
    static String[] operators = {"+", "-", "/", "*"};
    public static void main(String[] args) {
        question();
    }
    public static void question() {

        System.out.println("Enter difficulty level between 1 and 2: ");
        if (input.nextInt() == 2) difficulty = 10;
        else difficulty = 1;

        System.out.println("""
                CHOOSE QUESTIONS
                enter 1 for addition problems
                enter 2 for subtraction
                enter 3 for division
                enter 4 for multiplication
                """);
        int quesType = input.nextInt();
        String operator = switch (quesType) {
            case 1 -> operators[0];
            case 2 -> operators[1];
            case 3 -> operators[2];
            case 4 -> operators[3];
            default -> throw new IllegalStateException("Unexpected value: " + quesType);
        };

        for ( i = 0; i < 9; i++) {
             num1 = (random.nextInt(9) + 1) + difficulty;
            num2 = (random.nextInt(9) + 1) + difficulty;

             randResp = random.nextInt(4);

            System.out.printf("How much is %d %s %d? ", num1, operator, num2);
             answer = input.nextInt();
            if (Objects.equals(operator, "*")) multiplication(random, correctAnswer, wrongAnswer, operator);
            if (Objects.equals(operator, "+")) addition(random, correctAnswer, wrongAnswer, operator);
            if (Objects.equals(operator, "-")) subtraction(random, correctAnswer, wrongAnswer, operator);
            if (Objects.equals(operator, "/")) division(random, correctAnswer, wrongAnswer, operator);

        }

        int total = correct + wrong;
        int correctPercentage = (correct / total) * 100;
        System.out.println("you answered " + correctPercentage + "% of the answers correctly");
        if (correctPercentage < 75) {
            System.out.println("Please ask your teacher for extra help.");
        } else System.out.println("Congratulations, you are ready to go to the next level!");

    }
    static int answer; static int randResp; static int num1; static int num2; static int i; static int difficulty;
    private static void division(SecureRandom random, String[] correctAnswer, String[] wrongAnswer, String operators) {
        if (answer == num1 / num2) {
            correct++;
            System.out.println(correctAnswer[randResp]);
            System.out.println();
        } else {

            while (answer != num1 / num2 && i < 9) {
                wrong++;
                randResp = random.nextInt(4);
                System.out.println(wrongAnswer[randResp]);

                System.out.printf("How much is %d %s %d? ", num1, operators, num2);
                answer = input.nextInt();
                i++;
            }
        }
    }
    private static void subtraction(SecureRandom random, String[] correctAnswer, String[] wrongAnswer, String operators) {
        if (answer == num1 - num2) {
            correct++;
            System.out.println(correctAnswer[randResp]);
            System.out.println();
        } else {

            while (answer != num1 - num2 && i < 9) {
                wrong++;
                randResp = random.nextInt(4);
                System.out.println(wrongAnswer[randResp]);

                System.out.printf("How much is %d %s %d? ", num1, operators, num2);
                answer = input.nextInt();
                i++;
            }
        }
    }
    private static void addition(SecureRandom random, String[] correctAnswer, String[] wrongAnswer, String operators) {
        if (answer == num1 + num2) {
            correct++;
            System.out.println(correctAnswer[randResp]);
            System.out.println();
        } else {

            while (answer != num1 + num2 && i < 9) {
                wrong++;
                randResp = random.nextInt(4);
                System.out.println(wrongAnswer[randResp]);

                System.out.printf("How much is %d %s %d? ", num1, operators, num2);
                answer = input.nextInt();
                i++;
            }
        }
    }
    private static void multiplication(SecureRandom random, String[] correctAnswer, String[] wrongAnswer, String operators) {
        if (answer == num1 * num2) {
            correct++;
            System.out.println(correctAnswer[randResp]);
            System.out.println();
        } else {

            while (answer != num1 * num2 && i < 9) {
                wrong++;
                randResp = random.nextInt(4);
                System.out.println(wrongAnswer[randResp]);

                System.out.printf("How much is %d %s %d? ", num1, operators, num2);
                answer = input.nextInt();
                i++;
            }
        }
    }
}