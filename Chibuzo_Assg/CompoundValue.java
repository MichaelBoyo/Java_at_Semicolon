package Chibuzo_Assg;

import java.util.Scanner;

public class CompoundValue {
    public static void main(String... args){

        Scanner Input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double MonthlyAmount = Input.nextDouble();

        double month1 = MonthlyAmount * (1 + 0.00417);
        double month2 = (MonthlyAmount + month1) * (1 + 0.00417);
        double month3 = (MonthlyAmount + month2) * (1 + 0.00417);
        double month4 = (MonthlyAmount + month3) * (1 + 0.00417);
        double month5 = (MonthlyAmount + month4) * (1 + 0.00417);
        double month6 = (MonthlyAmount + month5) * (1 + 0.00417);


        System.out.printf("After the sixth month, the account Value is $%.2f", month6);
    }
}