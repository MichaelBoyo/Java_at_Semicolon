package C7_Java;

public class TurtleGraphics {
    public int[][] turtle;
    public final int FLOOR =  20;

    public TurtleGraphics(){
        turtle= new int[FLOOR][FLOOR];

    }

    public int[][] getTurtle() {
        return turtle;
    }

    public void setTurtle() {
        for (int i = 0; i <FLOOR ; i++) {
            for (int j = 0; j <FLOOR ; j++) {
                turtle[i][j]=0;
            }
        }
    }

    public int getFLOOR() {
        return FLOOR;
    }
}
