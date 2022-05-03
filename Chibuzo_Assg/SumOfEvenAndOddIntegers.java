package Chibuzo_Assg;

import java.util.Scanner;

public class SumOfEvenAndOddIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int odd =0;
        int even = 0;

        for(int i = 1; i<=20; i++){
            if(i%2==0){
                even=even+i;
            }else{
                odd= odd+i;
            }
        }
        System.out.println("the sum of the even numbers between 1 and 20 is "+even);
        System.out.println("the sum of the odd numbers between 1 and 20 is "+odd);

    }
}
