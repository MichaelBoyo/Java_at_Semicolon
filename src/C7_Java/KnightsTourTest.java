package C7_Java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KnightsTourTest {
    KnightsTour test;

    @BeforeEach
    void setUp() {
        test = new KnightsTour();
    }
    @AfterEach
    void currentBoard(){
        test.printBoard();
    }

    @Test
    void testThatWeCanSetBoardToZero() {
        test.setToZero();
    }

    @Test
    void testThatWeCanHave8By8Board() {
        test.setToZero();
        test.printBoard();
    }
    @Test void testThatKnightCanMove(){
        test.setToZero();
//        test.horizontal(0);
        test.horizontal(-1);
        test.vertical(3);

    }

}