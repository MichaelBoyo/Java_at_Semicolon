package C7_Java;

import java.util.Objects;
import java.util.Scanner;

public class BoyoAir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AirlineReservation boyoAir = new AirlineReservation(10);
        int input = 0;
        System.out.println("WELCOME TO BOYO AIR");
        while (input != -1) {
            System.out.println("Enter 1 to Book FirstClass or 2 for Economy: ");
            input = scanner.nextInt();
            switch (input) {
                case 1 -> firstClass(scanner, boyoAir);
                case 2 -> economy(scanner, boyoAir);
            }
            System.out.println("Enter 1  to book again or -1 to end");
            input = scanner.nextInt();
        }
    }

    private static void economy(Scanner scanner, AirlineReservation boyoAir) {
        String name;
        String status;
        System.out.print("Enter your name: ");
        name = scanner.next();
        status = boyoAir.bookFlightEconomy(name);
        if (Objects.equals(status, "full")) {
            System.out.print("Enter yes or no:");
            name = scanner.next();
            switch (name) {
                case "yes" -> {
                    System.out.print("Enter your name: ");
                    name = scanner.next();
                    boyoAir.bookFlightFirstClass(name);
                }
                case "no" -> System.out.print("Next Flight leaves in 3 hours ");
            }
        }
    }

    private static void firstClass(Scanner scanner, AirlineReservation boyoAir) {
        String name;
        String status;
        System.out.print("Enter your name: ");
        name = scanner.next();
        status = boyoAir.bookFlightFirstClass(name);
        if (Objects.equals(status, "full")) {
            System.out.print("Enter yes or no:");
            name = scanner.next();
            switch (name) {
                case "yes" -> {
                    System.out.print("Enter your name: ");
                    name = scanner.next();
                    boyoAir.bookFlightEconomy(name);
                }
                case "no" -> System.out.print("Next Flight leaves in 3 hours ");
            }
        }
    }
}