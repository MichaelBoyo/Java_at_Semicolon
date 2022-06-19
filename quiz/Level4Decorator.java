package quiz;

public class Level4Decorator extends LevelDecorator {
    Questions question;

    @Override
    public void setDifficulty(int difficulty) {
        question.setDifficulty(150);
    }

    @Override
    public int getDifficulty() {
        return question.getDifficulty()+ 150;
    }

    @Override
    public int setQuiz(){
        question.setDifficulty(question.getDifficulty()+150);
        return question.setQuiz();
    }
    public Level4Decorator(Questions question){
        this.question = question;
    }
}