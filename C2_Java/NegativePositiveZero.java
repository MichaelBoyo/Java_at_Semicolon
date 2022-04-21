package C2_Java;

import java.util.Scanner;

public class NegativePositiveZero {
    public static void main(String[] args) {

        Scanner InputNum = new Scanner(System.in);

        System.out.print("Enter 5 Numbers: ");

        int countPositive=0, countNegative=0, countZero=0, inputs;
        int[] arr = new int[5];

        for(inputs=0; inputs<5; inputs++)
            arr[inputs] = InputNum.nextInt();

        for(inputs=0; inputs<5; inputs++)
        {
            if(arr[inputs]<0)
                countNegative++;
            else if(arr[inputs]>0)
                countPositive++;
            else
                countZero++;
        }
        System.out.println("Total Positive Number: " +countPositive);
        System.out.println("Total Negative Number: " +countNegative);
        System.out.println("Total Zero: " +countZero);
    }
}

