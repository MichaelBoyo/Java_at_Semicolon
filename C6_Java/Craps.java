package C6_Java;


import java.security.SecureRandom;
import java.util.Scanner;

public class Craps {
    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {CONTINUE, WON, LOST}

    static Status gameStatus;

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    static Scanner input = new Scanner(System.in);
    public static int bankBalance;


    public static void main(String[] args) {

        int myPoint = 0;

        System.out.println("Enter deposit:");
        bankBalance = input.nextInt();
        System.out.println("Enter wager:");
        int wager = input.nextInt();


        while (bankBalance != 0) {
            while (wager > bankBalance) {
                System.out.print("Enter valid wager: ");
                wager = input.nextInt();
            }

            int sumOfDice = rollDice();
            switch (sumOfDice) {
                case SEVEN, YO_LEVEN -> gameStatus = Status.WON;

                case SNAKE_EYES, TREY, BOX_CARS -> gameStatus = Status.LOST;
                default -> {
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    System.out.printf("Point is %d%n", myPoint);
                }
            }

            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice();

                if (sumOfDice == myPoint) {
                    gameStatus = Status.WON;
                } else if (sumOfDice == 7) {
                    gameStatus = Status.LOST;
                }
            }
            if (gameStatus == Status.WON) {
                System.out.println("Player wins");
                bankBalance += wager;
            } else {
                System.out.println("player loses");
                bankBalance -= wager;
            }
            System.out.println("your new bank balance is " + bankBalance);
            chatter();
            if (bankBalance != 0) {
                System.out.print("enter wager or 0 to end: ");
                wager = input.nextInt();
            }
        }
    }

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }

    public static void chatter() {
        if (gameStatus == Status.WON) {
            System.out.println("You're Big up.. Now's the time to cash-out");
        } else {
            if (bankBalance != 0) {
                System.out.println("Oh you're going for broke");

            } else System.out.println("You're broke");
        }

    }
}