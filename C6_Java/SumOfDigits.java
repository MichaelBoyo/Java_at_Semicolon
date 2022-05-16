package C6_Java;

import java.util.Scanner;

import static Java_Flex.Ober.displayln;

public class SumOfDigits {
    private static void digitsSum() {
        String num = collectInput();
        int result = sumChars(num);
        displayln(String.valueOf(result));
    }

    private static String collectInput() {
        System.out.print("enter a 4 digit integer number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return String.valueOf(number);
    }

    private static int sumChars(String num) {
        return getNumVal(num, 0) + getNumVal(num, 1) + getNumVal(num, 2) + getNumVal(num, 3);
    }

    private static int getNumVal(String num, int position) {
        return Character.getNumericValue(num.charAt(position));
    }

    public static void main(String[] args) {
        digitsSum();
    }
}
