package Turtle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Turtle turtle = new Turtle();
        SketchPad pad = new SketchPad(21,21);
        int input;
        System.out.println(" 1 => pen Up, 2 => pen Down, 3 => turn Right, 4 => turn Left, 5 => move forward," +
                " 6 => view Sketch pad, 9 => exit ");
        do {

            input = scanner.nextInt();
            switch(input){
                case 1 -> turtle.penUP();
                case 2 -> turtle.penDown();
                case 3 -> turtle.turnRight();
                case 4 -> turtle.turnLeft();
                case 5 -> {
//                    System.out.println("enter steps");
                    int steps = scanner.nextInt();
                    turtle.move(steps,pad);
//                    pad.displaySketchPad();
                }
                case 6 -> pad.displaySketchPad();
                default -> input = 9;
            }
        }while(input != 9);
    }
}