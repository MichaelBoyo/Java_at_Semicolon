package C2_Java;

import java.util.Scanner;
public class SeparatingDigits {
    public static void main(String... args){

        Scanner Input = new Scanner(System.in);

        System.out.print("Enter a Five digit number: ");
        char a = Input.next().charAt(0);
        char b = Input.next().charAt(1);
        char c = Input.next().charAt(2);
        char d = Input.next().charAt(3);
        char e = Input.next().charAt(4);

//        char A = a;
//        char B = b;
//        char C = c;
//        char D = d;
//        char E = e;


        System.out.printf("%c   %c   %c   %c   %c", a, b, c, d, e);
    }

}
