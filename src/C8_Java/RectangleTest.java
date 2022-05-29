package C8_Java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RectangleTest {
    Rectangle test;

    @BeforeEach
    void setUp() {
        test = new Rectangle();
    }


    @Test
    void getLength() {
        test.setLength(4.0);

        double result = test.getLength();
        assertEquals(result, 4.0);
    }


    @Test
    void getWidth() {
        test.setWidth(5.0);
        double result = test.getWidth();
        assertEquals(result, 5.0);
    }

    @Test
    void testThatExceptionIsThrownWhenIllegalValueProvided(){
      IllegalArgumentException ex =  assertThrows(IllegalArgumentException.class,
                () ->{ test.setLength(150);}
        );
      assertEquals("value out of range", ex.getMessage());

    }


    @Test
    void perimeter() {
        test.setLength(5.0);
        test.setWidth(4.0);
        double result = test.perimeter();
        assertEquals(result, 18);
    }

    @Test
    void area() {
        test.setWidth(4.0);
        test.setLength(6.0);
        double area = test.area();
        assertEquals(area, 26);
    }

    @Test
    public void whenExceptionThrown_thenAssertionSucceeds() {

        assertThrows(IllegalArgumentException.class, () -> {test.setLength(22.0);});
    }
}