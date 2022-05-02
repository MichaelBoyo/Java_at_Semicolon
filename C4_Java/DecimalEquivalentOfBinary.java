package C4_Java;

import java.util.Scanner;

public class DecimalEquivalentOfBinary {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int num1= 0;
        int num2= 0;
        int num3= 0;
        int num4= 0;
        int digits;

        int i=0;
        System.out.print("Enter integer containing only 0 and 1: ");
        int num=scanner.nextInt();
        int number = num;

        while (num!=0){
            num/=10;
            i++;
            System.out.println(num);
        }
        while(number!=0){
            digits = number%10;
            if (i == 4) {
                num4 = digits;
            }
            if (i == 3) {
                num3 = digits *2;
            }
            if (i == 2) {
                num2 = digits *4;
            }
            if (i == 1) {
                num1 = digits*8;
            }
            number/=10;

            i--;
            System.out.println(number);
        }
        int total = num1 +num2 + num3+num4;
        System.out.printf("the decimal equivalent of %d is %d",num,total);
    }
}
