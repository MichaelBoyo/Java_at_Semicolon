package C2_Java.Java_Flex;

import java.util.Scanner;

public class CalculateTwoNumbers{

	public static void main(String[] args){

	Scanner InputValues = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNumber = InputValues.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = InputValues.nextInt();

	int addition = firstNumber + secondNumber;
	int substraction = firstNumber - secondNumber;
	int multiplication = firstNumber * secondNumber;
	int division = firstNumber / secondNumber;

//System.out.printf("The sum is %d \nThe difference is %d \nThe product is %d \nThe division is %d", addition, substraction, multiplication, division);
		System.out.printf("The sum of \"%d and %d\" is %d%n", firstNumber, secondNumber, addition);
		System.out.printf("The difference is %d%n", substraction);
		System.out.printf("The product is %d%n", multiplication);
		System.out.printf("\"%d\" divided by \"%d\" gives us %d", firstNumber, secondNumber, division);
}}