package C6_Java;

public class MethodOverload {
    private static int square(int value){
        System.out.println("called square method with int args");
        return  value * value;
    }
    private static double square (double value){
        System.out.println("called  square method with floating point args ");
        return value *value;
    }

    public static void main(String[] args) {
        System.out.println("square of int 7 is "+square(7));
        System.out.println("square of double 7.7 is "+ square(7.7));
    }
}
