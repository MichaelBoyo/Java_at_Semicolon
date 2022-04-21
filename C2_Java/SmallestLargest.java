package C2_Java;

import java.util.Scanner;
public class SmallestLargest{
    public static void main(String... args){

        Scanner InputFigures = new Scanner(System.in);

        System.out.print("enter first number: ");
        int firstNumber = InputFigures.nextInt();

        System.out.print("enter second number: ");
        int secondNumber = InputFigures.nextInt();

        System.out.print("enter third number: ");
        int thirdNumber = InputFigures.nextInt();

        System.out.print("enter fourth number: ");
        int fourthNumber = InputFigures.nextInt();

        System.out.print("enter fifth number: ");
        int fifthNumber = InputFigures.nextInt();

        if (firstNumber < secondNumber && firstNumber < thirdNumber && firstNumber < fourthNumber && firstNumber < fifthNumber ){
            System.out.println(firstNumber  + " is the smallest number");
        }
        if (secondNumber < firstNumber && secondNumber < thirdNumber && secondNumber < fourthNumber && secondNumber < fifthNumber ){
            System.out.println(secondNumber  + " is the smallest number");
        }
        if (thirdNumber < firstNumber && thirdNumber < secondNumber && thirdNumber < fourthNumber && thirdNumber < fifthNumber ){
            System.out.println(thirdNumber + " is the smallest number");
        }
        if (fourthNumber < secondNumber && fourthNumber < thirdNumber && fourthNumber < firstNumber && fourthNumber > fifthNumber ){
            System.out.println(fourthNumber  + " is the smallest number");
        }
        if (fifthNumber < secondNumber && fifthNumber < thirdNumber && fifthNumber < firstNumber && fifthNumber > fourthNumber ){
            System.out.println(fifthNumber + " is the smallest number");
        }

        if (firstNumber > secondNumber && firstNumber > thirdNumber && firstNumber > fourthNumber && firstNumber > fifthNumber ){
            System.out.println(firstNumber  + " is the largest number");
        }
        if (secondNumber > firstNumber && secondNumber > thirdNumber && secondNumber > fourthNumber && secondNumber > fifthNumber ){
            System.out.println(secondNumber  + " is the largest number");
        }
        if (thirdNumber > firstNumber && thirdNumber > secondNumber && thirdNumber > fourthNumber && thirdNumber > fifthNumber ){
            System.out.println(thirdNumber + " is the largest number");
        }
        if (fourthNumber > secondNumber && fourthNumber > thirdNumber && fourthNumber > firstNumber && fourthNumber > fifthNumber ){
            System.out.println(fourthNumber  + " is the largest number");
        }
        if (fifthNumber > secondNumber && fifthNumber > thirdNumber && fifthNumber > firstNumber && fifthNumber > fourthNumber ){
            System.out.println(fifthNumber + " is the largest number");
        }


    }
}
