package quiz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do{
            Questions question = new Question();
            int correct = question.setQuiz();
            if (correct> 6){
                question = new Level1Decorator(new Question());
                prompt(question,correct);
                correct = question.setQuiz();
                if(correct>6){
                    question = new Level2Decorator(new Level1Decorator(new Question()));
                    prompt(question,correct);
                    correct = question.setQuiz();
                    if(correct>6){
                        question = new Level3Decorator(new Level2Decorator( new Level1Decorator(new Question())));
                        prompt(question,correct);
                        correct = question.setQuiz();
                        if(correct>6){
                            question = new Level4Decorator(new Level3Decorator(
                                    new Level2Decorator( new Level1Decorator(new Question()))));
                            prompt(question,correct);
                            correct = question.setQuiz();
                            if(correct>6){
                                question =new Level5Decorator( new Level4Decorator(new Level3Decorator(
                                        new Level2Decorator( new Level1Decorator(new Question())))));
                                prompt(question,correct);
                                question.setQuiz();
                            }
                        }
                    }
                }
            }
            System.out.println("press 1 to try again");
            input = scanner.nextInt();
        }while(input!= -1);
    }

    private static void prompt(Questions question,int correct) {
        System.out.printf("Difficulty level = %d%n",question.getDifficulty());
        System.out.printf("you got %d right %n", correct);
        System.out.println("lets step it up");
    }
}
