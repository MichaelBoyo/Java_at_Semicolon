package phonebook;

import java.util.Scanner;


public class Main {
    static   Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        UserRepository database = new UserRepository();
        int sentinel;
        do {
            System.out.println("REGISTRATION PAGE");
            registerUser(database);
            sentinel = scanner.nextInt();
        }while (sentinel!= -1);
        login(database);
    }

    private static void login(UserRepository database) {
        System.out.println("LOGIN PAGE");
        System.out.print("enter email: ");
        String email = scanner.next();
        var user = database.findByEmail(email);
        userPage(user, database);
    }

    private static void userPage(User user, UserRepository database) {
        int sentinel;
        do{
            System.out.println("USER PAGE");
            System.out.println("""
                    1-> add Contact
                    2-> edit Contact
                    3-> remove Contact
                    4-> view all contacts
                    """);
            int input = scanner.nextInt();
            switch (input){
             case 1-> addContact(user,database);
             case 2-> editContact(user,database);
             case 3-> removeContact(user,database);
             case 4-> viewALlContacts(user);
            }
            sentinel = scanner.nextInt();
        }while (sentinel!=-1);
    }

    private static void viewALlContacts(User user) {
        user.getContacts().forEach((System.out::println));
    }

    private static void removeContact(User user,UserRepository database) {
        int sentinel;
        do{
            System.out.println("press 0 to remove another contact or -1 to end");
            sentinel = scanner.nextInt();
        }while (sentinel != -1);
    }

    private static void editContact(User user,UserRepository database) {
        int sentinel;
        do{
            System.out.println("press 0 to edit another contact or -1 to end");
            sentinel = scanner.nextInt();
        }while (sentinel != -1);
    }

    private static void addContact(User user,UserRepository database) {
        int sentinel;
        do{
            System.out.println("enter name");
            String name = scanner.next();

            System.out.println("enter phone Number");
            String phoneNumber = scanner.next();

            System.out.println("enter address");
            String address = scanner.next();

            System.out.println("enter email");
            String email = scanner.next();

            Contact contact = new Contact(name, phoneNumber, address, email);
            user.addContact(contact);
            database.updateUser(user);
            System.out.println("press 0 to add another contact or -1 to end");
            sentinel = scanner.nextInt();
        }while (sentinel != -1);
    }

    private static void registerUser(UserRepository database) {
        System.out.print("enter email: ");
        String email = scanner.next();

        System.out.print("enter name: ");
        String name = scanner.next();

        System.out.print("enter phoneNumber: ");
        String phoneNumber = scanner.next();

        User user = new User(name,phoneNumber,email);
        database.addUser(user);
        System.out.println("registered successfully");
        System.out.println("enter -1 to end or 0 to create another User");
    }
}
