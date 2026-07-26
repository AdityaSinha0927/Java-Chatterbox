package chatterbox;

import java.net.ServerSocket;
import java.io.IOException;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Server {
    public static void main(String[] args) {
        int port = 5000;

        try{
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server is running on port " + port);

            System.out.println("Waiting for a client to connect...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("A client connected");

            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String message = reader.readLine();
            System.out.println("Client says: " + message);
        }
        catch(IOException e){
            System.out.println("Could not start server: " + e.getMessage());

        }
    }
}