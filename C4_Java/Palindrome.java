package C4_Java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reversed = 0;

        System.out.print("enter a 5 digit number: ");
        int num = scanner.nextInt();
        int half = num / 2;

        if (num / 10000 >= 1 && num / 100000 < 1) {
            while (num != 0) {

                int digit = num % 10;
                reversed = reversed * 10 + digit;

                num /= 10;
            }

            int halfRev = reversed / 2;
            System.out.println(reversed);
            if (half == halfRev) {
                System.out.print("the number is  a palindrome");
            } else {
                System.out.println("the number is not a palindrome");
            }
        } else {
            System.out.print("Restart application and enter a 5 digit number");
        }
    }
}
