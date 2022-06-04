package Java_Flex;

import java.util.Scanner;

public class IVR2 {
    public static void main(String... args) {

            for (int i = 1; i <= 4; i++) {
                System.out.printf("Enter %d for ", i);
                switch (i) {
                    case 1 -> System.out.println("English");
                    case 2 -> System.out.println("Igbo");
                    case 3 -> System.out.println("French");
                    case 4 -> System.out.println("Yoruba");
                }
            }


            Scanner scanner = new Scanner(System.in);

            int num = scanner.nextInt();
            switch (num) {
                case 1 -> {
                    System.out.println("1 for data");
                    System.out.println("2 for transfer");
                    num = scanner.nextInt();
                    switch (num) {
                        case 1 -> System.out.println("data");
                        case 2 -> System.out.println("transfer");
                    }
                }
                case 2 -> {
                    System.out.println("1 for sharing");
                    System.out.println("2 for caring");
                    num = scanner.nextInt();
                    switch (num) {
                        case 1 -> System.out.println("sharing");
                        case 2 -> System.out.println("caring");
                    }
                }
                case 3 -> {
                    System.out.println("1 for egg");
                    System.out.println("2 for champagne");
                    num = scanner.nextInt();
                    switch (num) {
                        case 1 -> System.out.println("egg");
                        case 2 -> System.out.println("champagne");
                    }
                }
                case 4 -> {
                    System.out.println("1 for ewa");
                    System.out.println("2 for agonyin");
                    num = scanner.nextInt();
                    switch (num) {
                        case 1 -> System.out.println("ewa");
                        case 2 -> System.out.println("agonyin");
                    }
                }
            }



    }
}