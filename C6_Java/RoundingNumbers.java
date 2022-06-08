package C6_Java;

import java.util.Scanner;

import static C8_Java.Java_Flex.Ober2.display;

public class RoundingNumbers {
    public static void roundNumber() {
        Scanner input = new Scanner(System.in);
        display("Enter decimal numbers");
        double num = input.nextDouble();

        while (num != 0) {

            double y = Math.floor(num + 0.5);
            System.out.println((int) y);


            display("Enter decimal numbers");
            num = input.nextDouble();
        }

    }

    public static void main(String[] args) {
        roundNumber();
    }
}
