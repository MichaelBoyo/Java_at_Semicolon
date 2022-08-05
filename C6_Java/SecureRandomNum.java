package C6_Java;

import java.security.SecureRandom;

public class SecureRandomNum {

    public static void main(String[] args) {
        SecureRandom number = new SecureRandom();
        for (int i = 1; i <= 20; i++) {
            int face = 1 + number.nextInt(6);
            System.out.printf("%d ", face);
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
