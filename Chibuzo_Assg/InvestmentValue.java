package Chibuzo_Assg;

import java.util.Scanner;

public class InvestmentValue {
    public static void main(String... args){

        Scanner Input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double InvestmentAmount = Input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double InterestRate = Input.nextDouble();

        System.out.print("Enter number of years: ");
        int NumberOfYears = Input.nextInt();

        double actualInterestRate = 1 + (InterestRate / 100);

        double MathPow = Math.pow(actualInterestRate, NumberOfYears);

        double FutureInvestmentValue = InvestmentAmount * MathPow;

        System.out.printf("Accumulated Value is %.2f", FutureInvestmentValue);
    }
}