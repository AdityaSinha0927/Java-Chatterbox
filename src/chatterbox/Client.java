package chatterbox;

import java.net.Socket;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String serverAddress = "Localhost";
        int port = 5000;

        try {
            Socket socket = new Socket(serverAddress, port);
            System.out.println("Connected to server!");

            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);
            String message;
            while (!(message = scanner.nextLine()).equals("/exit")) {
                writer.println("Client: " + message);
            }
            System.out.println("Disconnected from server.");
            socket.close();
        } catch (IOException e) {
            System.out.println("Could not connect to server: " + e.getMessage());
        }
    }
}
