package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Map_Test {
    Map map;

    @BeforeEach
    void setUp() {
        map = new Map(5);
    }

    @Test
    void addItem() {
        map.addItem("a", "kiki");
        map.addItem("b", "lola");

    }
    @Test
    void getItem(){
        map.addItem("a", "kiki");
        map.addItem("b", "lola");
        map.addItem("c", "lola");
        assertEquals("jdjd", map.getItem("a"));
        assertEquals(3, map.getSize());
    }
}