package C2_Java;

import java.util.Scanner;
public class DivisibleBy3 {
    public static void main(String... java){

        Scanner Input = new Scanner(System.in);

        System.out.print("Enter any Number: ");
        int number = Input.nextInt();

        if (number % 3 == 0) {
            System.out.printf("The number %d is divisible by 3", number);
        }
        if (number % 3 != 0) {
            System.out.printf("The number %d is not divisible by 3", number);
        }
    }
}