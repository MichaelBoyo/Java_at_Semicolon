package C3_Java.Chibuzo_Assg;

import java.util.Scanner;
import java.io.*;

public class MathPowManual {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter 2 numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int num1Pow2 = 1;
        int num2Pow1 =1;

        for(int i = num2; i!=0; i--){
            num1Pow2 = num1Pow2 *num1;
        }
        System.out.println(num1 +" raised to the power of "+num2 +" is "+num1Pow2);

        for(int i = num1; i!=0; i--){
            num2Pow1 = num2Pow1 *num2;
        }
        System.out.println(num2 +" raised to the power of "+num1 +" is "+num2Pow1);


    }
}
