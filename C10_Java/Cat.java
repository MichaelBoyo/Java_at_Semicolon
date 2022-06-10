package C10_Java;


public class Cat extends Animals {
    @Override
    void sleep() {
        System.out.println("i sleep like a baby");
    }

    @Override
    String move() {
        return "i am moving";
    }
    @Override
    void makeSound(){
        System.out.println("i can meow");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.move());
        cat.makeSound();
        cat.sleep();
    }
}