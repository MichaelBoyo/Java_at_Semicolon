package ObserverPattern;

import java.util.List;
import java.util.Scanner;

public class Main {
    static Blog blog;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter blog name");
        String name = scanner.next();
        blog =new Blog(name);

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
        List<Post>posts = user.getPosts();
        System.out.printf("Welcome to %s's Blog%n",blog.getName());
        for (Post post : posts){
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
            System.out.println("enter post title");
            scanner.nextLine();
            String title = scanner.nextLine();
            System.out.println("enter post Body");
            String body = scanner.nextLine();
            Post post = new Post(title,body);
            blog.addPost(post);
            blog.pushNotification();
            System.out.println("enter 1 to add new post or 0 to end");
            input = scanner.nextInt();
        }while (input!= 0);

    }
}
