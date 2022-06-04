package C7_Java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    ShoppingCart cart;
    @BeforeEach void setUp(){
        cart = new ShoppingCart();
        ShoppingCartItems items = new ShoppingCartItems("book",12.4,10);
        cart.addItem(items);

        items = new ShoppingCartItems("spoon",110,7);
        cart.addItem(items);
    }
    @Test
    void calculateSubTotal() {
        assertEquals(894.0,cart.calculateSubTotal());
    }

    @Test
    void discount() {
        assertEquals(110.85600000000001, cart.discount(12.4));
    }

    @Test
    void vat() {
        assertEquals(156.45, cart.vat());
    }
}