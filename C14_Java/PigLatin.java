package C14_Java;

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence;
        do {
            System.out.println("enter sentence");
            sentence = scanner.nextLine();
            String[] tokens = sentence.split(" ");
            String suffix = "ay";
            for (int i = 0; i < tokens.length; i++) {
                char lastChar = tokens[i].charAt(0);
                String newToken = tokens[i].replace(tokens[i].charAt(0), ' ');
                tokens[i] = newToken.substring(1) + lastChar + suffix;
            }
            System.out.print("encrypt-> ");
            for (var tok : tokens) {
                System.out.print(tok + " ");
            }
            System.out.println();
            for (int i = 0; i < tokens.length; i++) {
                String token = tokens[i].substring(0, tokens[i].length() - 2);
                char last = token.charAt(token.length() - 1);
                String replace = token.replace(token.charAt(token.length() - 1), ' ');
                tokens[i] = last + replace.substring(0, replace.length() - 1);
            }
            System.out.println("decrypt-> ");
            for (var tok : tokens) {
                System.out.print(tok+" ");
            }
            System.out.println();
        } while (sentence != "0");


    }
}
