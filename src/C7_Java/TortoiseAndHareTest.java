package C7_Java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TortoiseAndHareTest {
    TortoiseAndHare race;

    @BeforeEach
    void setUp() {
        race = new TortoiseAndHare();
    }

    @Test
    void weHave70Squares() {
        assertEquals(70, race.getNumberOfSquares());
    }

    @Test
    void tortoiseMove() {
        for (int i = 0; i < 70; i++) {
            race.tortoiseMove("->");
        }
        race.printTortoiseTrack();
        System.out.println();
        for (int i = 0; i < 70; i++) {
            race.hareMove("+");
        }
        race.printHareTrack();
    }

    @Test
    void hareMove() {

    }

}