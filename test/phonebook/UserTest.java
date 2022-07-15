package phonebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;
    @BeforeEach
    void setUp() {
        user = new User("mike","08103295538","mike@Gmail.com");
    }
    @Test
    void userName(){
        assertEquals("mike", user.getName());
    }

    @Test
    void addContact() {
        var contact = new Contact("john", "09034454334",
                "john@mail.com","rccg camp");
        user.addContact(contact);
        assertEquals(user.getContactByPhoneNumber("09034454334"),contact);
        assertEquals(1, user.getNoOFContacts());
    }

    @Test
    void getContactByPhoneNumber() {
        var contact = new Contact("john", "09034454334",
                "john@mail.com","rccg camp");
        user.addContact(contact);
        user.addContact(new Contact("kiki", "08192930343",
                "lilk@mail.com","mowe"));
        assertEquals(user.getContactByPhoneNumber("09034454334"),contact);
        assertEquals(2, user.getNoOFContacts());
    }
}