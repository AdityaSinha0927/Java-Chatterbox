package chatterbox;

import java.net.Socket;
import java.io.IOException;
import java.io.PrintWriter;

public class Client {
    public static void main(String[] args) {
        String serverAddress = "Localhost";
        int port = 5000;

        try{
            Socket socket = new Socket(serverAddress, port);
            System.out.println("Connected to server!");

            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            writer.println("Hello from the client!");
        }
        catch(IOException e){
            System.out.println("Could not connect to server: " + e.getMessage());
        }
    }
}