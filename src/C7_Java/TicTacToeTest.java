package C7_Java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe game;
    @BeforeEach
    void setUp() {
        game = new TicTacToe();
        game.display();

    }
    @Test void testThatGamePlays(){
        game.player1(2);
        System.out.println();

        game.player2(9);
        System.out.println();

        game.player1(5);
        System.out.println();

        game.player2(8);
        System.out.println();

        game.player1(1);
        System.out.println();

        game.player2(7);



    }
}