package quiz;

public class Level2Decorator extends LevelDecorator {
    Quiz quiz;
    @Override
    public void setDifficulty(int difficulty) {
        quiz.setDifficulty(50);
    }

    @Override
    public int getDifficulty() {
        return quiz.getDifficulty() +50;
    }

    @Override
    public int setQuiz(){
        quiz.setDifficulty(quiz.getDifficulty()+50);
        return quiz.setQuiz();
    }
    public Level2Decorator(Quiz quiz){
        this.quiz = quiz;
    }
}
