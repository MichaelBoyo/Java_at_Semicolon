package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackImplTest {
    HashStack stack;

    @BeforeEach
    void setUp() {
        stack = new StackImpl();
    }

    @Test
    void push() {
        stack.push("plate");
        assertFalse(stack.empty());
    }

    @Test
    void peek() {
        stack.push("plate");
        stack.push("spoon");
        assertEquals(stack.peek(), "spoon");
    }

    @Test
    void pop() {
        stack.push("plate");
        stack.push("spoon");
        assertEquals(stack.pop(), "spoon");
    }


    @Test
    void empty() {
        assertTrue(stack.empty());
        stack.push("plate");
        assertFalse(stack.empty());
    }

    @Test
    void search() {
        assertEquals(stack.search("gun"), -1);
    }

    @Test
    void size() {
        assertEquals(0,stack.size());
        stack.push("broom");
        assertEquals(1,stack.size());
    }
}