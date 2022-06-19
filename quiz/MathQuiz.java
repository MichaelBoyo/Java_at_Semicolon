package quiz;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MathQuiz extends Quiz {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    protected final ArrayList<String> questions = new ArrayList<>();
    private int difficulty = 1;
    private final String[] operators = {"+", "*", "-", "/"};
    private int numA;
    private int numB;
    private int correct;

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int setQuiz() {
        String operator;
        for (int i = difficulty; i < difficulty + 10; i++) {
            numA += (int) Math.pow(i, 2); numB += i;
            operator = operators[random.nextInt(operators.length)];
            String question = String.format("%d %s %d = ", numA, operator, numB);
            questions.add(question);
            System.out.print(question);
            long answer = scanner.nextInt();
            switch (operator) {
                case "+" -> {
                    if (numA + numB == answer) {
                        correct++;
                        System.out.println("correct");
                    } else System.out.printf("wrong, answer is %d%n", numA + numB);
                }
                case "-" -> {
                    if (numA - numB == answer) {
                        correct++;
                        System.out.println("correct");
                    } else System.out.printf("wrong, answer is %d%n", numA - numB);
                }
                case "/" -> {
                    if (numA / numB == answer) {
                        correct++;
                        System.out.println("correct");
                    } else System.out.printf("wrong, answer is %d%n", numA / numB);
                }
                case "*" -> {
                    if ((long) numA * numB == answer) {
                        correct++;
                        System.out.println("correct");
                    } else System.out.printf("wrong, answer is %d%n", numA * numB);
                }
            }
        }
        return correct;
    }
}