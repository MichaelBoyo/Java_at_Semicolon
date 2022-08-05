package phonebook;

import java.util.Objects;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        UserRepository database = new UserRepository();
        dummyUsers(database);
        menu(database);
    }
    private static void menu(UserRepository database){

        System.out.println("""
                1 => admin
                2 => user
                0 => exit
                """);
        int cmd = scanner.nextInt();
        switch (cmd){
            case 1 -> admin(database);
            case 2 -> userPage(database);
        }
    }

    private static void dummyUsers(UserRepository database) {
        String[] names = {"mike","boyo","love","peace","ife"};
        for (String name : names) {
            database.addUser(new User(name,
                    String.valueOf(Math.floor(Math.random() * 10)).replace('.','2'),
                    name + "@mail.com","0000")
            );
        }
    }

    private static void userPage(UserRepository database){
        System.out.println("REGISTRATION PAGE");
        System.out.println("""
                1 => SignUp
                2 => login
                3 => exit
                """);
        int cmd = scanner.nextInt();
       switch (cmd){
           case 1-> registerUser(database);
           case 2-> login(database);
           default -> menu(database);
       }
    }

    private static void admin(UserRepository database) {
        System.out.println("""
                1 => view All Users
                2 => delete user
                3 => exit
                """);
        int input = scanner.nextInt();
        switch (input){
            case 1-> findAll(database);
            case 2 -> deleteUser(database);
            default -> menu(database);
        }
    }
    private static void findAll(UserRepository database){
        database.findALl().forEach(System.out::println);
        admin(database);
    }
    private static void deleteUser(UserRepository database){
        System.out.println("enter email");
        String email = scanner.next();
        database.findALl().forEach((user)->{
            if (Objects.equals(user.getEmail(), email)){
                database.deleteUser(email);
            }
        });
        System.out.println("press 1 to delete another user or 0 to go back");
        int cmd = scanner.nextInt();
        if (cmd == 1) {
            deleteUser(database);
        } else {
            admin(database);
        }
    }

    private static void login(UserRepository database) {
        System.out.println("LOGIN PAGE");
        System.out.print("enter email: ");
        String email = scanner.next();

        var user = database.findByEmail(email);
        if(user != null){
            System.out.print("enter password: ");
            String password = scanner.next();
            if(user.validatePassword(password)){
                userPage(user, database);
            }else {
                System.out.println("invalid password");
                login(database);
            }
        }else {
            System.out.println("invalid email");
            login(database);
        }
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
                    0 -> exit
                    """);
            int input = scanner.nextInt();
            switch (input){
             case 1-> addContact(user,database);
             case 2-> editContact(user,database);
             case 3-> removeContact(user,database);
             case 4-> viewALlContacts(user);
                default -> userPage(database);
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

        System.out.print("enter password: ");
        String password = scanner.next();

        User user = new User(name,phoneNumber,email,password);
        database.addUser(user);
        System.out.println("registered successfully");
        System.out.println("enter -1 to end or 0 to create another User");
        int cmd = scanner.nextInt();
        if (cmd == 1) registerUser(database);
        else userPage(database);
    }
}
