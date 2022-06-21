package Turtle;
import static Turtle.Direction.*;
public class Turtle {
    private boolean iSPenUp = true;
    private Position currentPosition = new Position(0,0);
    private Direction currentDirection = EAST;
    public boolean isPenUp() {
        return iSPenUp;
    }
    public void penDown() {
        this.iSPenUp = false;
    }
    public void penUP() {
        this.iSPenUp = true;
    }
    public Direction getCurrentLocation() {
        return currentDirection;
    }
    public void turnRight() {
        switch (currentDirection) {
            case EAST -> turn(SOUTH);
            case SOUTH -> turn(WEST);
            case WEST -> turn(NORTH);
            case NORTH -> turn(EAST);
        }
    }
    public void turnLeft() {
        switch (currentDirection) {
            case EAST -> turn(NORTH);
            case SOUTH -> turn(EAST);
            case WEST -> turn(SOUTH);
            case NORTH -> turn(WEST);
        }
    }
    private void turn(Direction currentDirection){
        this.currentDirection = currentDirection;
    }
    public void move(int steps, SketchPad pad) {
        if(!iSPenUp) writeOn(steps, pad);
       move(steps);
    }

    private void writeOn(int steps, SketchPad pad) {
        int [][] floor = pad.getFloor();
        int currentRow = currentPosition.getRow();
        int currentColumn = currentPosition.getColumn();
        switch(currentDirection){
            case EAST -> {
                for (int i = currentColumn; i < currentColumn+steps ; i++) {
                    floor[currentRow][i] =1;
                }
            }
            case SOUTH -> {
                for (int i = currentRow; i < currentRow+steps ; i++) {
                    floor[i][currentColumn] =1;
                }
            }
            case NORTH -> {
                for (int i = currentRow; i > currentRow-steps ; i--) {
                    floor[i][currentColumn] =1;
                }
            }
            case WEST -> {
                for (int i = currentColumn; i > currentColumn-steps ; i--) {
                    floor[currentRow][i] =1;
                }
            }
        }
    }
    private void move(int steps){
        switch(currentDirection){
            case SOUTH -> increaseRowBy(steps);
            case EAST -> increaseColumnBy(steps);
            case WEST -> decreaseColumnBy(steps);
            case NORTH -> decreaseRowBy(steps);
        }
    }
    private void decreaseRowBy(int steps) {
        int currentRow = currentPosition.getRow();
        currentPosition.setRow(currentRow - steps);
    }
    private void decreaseColumnBy(int steps) {
        int currentColumn = currentPosition.getColumn();
        currentPosition.setColumn(currentColumn - steps);
    }
    private void increaseColumnBy(int steps){
        int currentColumn = currentPosition.getColumn();
        currentPosition.setColumn(steps+currentColumn);
    }
    private void increaseRowBy(int steps){
        int currentRow = currentPosition.getRow();
        currentPosition.setRow(currentRow+steps);
    }
    public Position getCurrentPosition() {
        return currentPosition;
    }
}