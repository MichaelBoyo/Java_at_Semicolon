package MyList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    List list;
    @BeforeEach
    void setUp() {
        list = new ArrayList();
    }

    @Test
    void isEmpty() {
        assertTrue(list.isEmpty());
    }

    @Test
    void add() {
        list.add("G-String");
        assertFalse(list.isEmpty());
    }
    @Test
    void addMoreItems(){
        list.add("G-String");
        list.remove("G-String");
        assertTrue(list.isEmpty());
    }
    @Test
    void addItem_sizeIncreases(){
        list.add("G-String");
        assertEquals(1,list.size());
    }
    @Test
    void addAnotherItem_sizeIncreases(){
        list.add("G-String");
        list.add("e-String");
        assertEquals(2,list.size());
    }
    @Test
    void add_remove(){
        list.add("G-String");
        list.add("e-String");
        list.remove("e-String");
        assertEquals(1,list.size());
        assertFalse(list.isEmpty());
    }
    @Test
    void retrieveItem(){
        list.add("G-String");
        assertEquals("G-String", list.get(0));
    }
    @Test
    void addTwo(){
        list.add("G-String");
        list.add("e-String");
        assertEquals("e-String", list.get(1));
    }
    @Test
    void addTwo2(){
        list.add("G-String");
        list.add("e-String");
        assertEquals("G-String", list.get(0));
    }
    @Test void listShift(){
        list.add("G-String");
        list.add("e-String");
        list.add("y- string");
        list.remove("G-String");
        assertEquals("e-String", list.get(0));
    }
    @Test
    void listShift2(){
        list.add("G-String");
        list.add("e-String");
        list.add("y-string");

        list.remove("G-String");
        list.remove("e-String");
        assertEquals("y-string", list.get(0));
    }

    @Test
    void listShift3(){
        list.add("G-String");
        list.add("e-String");
        list.add("y-string");

        list.remove("e-String");
        assertEquals("y-string", list.get(1));
        assertNull(list.get(2));
    }
    @Test
    void add6Elements(){
        assertEquals(5,list.capacity());
        list.add("G-String");
        list.add("e-String");
        list.add("y-string");
        list.add("t-String");
        list.add("o-String");
        list.add("p-string");
        assertEquals(10, list.capacity());
        list.add("G-String");
        list.add("e-String");
        list.add("y-string");
        list.add("t-String");

        list.print();
    }

}