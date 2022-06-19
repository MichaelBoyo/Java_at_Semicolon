package quiz;

public abstract class LevelDecorator extends Quiz {
    public abstract void setDifficulty(int difficulty);
    public abstract int getDifficulty();
    public abstract int setQuiz();

}
