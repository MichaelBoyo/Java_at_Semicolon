package C8_Java.Java_Flex;

import java.util.Scanner;


public class OneOrZero {
    public static void main(String[] args){
        Scanner inputNum = new Scanner(System.in);
        System.out.print("Enter 1 or 0: ");
        int input = inputNum.nextInt();

        if(input == 1){
            System.out.println("The number is 0");
        }
        if(input == 0){
            System.out.println("The number is 1");
        }

    }
}
