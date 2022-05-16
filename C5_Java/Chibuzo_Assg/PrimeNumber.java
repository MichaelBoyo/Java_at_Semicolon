package C5_Java.Chibuzo_Assg;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter  positive integer: ");
        int number = scanner.nextInt();
        int factors= 0;

        factors = getFactors(number, factors);
        if(factors==2){
            System.out.println(number+ " is a prime number ");
        }else{
            System.out.println(number+" is not a prime number");
        }

    }

    public static int getFactors(int number, int factors) {
        for(int i = 1; i<= number; i++){
            if(number %i == 0){
                factors = factors +1;
            }
        }
        return factors;
    }
}
