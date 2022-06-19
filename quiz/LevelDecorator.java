package quiz;

public abstract class LevelDecorator extends Questions {
    public abstract void setDifficulty(int difficulty);
    public abstract int getDifficulty();
    public abstract int setQuiz();

}
