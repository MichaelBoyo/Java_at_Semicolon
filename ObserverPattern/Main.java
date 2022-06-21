package ObserverPattern;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Blog blog = new Blog();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int input;
        do {
            System.out.println("""
                    1. add new post
                    2. add user
                    3. user logIn
                    4. exit
                    """);
            input = scanner.nextInt();
            switch (input) {
                case 1 -> createPost();
                case 2 -> addUser();
                case 3 -> loginUser();
                default -> input= -1;
            }
        } while (input != -1);
    }

    private static void loginUser() {
        System.out.println("enter name");
        String name = scanner.next();
        User user = blog.getUser(name);
        List<String>posts = user.getPosts();
        for (String post : posts){
            System.out.println(post);
        }
    }

    private static void addUser() {
        int input;
        do{
            System.out.println("enter name");
            String name = scanner.next();
            User user = new User(blog,name);
            blog.add(user);
            System.out.println("enter 1 to add new user or 0 to end");
            input = scanner.nextInt();
        }while (input!= 0);
    }

    private static void createPost() {
        int input;
        do{
            System.out.println("enter post");
            scanner.nextLine();
            String post = scanner.nextLine();
            blog.addPost(post);
            blog.pushNotification();
            System.out.println("enter 1 to add new post or 0 to end");
            input = scanner.nextInt();
        }while (input!= 0);

    }
}
