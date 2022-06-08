package C8_Java.Java_Flex;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String... args){

        Scanner inputNum = new Scanner(System.in);

        System.out.print("Enter firstNum: ");
        int firstNum = inputNum.nextInt();

        System.out.print("Enter secondNum: ");
        int secondNum = inputNum.nextInt();

        int squareOfFirstNum = firstNum * firstNum;
        int squareOfSecondNum = secondNum * secondNum;
        int SumOfSquares = squareOfFirstNum + squareOfSecondNum;
        int DifferenceBetweenSquares = squareOfFirstNum - squareOfSecondNum;

        System.out.println("The square of the first number is " + squareOfFirstNum);
        System.out.println("The square of the second number is " + squareOfSecondNum);
        System.out.println("The sum of both squares is " + SumOfSquares);
        System.out.println("The difference between both squares is " + DifferenceBetweenSquares);


    }
}