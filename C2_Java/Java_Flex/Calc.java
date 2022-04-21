package C2_Java.Java_Flex;

import java.util.Scanner;
public class Calc {
    public static void main(String... voila){

        Scanner inputVal = new Scanner(System.in);

        System.out.print("Enter 1st no: ");
        int num1 = inputVal.nextInt();

        System.out.print("Enter 2nd no: ");
        int num2 = inputVal.nextInt();

      int sum = num1 + num2;
        System.out.printf("\"%d\" added to \"%d\" gives you \"%d\"", num1, num2, sum);

    }
}