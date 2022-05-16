package C6_Java;

public class HypotenuseCalculations {
    private static double hypotenuse(double side1, double side2){
        return Math.hypot(side1,side2);
    }

    public static void main(String[] args) {
        System.out.println(hypotenuse(3.0,4.0));
        System.out.println(hypotenuse(5.0, 12.0));
        System.out.println(hypotenuse(8.0, 15.0));

    }
}

