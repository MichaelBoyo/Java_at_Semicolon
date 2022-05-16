package C6_Java;

import java.util.Scanner;

public class AsterisksSquare {
    private static void squareOfAsterisks(int num){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter character");
        char character = input.next().charAt(0);
        for(int i=1; i<=num; i++){
            System.out.println();
            for(int j=1; j<=num; j++){
                System.out.printf("%c   ",character );
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        squareOfAsterisks(8);
        squareOfAsterisks(6);
    }

}
