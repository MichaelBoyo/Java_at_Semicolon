package quiz;

public class Level5Decorator extends LevelDecorator {
    Quiz quiz;

    @Override
    public void setDifficulty(int difficulty) {
        quiz.setDifficulty(200);
    }

    @Override
    public int getDifficulty() {
        return quiz.getDifficulty()+ 200;
    }

    @Override
    public int setQuiz(){
        quiz.setDifficulty(quiz.getDifficulty()+200);
        return quiz.setQuiz();
    }
    public Level5Decorator(Quiz quiz){
        this.quiz = quiz;
    }
}