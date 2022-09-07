package chief;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {

    private Socket socket;
    private DataInputStream input;
    private DataOutputStream out;

    public Client(String address, int port) {

        try {
            socket = new Socket(address, port);
            System.out.println("Connected");
            input = new DataInputStream(System.in);
            out = new DataOutputStream(socket.getOutputStream());
        } catch (IOException u) {
            u.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        String line = "";

        while (!line.equals("Exit")) {
            try {
                line = scanner.nextLine();
                out.writeUTF(line);
            } catch (IOException i) {
                System.out.println(i);
            }
        }

        try {
            input.close();
            out.close();
            socket.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        Client client = new Client("172.16.0.188", 5000);
    }
}
