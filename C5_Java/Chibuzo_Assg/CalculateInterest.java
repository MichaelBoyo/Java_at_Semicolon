package C5_Java.Chibuzo_Assg;

import java.util.Scanner;

public class CalculateInterest {
    public static void main(String... args){

        Scanner Input = new Scanner(System.in);

        System.out.print("Enter Balance and interest rate: ");
        int Balance = Input.nextInt();
        double InterestRate = Input.nextDouble();

        double Interest = Balance * (InterestRate / 1200);

        System.out.printf("The Interest is %f", Interest);

    }
}
