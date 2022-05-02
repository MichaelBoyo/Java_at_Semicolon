package C4_Java;

import java.util.Scanner;

public class DecimalEquivalentOfBinary {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int num1= 0;
        int num2= 0;
        int num3= 0;
        int num4 = 0;
        int num5 = 0;
        int digits;
        int num;

        int i=0;
        System.out.print("Enter a 5 digit integer containing only 0 and 1: ");
        num=scanner.nextInt();

        int number = num;

        while (num!=0){
            num/=10;
            i++;
        }

        while(number!=0) {
            digits = number % 10;
            if (i == 5) {
                num5 = digits;
            }
            if (i == 4) {
                num4 = digits * 2;
            }
            if (i == 3) {
                num3 = digits * 4;
            }
            if (i == 2) {
                num2 = digits * 8;
            }
            if (i == 1) {
                num1 = digits*16;
            }
            number/=10;

            i--;

        }
        int total = num1 +num2 + num3+num4+num5;
        System.out.println("the decimal equivalent of  is "+total);
    }
}
