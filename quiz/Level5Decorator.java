package quiz;

public class Level5Decorator extends LevelDecorator {
    Questions question;

    @Override
    public void setDifficulty(int difficulty) {
        question.setDifficulty(200);
    }

    @Override
    public int getDifficulty() {
        return question.getDifficulty()+ 200;
    }

    @Override
    public int setQuiz(){
        question.setDifficulty(question.getDifficulty()+200);
        return question.setQuiz();
    }
    public Level5Decorator(Questions question){
        this.question = question;
    }
}