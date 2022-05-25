package C7_Java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe game;
    @BeforeEach
    void setUp() {
        game = new TicTacToe();

    }
    @Test void testThat(){
        game.play(1);



    }
}