package quiz;

public class Level3Decorator extends LevelDecorator {
    Questions question;

    @Override
    public void setDifficulty(int difficulty) {
        question.setDifficulty(100);
    }

    @Override
    public int getDifficulty() {
        return question.getDifficulty()+100;
    }

    @Override
    public int setQuiz(){
        question.setDifficulty(question.getDifficulty()+100);
        return question.setQuiz();
    }
    public Level3Decorator(Questions question){
        this.question = question;
    }
}