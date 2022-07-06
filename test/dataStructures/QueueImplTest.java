package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueImplTest {
    Queue queue;
    @BeforeEach
    void setUp() {
        queue = new QueueImpl();
    }

    @Test
    void addItem() {
        queue.addItem("person1");
    }

    @Test
    void removeItem() {

    }

    @Test
    void size() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void peek() {
    }

    @Test
    void poll() {
    }

    @Test
    void set() {
    }

    @Test
    void get() {
    }

    @Test
    void clear() {
        queue.addItem("papa");
        queue.addItem("mama");
        queue.addItem("pikin");
        queue.clear();
        assertTrue(queue.isEmpty());
    }
}