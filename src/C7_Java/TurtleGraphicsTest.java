package C7_Java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleGraphicsTest {
    TurtleGraphics test;
    @BeforeEach
    void setUp() {
        test = new TurtleGraphics();
    }
    @AfterEach void result(){
        for (int i = 0; i < test.FLOOR; i++) {
            for (int j = 0; j <test.FLOOR ; j++) {
                System.out.print(test.turtle[i][j]);
            }
            System.out.println();

        }
    }

    @Test
    void getTurtle() {
        test.setTurtle();
        test.getTurtle();

    }

    @Test
    void setTurtle() {
    }

    @Test
    void getFLOOR() {
    }
}