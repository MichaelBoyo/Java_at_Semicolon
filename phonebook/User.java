package phonebook;

import java.util.*;

public class User {
    private String name;
    private String phoneNumber;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    private Map<String,Contact> contacts = new HashMap<>();

    public User(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void addContact(Contact contact){
        contacts.put(contact.getPhoneNumber(),contact);
    }
    public Contact getContactByPhoneNumber(String phoneNumber){
        return Optional.ofNullable(contacts.get(phoneNumber)).orElseThrow(
                ()-> new IllegalArgumentException("contact not found"));
    }

    public String getName() {
        return name;
    }
    public int getNoOFContacts(){
        return contacts.size();
    }

    public void setName(String name) {
        this.name = name;
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
        contacts.forEach((key,value)->{
            contactList.add(value);
        });
        return contactList;
    }
}
