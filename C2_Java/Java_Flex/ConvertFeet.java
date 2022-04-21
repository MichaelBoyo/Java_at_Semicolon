package C2_Java.Java_Flex;

import java.util.Scanner;

public class ConvertFeet { 						
	public static void main (String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter value for feet: ");
	double feet = input.nextDouble();

	double meters = feet * 0.305;

	   System.out.printf("%f feet is %f meters", feet, meters);
	   }


}