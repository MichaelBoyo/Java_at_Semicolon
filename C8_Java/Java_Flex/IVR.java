package C8_Java.Java_Flex;

import java.util.Scanner;

public class IVR {
    public static void main(String... args) {


        for (int num = 1; num <= 4; num++) {
            System.out.printf("press %d", num);
            switch (num) {
                case 1 -> System.out.println(" for english");
                case 2 -> System.out.println(" for igbo");
                case 3 -> System.out.println(" for french");
                case 4 -> System.out.println(" for yoruba");
            }
        }
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            if (input == 1) {
                System.out.print(input);
                for ( input = 1; input <= 2; input++) {
                    switch (input) {
                        case 1 -> System.out.println(" for data");
                        case 2 -> System.out.println("2 for transfer");
                    }
                }
                int option = scanner.nextInt();
                if(option==1){
                    System.out.println("data");
                }
                else{
                    System.out.println("transfer");
                }

            }
        if (input == 2) {
            System.out.print("");
            for ( input = 1; input <= 2; input++) {
                switch (input) {
                    case 1 -> System.out.println("1 for caring");
                    case 2 -> System.out.println("2 for sharing");
                }
            }
            int option = scanner.nextInt();
            if(option==1){
                System.out.println("caring");
            }
            else{
                System.out.println("caring");
            }

        }
        if (input == 3) {
            System.out.print("");
            for ( input = 1; input <= 2; input++) {
                switch (input) {
                    case 1 -> System.out.println(" 1 for egg");
                    case 2 -> System.out.println("2 for champagne");
                }
            }
            int option = scanner.nextInt();
            if(option==1){
                System.out.println("egg");
            }
            else{
                System.out.println("champagne");
            }

        }
        if (input == 4) {
            System.out.print("");
            for ( input = 1; input <= 2; input++) {
                switch (input) {
                    case 1 -> System.out.println("1 for ewa");
                    case 2 -> System.out.println("2 for agonyin");
                }
            }
            int option = scanner.nextInt();
            if(option==1){
                System.out.println("ewa");
            }
            else{
                System.out.println("agonyin");
            }

        }

        }

}