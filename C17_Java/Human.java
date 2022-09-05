package C17_Java;

public interface Human {
    void sayHello(String name);
    static void sayHello2(String name) {
        System.out.println("hello "+ name);
    }

}
