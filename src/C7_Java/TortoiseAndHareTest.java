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
        while (race.getTortoiseMove()<70){
            race.tortoiseMove("->");
        }
        assertEquals(70, race.getTortoiseMove());
    }

    @Test
    void tortoiseMove() {
        for (int i = 0; i < 70; i++) {
            race.tortoiseMove("->");
        }
        System.out.println();

    }

    @Test
    void hareMove() {
        for (int i = 0; i < 70; i++) {
            race.hareMove("+");
        }
    }

}