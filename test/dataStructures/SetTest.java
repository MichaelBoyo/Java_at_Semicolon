package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {
    HashSet set;

    @BeforeEach
    void setUp() {
        set = new Set();
    }

    @Test
    void addItem() {
        set.addItem("koko");
        assertFalse(set.isEmpty());
    }

    @Test
    void removeItem() {
        set.addItem("kola");
        set.removeItem(0);
        assertTrue(set.isEmpty());
    }

    @Test
    void isEmpty() {
        assertTrue(set.isEmpty());
    }

    @Test
    void size() {
        assertEquals(0, set.size());
        set.addItem("phone");
        assertEquals(1, set.size());
    }
}