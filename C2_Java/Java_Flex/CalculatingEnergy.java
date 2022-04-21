package C2_Java.Java_Flex;// Calculating Energy
//Boyo 04.10.2022
import java.util.Scanner;   						
public class CalculatingEnergy { 						
	public static void main (String[] args) {                       
	Scanner input = new Scanner(System.in);                         
	System.out.print("Enter amount of water in kilograms: ");   	
	double number1 = input.nextDouble();     			
	System.out.print("Enter initial temperature: ");     		
	double number2 = input.nextDouble();     			

	System.out.print("Enter final temperature: ");     		
	double number3 = input.nextDouble();       			

	double sum = number1 * (number3 - number2) * 4184;
	System.out.printf("The energy needed is %f%n", sum);
	 

  }	

}