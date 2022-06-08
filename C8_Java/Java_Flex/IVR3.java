package C8_Java.Java_Flex;

import java.util.Scanner;

public class IVR3 {

    public static void main(String[] args) {
        String prompt = """
                1 -> for English
                2 -> for Igbo
                3 -> for French
                4 -> for Yoruba
                """;
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);

        String userResponse = scanner.nextLine();
        switch (userResponse.charAt(0)) {
            case '1' -> englishMenu();
            case '2' -> igboMenu();
            case '3' -> frenchMenu();
            case '4' -> yorubaMenu();
        }
    }

    private static void yorubaMenu() {
        String userResponse;
        String prompt;
        prompt = """
                1 -> for Ewa
                2 -> for Agonyin
                """;

        userResponse = prompt(prompt);
        switch (userResponse.charAt(0)) {
            case 1 -> System.out.println("Ewa");
            case 2 -> System.out.println("Agonyin");
            default -> System.out.println("fool");
        }
    }
    public static String prompt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

    private static void frenchMenu() {
        String userResponse;
        String prompt;
        prompt = """
                1 -> for Egg
                2 -> for Champagne
                """;
        userResponse = prompt(prompt);
        switch (userResponse.charAt(0)) {
            case 1 -> System.out.println("Egg");
            case 2 -> System.out.println("Champagne");
            default -> System.out.println("Weyrey");
        }
    }

    private static void igboMenu() {
        String prompt;
        String userResponse;
        prompt = """
                1 -> for Sharing
                2 -> for Caring
                """;
        System.out.println(prompt);
        userResponse = prompt(prompt);
        switch (userResponse.charAt(0)) {
            case 1 -> System.out.println("Sharing");
            case 2 -> System.out.println("Caring");
            default -> System.out.println("Mumu");
        }
    }

    private static void englishMenu() {
        String prompt;
        String userResponse;
        prompt = """
                1 -> for Data
                2 -> for Transfer
                """;

        userResponse = prompt(prompt);
        switch (userResponse.charAt(0)) {
            case 1 -> System.out.println("Data");
            case 2 -> System.out.println("Transfer");
            default -> System.out.println("idiot");
        }
    }

}