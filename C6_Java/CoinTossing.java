package C6_Java;

import java.util.Random;
import java.util.Scanner;

public class CoinTossing {
    public static int toss;

    public static void toss() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("press 1 to toss or 0 to end: ");
        int number = scanner.nextInt();

        int head = 0;
        int tail = 0;

        while (number!=0) {
             toss = random.nextInt(2) + 1;

            if (toss == 1) {
                flip();
                head++;
            } else {
                flip();
            tail++;
            }
            System.out.println("press 1 to toss or 0 to end: ");
             number = scanner.nextInt();
        }
        System.out.println("occurrence of head "+head);
        System.out.println("occurrence of tail "+tail);
    }
    public static void flip (){
        enum result {HEAD, TAIL}
        if (toss == 1) {
            System.out.println(result.HEAD);
        } else {
            System.out.println(result.TAIL);
        }

    }

    public static void main(String[] args) {
        toss();
    }
}