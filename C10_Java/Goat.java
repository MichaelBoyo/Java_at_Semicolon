package C10_Java;

public class Goat implements Animal{


    public static void main(String[] args) {
        Goat goat = new Goat();
        System.out.println(goat.move());
        System.out.println(goat.eat());
    }

    public String move() {
        return "i am moving";
    }

    public String eat() {
        return "i am eating";
    }
}

