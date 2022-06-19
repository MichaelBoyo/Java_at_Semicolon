package quiz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do{
            Quiz quiz = new Question();
            int quizScore = quiz.setQuiz();
            if (quizScore> 6){
                quiz = new Level1Decorator(new Question());
                quizScore = getScore(quiz, quizScore);
                if(quizScore>6){
                    quiz = new Level2Decorator(new Level1Decorator(new Question()));
                    quizScore = getScore(quiz, quizScore);
                    if(quizScore>6){
                        quiz = new Level3Decorator(new Level2Decorator( new Level1Decorator(new Question())));
                        quizScore = getScore(quiz, quizScore);
                        if(quizScore>6){
                            quiz = new Level4Decorator(new Level3Decorator(
                                    new Level2Decorator( new Level1Decorator(new Question()))));
                            quizScore = getScore(quiz, quizScore);
                            if(quizScore>6){
                                quiz =new Level5Decorator( new Level4Decorator(new Level3Decorator(
                                        new Level2Decorator( new Level1Decorator(new Question())))));
                                getScore(quiz, quizScore);
                            }
                        }
                    }
                }
            }
            System.out.println("press 1 to try again or 0 to end");
            input = scanner.nextInt();
        }while(input!= 0);
    }

    private static int getScore(Quiz quiz, int correct) {
        prompt(quiz, correct);
        correct = quiz.setQuiz();
        return correct;
    }

    private static void prompt(Quiz question, int correct) {
        System.out.printf("Difficulty level = %d%n",question.getDifficulty());
        System.out.printf("you got %d right %n", correct);
        System.out.println("lets step it up");
    }
}
