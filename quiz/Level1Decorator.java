package quiz;

public class Level1Decorator extends LevelDecorator {
    Quiz quiz;

    @Override
    public void setDifficulty(int difficulty) {
       quiz.setDifficulty(10);
    }

    @Override
    public int getDifficulty() {
        return quiz.getDifficulty()+ 10;
    }

    @Override
    public int setQuiz(){
        quiz.setDifficulty(quiz.getDifficulty()+10);
        return quiz.setQuiz();
    }
    public Level1Decorator(Quiz quiz){
        this.quiz = quiz;
    }
}
