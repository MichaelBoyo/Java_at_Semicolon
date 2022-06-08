package C8_Java.Java_Flex;

import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){

	Scanner Inputvalues = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNumber = Inputvalues.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = Inputvalues.nextInt();

	int addition = firstNumber + secondNumber;
	int substraction = firstNumber - secondNumber;
	int multiplication = firstNumber * secondNumber;
	int division = firstNumber / secondNumber;

//System.out.printf("The sum is %d \nThe difference is %d \nThe product is %d \nThe division is %d", addition, substraction, multiplication, division);
		System.out.printf("The sum is %d%n", addition);
		System.out.printf("The difference is %d%n", substraction);
		System.out.printf("The product is %d%n", multiplication);
		System.out.printf("The division is %d", division);
}}