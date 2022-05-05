package C2_Java;

import java.util.Scanner;
public class SeparatingDigits {
    public static void main(String... args) {

        Scanner Input = new Scanner(System.in);

        System.out.print("Enter a Five digit number: ");
        String num = Input.nextLine();
        int Num = Integer.parseInt(num);

        if (Num / 10000 >= 1 && Num / 100000 < 1) {
            char A = num.charAt(0);
            char B = num.charAt(1);
            char C = num.charAt(2);
            char D = num.charAt(3);
            char E = num.charAt(4);

            System.out.printf("%c   %c   %c   %c   %c", A, B, C, D, E);
        }else{
            System.out.println("incorrect input.. restart program");
        }

    }
}