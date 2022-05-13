package C5_Java.Chibuzo_Assg;

import java.util.Scanner;

public class NumCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int posCount = 0;
        int negCount = 0;
        int zCount = 0;

        System.out.print("Enter numbers or +1 to terminate: ");
        int num = scanner.nextInt();

        while (num!=+1) {
                if (num > 0) {posCount = posCount + 1;}
                if (num == 0) {zCount = zCount + 1;}
                if (num < 0) {negCount = negCount + 1;}

                System.out.print("Enter numbers or +1 to terminate: ");
                num = scanner.nextInt();
        }

        System.out.println("you entered "+posCount+" positive numbers "+negCount+" negative numbers and "+zCount+" zeroes");

    }
}