package C6_Java;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void guess() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("guess a number between 1 and 1000: ");
        int number = scanner.nextInt();

        while(number!=0) {
            int counter=1;
            int randomNumber = random.nextInt(1000) + 1;
            while (number != randomNumber) {

                counter++;
                if (number > randomNumber) {
                    System.out.println("too high, try again");
                } else {
                    System.out.println("too low");
                }

                System.out.println("guess a number between 1 and 1000: ");
                number = scanner.nextInt();
            }

            System.out.println("you guessed " + counter + " times");
            if(counter<10){
            System.out.println("correct..either na juju or you got lucky");}
            if(counter==10){
                System.out.println("aha, you know the secret");}
            if(counter>10){
                System.out.println("nice..but you should be able to do better");}
            System.out.println("press 1 to guess another number or 0 to end");
            number = scanner.nextInt();
        }
    }
    public static void main(String[] args) {
        guess();
    }
}