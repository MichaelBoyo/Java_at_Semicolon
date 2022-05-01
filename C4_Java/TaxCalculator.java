package C4_Java;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tax;

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your earnings: ");
        int earnings = scanner.nextInt();

        if(earnings<= 30000){
            tax =  (0.15 *earnings);
        }
        else{
            tax =(0.2 * earnings);
        }
        System.out.printf("%s, your total tax is $%.2f",name,tax);

    }
}
