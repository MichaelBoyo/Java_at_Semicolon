package C4_Java;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double item1 = 239.99;
        double item2 = 129.75;
        double item3 = 99.95;
        double item4 = 350.89;

        double item1Earnings;
        double item2Earnings;
        double item3Earnings;
        double item4Earnings;


        System.out.print("enter number of item1 sold: ");
        int noOfItem1 = scanner.nextInt();

        double total1 = (double) noOfItem1 * item1;
        item1Earnings = (0.09 * total1) + 200;

        System.out.print("Enter number of item2 sold: ");
        int noOfItem2 = scanner.nextInt();

        double total2 = (double) noOfItem2 * item2;
        item2Earnings = (0.09 * total2) + 200;

        System.out.print("Enter number of item3 sold: ");
        int noOfItem3 = scanner.nextInt();

        double total3 = (double) noOfItem3 * item3;
        item3Earnings = (0.09 * total3) + 200;

        System.out.print("Enter number of item4 sold: ");
        int noOfItem4 = scanner.nextInt();

        double total4 = (double) noOfItem4 * item4;
        item4Earnings = (0.09 * total4) + 200;

        System.out.println();

        double totalEarnings = item1Earnings + item2Earnings + item3Earnings  + item4Earnings;
        System.out.println("your total earnings is $" +totalEarnings);
        }
}
