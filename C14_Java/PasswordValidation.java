package C14_Java;

import java.util.Objects;
import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        String password;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter password");
            password = scanner.next();

            if (password.length() >= 8 && password.length() <= 16
                    && password.substring(0, 1).matches("[A-Za-z]*[1-9]")
                    && password.matches("[A-Za-z]*[1-9]")
            ) {
                System.out.println("valid password");
            } else System.out.println("invalid password");
        } while (!Objects.equals(password, "0"));


    }
}
