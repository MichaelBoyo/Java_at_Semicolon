package quiz;

public class Level4Decorator extends LevelDecorator {
    private Quiz quiz;

    @Override
    public void setDifficulty(int difficulty) {
        quiz.setDifficulty(150);
    }

    @Override
    public int getDifficulty() {
        return quiz.getDifficulty()+ 150;
    }

    @Override
    public int setQuiz(){
        quiz.setDifficulty(quiz.getDifficulty()+150);
        return quiz.setQuiz();
    }
    public Level4Decorator(Quiz quiz){
        this.quiz = quiz;
    }
}