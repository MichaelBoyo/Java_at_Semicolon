package phonebook;

import java.util.*;

public class User {
    private String name;
    private String phoneNumber;
    private String email;
    private String password;
    private Map<String, Contact> contacts = new HashMap<>();

    public User(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public User(String name, String phoneNumber, String email, String password) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password=password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addContact(Contact contact) {
        contacts.put(contact.getPhoneNumber(), contact);
    }

    public Contact getContactByPhoneNumber(String phoneNumber) {
        return Optional.ofNullable(contacts.get(phoneNumber)).orElseThrow(
                () -> new IllegalArgumentException("contact not found"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOFContacts() {
        return contacts.size();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public List<Contact> getContacts() {
        List<Contact> contactList = new ArrayList<>();
        contacts.forEach((key, value) -> {
            contactList.add(value);
        });
        return contactList;
    }

    public boolean validatePassword(String password) {
        return this.password.equals(password);
    }
}
