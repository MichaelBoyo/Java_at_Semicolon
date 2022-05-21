package C7_Java;

import javax.net.ssl.HostnameVerifier;
import java.util.Scanner;

public class BabeeHotel {

    public static void main(String[] args) {
        Hotel Babee = new Hotel(10);
        System.out.println("WELCOME TO BABEE HOTEL");
        int entry = 0;
        while (entry != -1) {
            int random = (int) (Math.random() * 10);
            String menu = ("""
                    Enter 1 to make a reservation
                    enter 2 to check out
                    enter 3 to check rooms status
                    enter -1 to exit:
                    """);
            System.out.println(menu);
            Scanner input = new Scanner(System.in);
            entry = input.nextInt();
            switch (entry) {
                case 1 -> Babee.book_A_Room(random);
                case 2 -> Babee.checkOut();
                case 3 -> Babee.roomStatus();
            }
        }
    }
}
