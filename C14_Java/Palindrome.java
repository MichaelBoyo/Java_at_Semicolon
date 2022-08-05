package C14_Java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a word to know if its palindrome");
        String word = scanner.next();
        StringBuilder wordStr = new StringBuilder(word);
        if(wordStr.reverse().toString().equals(word)){
            System.out.println("its a palindrome");
        }else System.out.println("not a palindrome");
    }

}
