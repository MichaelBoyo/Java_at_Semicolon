package C4_Java;

import java.util.Scanner;

public class CryptographyDecrypt {
    public static void main(String[] args) {
        Scanner decrypt = new Scanner(System.in);

        int i = 0, num, number, digits;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;


        System.out.print("enter your encrypted 4 digit number: ");
        num = decrypt.nextInt();
        number = num;

        if (num / 1000 >= 1 && num / 10000 < 1) {

            while (num != 0) {
                num /= 10;
                i++;
            }
            while (number != 0) {
                digits = number % 10;
                if (i == 4) {
                    num4 = digits + 3;
                }
                if (i == 3) {
                    num3 = digits + 3;
                }
                if (i == 2) {
                    num2 = digits + 3;
                }
                if (i == 1) {
                    num1 = digits + 3;
                }

                number /= 10;
                i--;
            }
            System.out.printf("your digit has now been decrypted to %d%d%d%d", num1, num2, num3, num4);
        }else{
            System.out.println("restart application and enter valid number");
        }
    }
}
