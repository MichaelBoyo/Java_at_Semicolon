package C4_Java;

import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pass = 0;
        int fail = 0;
        int resultCounter = 1;

        while(resultCounter <= 10){
            System.out.print("Enter result(Enter 1 for pass or 2 for fail): ");
            int result = scanner.nextInt();

            if(result == 1) pass= pass + 1;
            else fail = fail + 1;
            resultCounter = resultCounter +1;
        }
        System.out.printf("no os passes:%d%n no os fails:%d%n",pass,fail);

        if(pass> 8){
            System.out.println("Bonus to Instructor");
        }


    }
}
