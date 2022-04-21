package C2_Java;

import java.util.Scanner;
public class Arithmetic2{
    public static void main(String... args){

        Scanner InputNum = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int firstNum = InputNum.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNum = InputNum.nextInt();

        System.out.print("Enter Third Number: ");
        int thirdNum = InputNum.nextInt();

        int sum = firstNum + secondNum + thirdNum;
        int average = (firstNum +  secondNum + thirdNum) / 3;
        int product = firstNum * secondNum * thirdNum;

        System.out.printf("The sum is %d%nThe average is %d%nThe product is %d%n", sum, average, product);

        if (firstNum < secondNum && firstNum < thirdNum) {
            System.out.printf("%d is the smallest number%n", firstNum);
        }
        if (secondNum < firstNum && secondNum < thirdNum) {
            System.out.printf("%d is the smallest number%n", secondNum);
        }
        if (thirdNum < secondNum && thirdNum < firstNum) {
            System.out.printf("%d is the smallest number%n", thirdNum);
        }

        if (firstNum > secondNum && firstNum > thirdNum) {
            System.out.printf("%d is the largest number%n", firstNum);
        }
        if (secondNum > firstNum && secondNum > thirdNum) {
            System.out.printf("%d is the largest number%n", secondNum);
        }
        if (thirdNum > secondNum && thirdNum > firstNum) {
            System.out.printf("%d is the largest number%n", thirdNum);
        }



    }
}