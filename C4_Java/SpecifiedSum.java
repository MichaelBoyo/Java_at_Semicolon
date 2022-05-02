package C4_Java;

import java.util.Scanner;

public class SpecifiedSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int total = 0;
        int num;
        int num2;

        System.out.print("Enter integer: ");
        num = scanner.nextInt();

        while (num != 0) {
            while (num != 0) {
                System.out.print("Enter integer: ");
                num2 = scanner.nextInt();
                total = total + num2;
                if (total >= num) {
                    System.out.println("sum of all numbers is greater than initial number");
                }
                num++;
            }
            num++;
        }
    }

}
