package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapTest {
    Map map;
    @BeforeEach
    void setUp() {
        map = new Map();
    }

    @Test
    void add() {
        map.add("A","my personal info");
        map.add("koko", "panda");
        map.add("B", "bimbo");

        assertEquals("my personal info",map.get("A"));
        assertEquals("panda",map.get("koko"));
        map.add("A", "jiji");

        map.printKeys();
        System.out.println(map.fetchKey("Ab"));
    }
}