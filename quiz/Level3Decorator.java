package quiz;

public class Level3Decorator extends LevelDecorator {
    Quiz quiz;

    @Override
    public void setDifficulty(int difficulty) {
        quiz.setDifficulty(100);
    }

    @Override
    public int getDifficulty() {
        return quiz.getDifficulty()+100;
    }

    @Override
    public int setQuiz(){
        quiz.setDifficulty(quiz.getDifficulty()+100);
        return quiz.setQuiz();
    }
    public Level3Decorator(Quiz quiz){
        this.quiz = quiz;
    }
}