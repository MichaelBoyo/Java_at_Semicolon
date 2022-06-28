package SevenSegment;

import Turtle.*;

public class SevenSegment extends Turtle {
    private SketchPad sketchPad = new SketchPad(8,8);
    private int steps = 3;

    private void moveButNotPrint(SketchPad sc) {
        penUP();
        move(steps, sc);
    }

    private void printMoves(SketchPad sc) {
        penDown();
        move(steps, sc);
    }

    public void setScreen(String command) {
        char[]commands = command.toCharArray();
        if (commands[commands.length -1] == '1'){
            if (commands[0]=='1'){
                printMoves(sketchPad);
            }else moveButNotPrint(sketchPad);
            if (commands[1]=='1'){
                turnRight();
                printMoves(sketchPad);
            }else moveButNotPrint(sketchPad);

            if (commands[2]=='1'){
                printMoves(sketchPad);
            }else moveButNotPrint(sketchPad);
            if (commands[3]=='1'){
                turnRight();
                printMoves(sketchPad);
            }else moveButNotPrint(sketchPad);
            if (commands[4]=='1'){
                turnRight();
                printMoves(sketchPad);
            }else moveButNotPrint(sketchPad);
            if (commands[5]=='1'){
                turnRight();
                steps = 1;
                printMoves(sketchPad);
            }
            if (commands[6]=='1'){
                turnLeft();
                turnLeft();
                steps = 1;
                printMoves(sketchPad);
                turnRight();
                steps = 2;
                printMoves(sketchPad);
            }else moveButNotPrint(sketchPad);
        }

    }

    public void display() {
        sketchPad.displaySketchPad();
    }
}
