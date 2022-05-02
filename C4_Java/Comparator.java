package C4_Java;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Enter 2 integers: ");
            int int1 = scanner.nextInt();
            int int2 = scanner.nextInt();

            if(int1 == int2){
                System.out.println(0);
            } else if (int1>int2) {
                System.out.println(1);
            }else {
                System.out.println(-1);
            }
    }
}
