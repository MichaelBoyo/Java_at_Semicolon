package quiz;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Question extends Questions {
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getDifficulty() {
        return difficulty;
    }

    private int difficulty = 1;

    protected final ArrayList<String> questions = new ArrayList<String>();
    public int setQuiz(){
        int correct = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] operators = {"+","*","-","/"};
        String operator = "";
        int num1 = 0; int num2 = 0;
        for (int i = difficulty; i <difficulty+10 ; i++) {
            num1 +=  (int)Math.pow(i,2);
            num2 +=i;
            operator = operators[random.nextInt(operators.length)];
           String question = String.format("%d %s %d = ",num1,operator,num2);
            questions.add(question);


            System.out.print(question);
            long answer = scanner.nextInt();
            switch (operator) {
                case "+" -> {
                    if (num1 + num2 == answer) {
                        correct++;
                        System.out.println("correct");
                    }else System.out.printf("wrong, answer is %d%n",num1 + num2);
                }
                case "-" -> {
                    if (num1 - num2 == answer) {
                        correct++; System.out.println("correct");
                    }else System.out.printf("wrong, answer is %d%n",num1 - num2);

                }
                case "/" -> {
                    if (num1 / num2 == answer) {
                        correct++; System.out.println("correct");
                    }else System.out.printf("wrong, answer is %d%n",num1 / num2);

                }
                case "*" -> {
                    if ((long) num1 * num2 == answer) {
                        correct++;
                        System.out.println("correct");
                    }else System.out.printf("wrong, answer is %d%n",num1 * num2);

                }
            }


        }
        return correct;
    }


}
