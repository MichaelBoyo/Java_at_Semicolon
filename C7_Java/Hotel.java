package C7_Java;

import java.util.Scanner;

public class Hotel {
    static String[] name = new String[10];
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        int in = 0;
        for (int i = 0; in != -1; i++) {
            int random = (int) (Math.random() * 10);
            System.out.println("enter 1 to book a room: ");
            System.out.println("enter 2 to check out: ");
            System.out.println("enter 3 to check rooms status: ");
            System.out.println("enter -1 to exit");
            in = input.nextInt();
            switch (in) {
                case 1 -> book_A_Room(random);
                case 2 -> checkOut();
                case 3 -> roomStatus();
            }

        }
    }


    public static void book_A_Room(int roomNumber) {

        if (name[roomNumber] == null) {
            System.out.println("Enter your name: ");
            name[roomNumber] = input.next();
            System.out.println((name[roomNumber]) + " your room number is " + (roomNumber + 1));
            System.out.println();
        }else {
            int booked =0;
            for (String s : name) {
                if (s != null) {
                    booked += 1;
                }
            }
            if(booked==name.length){
                System.out.println("SORRY, WE ARE FULLY BOOKED");
            }else{
                System.out.println("see available rooms");
                roomStatus();
                System.out.println("choose room number");
                int number = input.nextInt();
                if(name[number-1]== null){
                    System.out.println("Enter name:");
                    name[number-1]= input.next();
                    System.out.println((name[number-1]) + " your room number is " + (number));
                    System.out.println();
                }
            }


        }

    }

    public static void checkOut() {
        System.out.println("Enter room number");
        int room = input.nextInt();
        name[room - 1] = null;
        System.out.println("you've successfully checked out");

    }

    public static void roomStatus() {
        for (int i = 0; i < name.length; i++) {
            if (name[i] == null) {
                System.out.println("room " + (i + 1) + " is empty");
            } else System.out.println("room " + (i + 1) + " is occupied by " + name[i]);

        }
        System.out.println();
    }
}
