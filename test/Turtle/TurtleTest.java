package Turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Turtle.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Turtle turtle;
    SketchPad sc;
    @BeforeEach
    void setUp() {
        turtle = new Turtle();
         sc = new SketchPad(6,6);
    }
    @Test void tatWeHaveTurtle(){
        assertNotNull(turtle);
    }
    @Test
    void testThatPenISUp(){
        assertTrue(turtle.isPenUp());
    }
    @Test void penISDown(){
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertFalse(turtle.isPenUp());
    }
    @Test
    void penISUp(){
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertFalse(turtle.isPenUp());
        turtle.penUP();

        assertTrue(turtle.isPenUp());
    }
    @Test void southLocation(){
        assertSame(EAST, turtle.getCurrentLocation());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentLocation());
    }
    @Test void west(){
        assertSame(EAST, turtle.getCurrentLocation());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentLocation());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentLocation());
    }
    @Test void north(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(EAST, turtle.getCurrentLocation());
    }
    @Test void left(){
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(EAST, turtle.getCurrentLocation());
    }
    @Test void moveEast(){
        assertSame(EAST, turtle.getCurrentLocation());
        turtle.move(3,sc );
        turtle.move(2,sc);
        assertEquals( new Position(0,5), turtle.getCurrentPosition());
    }
    @Test void moveSouth(){
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentLocation());
        turtle.move(1,sc );
        assertEquals(new Position(1,0), turtle.getCurrentPosition());
    }
    @Test void moveWest(){
        turtle.move(5,sc );
        turtle.turnRight();
        turtle.turnRight();
        assertSame(WEST, turtle.getCurrentLocation());
        turtle.move(5,sc );
        assertEquals(new Position(0,0), turtle.getCurrentPosition());
    }
    @Test void moveNorth(){
        turtle.move(5,sc );
        turtle.turnRight();
        turtle.move(5,sc );
        turtle.turnRight();
        turtle.turnRight();
        assertSame(NORTH, turtle.getCurrentLocation());
        turtle.move(3,sc );
        assertEquals(new Position(2,5), turtle.getCurrentPosition());
    }
    @Test void writeEast(){
        turtle.penDown();
        turtle.move(5,sc);
        assertEquals(new Position(0,5), turtle.getCurrentPosition());
        int currentColumn = turtle.getCurrentPosition().getColumn();
        int currentRow = turtle.getCurrentPosition().getRow();


        turtle.turnRight();
        turtle.move(4,sc);
        turtle.penUP();
        turtle.turnRight();
        turtle.move(3,sc);
        turtle.turnRight();
        turtle.move(4,sc);
        int[][]floor = sc.getFloor();
        for (int i = currentRow; i <currentRow+ 5 ; i++) {
            assertEquals(1, floor[currentRow][i]);
        }
        sc.displaySketchPad();
    }
}