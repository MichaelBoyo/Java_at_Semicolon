package C14_Java;

import java.util.Scanner;

public class TokenizingTelephoneNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = scanner.nextLine();
        String areaCodeTokens = phoneNumber.split("[()]")[1];

        String[] phoneTokens = phoneNumber.substring(5).split("-");

        StringBuilder phone = new StringBuilder();
        for (String digits : phoneTokens) {
            phone.append(digits);
        }
        String[] newStr = phone.toString().split(" ");
        phone = new StringBuilder();
        for (String digits : newStr) {
            phone.append(digits);
        }
        System.out.println("area code-> " + areaCodeTokens);
        System.out.println("phone-> " + phone);
    }
}
