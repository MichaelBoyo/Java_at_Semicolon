package quiz;

public class Level2Decorator extends LevelDecorator {
    Questions question;
    @Override
    public void setDifficulty(int difficulty) {
        question.setDifficulty(50);
    }

    @Override
    public int getDifficulty() {
        return question.getDifficulty() +50;
    }

    @Override
    public int setQuiz(){
        question.setDifficulty(question.getDifficulty()+50);
        return question.setQuiz();
    }
    public Level2Decorator(Questions question){
        this.question = question;
    }
}
