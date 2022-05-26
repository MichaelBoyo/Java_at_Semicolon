package C7_Java;


import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsMod {

    private static final SecureRandom randomNumbers = new SecureRandom();

    private enum Status {CONTINUE, WON, LOST}

    static CrapsMod.Status gameStatus;

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    public static Scanner input = new Scanner(System.in);
    public static int bankBalance;


    public static void main(String[] args) {
        int i = 0;
        int noOfGamesWon1stRow = 0;
        int secondRowWon = 0;

        int noOfGamesLost1stRow = 0;
        int secondRowLost = 0;
        while (i <= 1000) {
            int myPoint = 0;

            System.out.println("Enter deposit:");
            bankBalance = 1 + randomNumbers.nextInt(1000);


            System.out.println("Enter wager:");
            int wager = randomNumbers.nextInt(1000);


            while (bankBalance != 0) {
                while (wager > bankBalance) {
                    System.out.print("Enter valid wager: ");
                    wager = randomNumbers.nextInt(1000);
                }

                int sumOfDice = rollDice();

                switch (sumOfDice) {
                    case SEVEN, YO_LEVEN -> {
                        gameStatus = CrapsMod.Status.WON;
                        noOfGamesWon1stRow++;
                    }

                    case SNAKE_EYES, TREY, BOX_CARS -> {
                        gameStatus = CrapsMod.Status.LOST;
                        noOfGamesLost1stRow++;
                    }
                    default -> {
                        gameStatus = CrapsMod.Status.CONTINUE;
                        myPoint = sumOfDice;
                        System.out.printf("Point is %d%n", myPoint);
                    }
                }

                while (gameStatus == CrapsMod.Status.CONTINUE) {
                    sumOfDice = rollDice();

                    if (sumOfDice == myPoint) {
                        gameStatus = CrapsMod.Status.WON;
                        secondRowWon++;
                    } else if (sumOfDice == 7) {
                        gameStatus = CrapsMod.Status.LOST;
                        secondRowLost++;
                    }
                }
                if (gameStatus == CrapsMod.Status.WON) {
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
                    wager = randomNumbers.nextInt(1000);
                }
                i++;
            }
            System.out.println();
            System.out.println("total games played is "+i);
            System.out.println();
            System.out.println("no of games won at first roll is: " + noOfGamesWon1stRow);
            System.out.println("no of games won at second roll is: " + secondRowWon);
            System.out.println();
            System.out.println("no of games lost at first roll is: " + noOfGamesLost1stRow);
            System.out.println("no of games lost at second roll is: " + secondRowLost);

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
        if (gameStatus == CrapsMod.Status.WON) {
            System.out.println("You're Big up.. Now's the time to cash-out");
        } else {
            if (bankBalance != 0) {
                System.out.println("Oh you're going for broke");

            } else System.out.println("You're broke");
        }

    }

}
