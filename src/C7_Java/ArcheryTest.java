package C7_Java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ArcheryTest {
    Archery test;

    @BeforeEach
    void setUp() {
        test = new Archery(4);
        int result = test.shoot();
        assertNotEquals(0, result);
        result = test.shoot();
        assertNotEquals(0, result);
        result = test.shoot();
        assertNotEquals(0, result);

        result = test.shoot();
        assertNotEquals(0, result);
        result = test.shoot();
        assertNotEquals(0, result);
        result = test.shoot();
        assertNotEquals(0, result);

        result = test.shoot();
        assertNotEquals(0, result);
        result = test.shoot();
        assertNotEquals(0, result);
        result = test.shoot();
        assertNotEquals(0, result);

        result = test.shoot();
        assertNotEquals(0, result);
        result = test.shoot();
        assertNotEquals(0, result);
        result = test.shoot();
        assertNotEquals(0, result);
    }

    @AfterEach
    void result() {
        for (int i = 0; i < test.scores.length; i++) {
            System.out.print("player " + (i + 1) + " [");
            for (int j = 0; j < test.CHANCES; j++) {
                System.out.print(test.scores[i][j] + " ");
            }
            System.out.println("]");

        }
        System.out.println();
    }

    @Test
    void testThatPlayerCanPlay() {
        int total = test.playerSum(1);
        int sum = test.scores[0][0] + test.scores[0][1] + test.scores[0][2];
        assertEquals(total, sum);

        System.out.println("total 1 is " + total);

        total = test.playerSum(2);
        sum = test.scores[1][0] + test.scores[1][1] + test.scores[1][2];

        assertEquals(total, sum);

        System.out.println("total 2 is " + total);
    }
}