package C5_Java.Chibuzo_Assg;

import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] args) {
        Scanner canner = new Scanner(System.in);

        int factorial = 1;
        int i=1;

        System.out.print("Enter positive integer:");
        int number = canner.nextInt();

        while (i<=number){
            factorial = factorial *i;
            i++;
        }
        System.out.println(factorial);
    }
}
