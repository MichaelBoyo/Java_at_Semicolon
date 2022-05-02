package C4_Java;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int factorial = 1;
        int i=1;

        System.out.print("Enter positive integer:");
        int number = scanner.nextInt();

        while (i<=number){
            factorial = factorial *i;
            i++;
        }
        System.out.println(factorial);

        System.out.print("Enter no of terms:");
        int numberOfTerms = scanner.nextInt();
        int e = 1;
        while (i<=numberOfTerms){
            e =1+  1/(e *i);
            i++;
        }
        System.out.println(e);

        System.out.print("Enter no of terms:");
        int mathPow = scanner.nextInt();
        int ex = (int)Math.pow(mathPow,i);
        while (i<=mathPow){
            e =1+  1/(e *i);
            i++;
        }
        System.out.println(e);
    }
}
