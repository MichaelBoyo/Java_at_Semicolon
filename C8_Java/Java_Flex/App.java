package C8_Java.Java_Flex;
import java.util.Scanner;

public class App {
    public static void main(String... chubuzo1){
        Scanner guess = new Scanner(System.in);

        System.out.println("guess the number:");
        int Num = guess.nextInt();

        int myNumber = 5;
        
        if (Num == myNumber ){
            System.out.println("your guess is correct");
        }
        if (Num < myNumber && Num < 0){
            System.out.println("your guess is too far");
        }
        if (Num < myNumber && Num > 0){
            System.out.println("your guess is close");
        }
        if (Num > myNumber && Num > 10){
            System.out.println("your guess is too far");
        }
        if (Num > myNumber && Num < 10){
            System.out.println("your guess is close");
        }
    }
}
