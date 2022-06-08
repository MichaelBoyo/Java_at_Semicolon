package C8_Java.Java_Flex;


import java.util.Random;
import java.util.Scanner;


public class ObeEdit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(50);

        display("how many questions do you want? ");
        int questionChoices = scanner.nextInt();

        int solution = 0;
        int wrongAnswer = 0;
        int correct =0;
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

                case '*' -> solution = a *b;
                case '-' -> solution = a-b;
                case '+' -> solution = a+b;
                case '/' -> solution = a/b;
                case '%' -> solution = a%b;
                case '^' -> solution= (int) Math.pow(a, i);
            }
            if(input == solution)correct++;
            else wrongAnswer++;
            i++;
        }
        int finalScore = correct - wrongAnswer;
        System.out.printf("You got %d right and %d wrong. so your score is %d", correct, wrongAnswer, finalScore);

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