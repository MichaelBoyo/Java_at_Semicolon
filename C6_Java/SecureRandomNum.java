package C6_Java;

import java.security.SecureRandom;

import static Java_Flex.Nokia.display;


public class SecureRandomNum {
    public static void main(String[] args) {
        SecureRandom number = new SecureRandom();
        int random = number.nextInt();
        display(String.valueOf(random));

    }
}
