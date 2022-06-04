package OOP;

public class Main {
    public static void main(String[] args) {
        System.out.println("NATIVE");
        Native omaPosh = new Native();
        omaPosh.eat();
        omaPosh.sleep();
        omaPosh.talk();
        omaPosh.learnJava();

        System.out.println("FACILITATORS");
        Facilitators grace = new Facilitators();
        grace.teachJava();

    }
}
