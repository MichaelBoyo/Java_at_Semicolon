package C10_Java;

public abstract class Animals {
    void makeSound() {
        System.out.println("I can bark");
    }

    abstract void sleep();

    abstract String move();
}