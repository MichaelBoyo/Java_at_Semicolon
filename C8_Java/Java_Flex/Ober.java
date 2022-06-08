package C8_Java.Java_Flex;
// press play
//display how may questions do you want
// collect input
// display random questions with random 1st number, 2nd number and random symbol
// use random numbers and verify the answers
// print score

// keep serving questions till he gets 5 correctly

import java.util.Random;
import java.util.Scanner;


public class Ober {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(50);

        display("how many questions do you want? ");
        int questionChoices = scanner.nextInt();

        int correctAnswer = 0;
        int wrongAnswer = 0;
        String operator = "+-/*%^";

        int i = 1;
        while (i <= questionChoices) {
            char opera = operator.charAt(random.nextInt(operator.length()));
            int a;
            int b;
            a = printRandom(random);
            System.out.print(opera);
            b = printRandom(random);
            display(":");
            long input = scanner.nextLong();
            switch (opera) {

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
        }
        int finalScore = correctAnswer - wrongAnswer;
        System.out.printf("You got %d right and %d wrong. so your score is %d", correctAnswer, wrongAnswer, finalScore);

    }

    static int displayAndCountCorrectAnswer(int correctAnswer) {
        displayln("correct");
        correctAnswer++;
        return correctAnswer;
    }

    private static int printRandom(Random random) {
        int j = random.nextInt(50) + 1;
        System.out.print(j);
        return j;
    }

    public static void display(String message) {
        System.out.print(message);
    }

    public static void displayln(String message) {
        System.out.println(message);
    }
    public static void displayln(double message) {
        System.out.println(message);
    }


}