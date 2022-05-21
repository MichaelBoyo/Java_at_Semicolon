package C7_Java;

import java.util.Scanner;

public class Hotel {
    public Hotel (int room){
    }
    String[] name = new String[10];
    Scanner input = new Scanner(System.in);

    public  void book_A_Room(int roomNumber) {
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
    public  void checkOut() {
        System.out.println("Enter room number");
        int room = input.nextInt();

        System.out.printf("%s has successfully checked out%n",name[room-1]);
        name[room - 1] = null;
    }
    public  void roomStatus() {
        for (int i = 0; i < name.length; i++) {
            if (name[i] == null) {
                System.out.println("Room " + (i + 1) + " is empty");
            } else System.out.println("Room " + (i + 1) + " is occupied by " + name[i]);

        }
        System.out.println();
    }
}