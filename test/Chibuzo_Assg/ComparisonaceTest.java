package Chibuzo_Assg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparisonaceTest {
    Comparisonace tester;
    @BeforeEach
    void setUp() {
         tester = new Comparisonace();
    }
    @Test void testThatArrayTestMethodReturnsTrue(){
        String[] array = new String[7];
        String[] array2= new String[7];
        boolean rr = tester.getResult(array,array2);

        assertTrue(rr);

    }
    @Test void testThatArrayTestReturnsFalse(){
        String[] array = new String[7];
        String[] array2= new String[4];
        boolean rr = tester.getResult(array,array2);

        assertFalse(rr);

    }
}