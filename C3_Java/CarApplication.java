package C3_Java;

import C3_Java.Car;

public class CarApplication {
    public static void main(String... args){
        Car BoyoMihael = new Car("RollsRoyce","2022",20000);
        Car BoyoElijah = new Car("G-Wagon","2022",234567);

        BoyoMihael.setPercentageDiscount(5);
        BoyoElijah.setPercentageDiscount(7);

        System.out.printf("The actual price Michael's car is $%.0f%n%n", BoyoMihael.getActualPrice());
        System.out.printf("The actual price Elijah's car is $%.0f%n%n", BoyoElijah.getActualPrice());
        System.out.printf("The percent discount for Elijah's car is %.0f percent %n ", BoyoElijah.getPercentageDiscount());

    }
}
