package quiz;

public class Level1Decorator extends LevelDecorator {
    Questions question;

    @Override
    public void setDifficulty(int difficulty) {
       question.setDifficulty(10);
    }

    @Override
    public int getDifficulty() {
        return question.getDifficulty()+ 10;
    }

    @Override
    public int setQuiz(){
        question.setDifficulty(question.getDifficulty()+10);
        return question.setQuiz();
    }
    public Level1Decorator(Questions question){
        this.question = question;
    }
}
