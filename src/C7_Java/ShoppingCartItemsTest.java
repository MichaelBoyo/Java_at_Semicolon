package C7_Java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartItemsTest {
    ShoppingCartItems items;
    @BeforeEach
    void setUp() {
        items = new ShoppingCartItems("book",12.4,10);
    }

    @Test
    void setAndGetAmountPaid() {
        items.setAmountPaid(120);
        assertEquals(120, items.getAmountPaid());
    }

    @Test
    void getItems() {
        assertEquals(items.getItems(),"book");
    }

    @Test
    void getPrice() {
        assertEquals(items.getPrice(), 12.4);
    }

    @Test
    void getQuantity() {
        assertEquals(items.getQuantity(),10);
    }

}