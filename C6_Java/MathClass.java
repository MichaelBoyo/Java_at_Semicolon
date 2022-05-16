package C6_Java;

public class MathClass {
    public static void main(String[] args) {
        double x;
        x = Math.abs(-7.5);
        System.out.println("Math.abs of -7.5 is "+x);

        x = Math.floor(5 + 2.7);
        System.out.println("Math.floor(5 + 2.5) is "+x);

        x = Math.abs(9) + Math.ceil(2.2);
        System.out.println("Math.abs(9) + Math.ceil(2.2) is "+x);

        x = Math.ceil(-5.8);
        System.out.println("Math.ceil(-5.8) is "+x);

        x = Math.abs(-5) + Math.abs(4);
        System.out.println("Math.abs(-5) + Math.abs(4) is "+x);

        x = Math.ceil(-6.4) - Math.floor(5.2);
        System.out.println("Math.ceil(-6.4) - Math.floor(5.2) is "+x);

        x = Math.ceil(-Math.abs(-3 + Math.floor(-2.5)));
        System.out.println("Math.ceil(-Math.abs(-3 + Math.floor(-2.5))) is "+x);
    }
}
