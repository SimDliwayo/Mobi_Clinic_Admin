package mobi.clinic.admin.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

//    public static List<Socket> sockets = new ArrayList<>();



    public static void main(String[] args) {
        int port = 3000;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            while (true) {
                try (Socket socket = serverSocket.accept();
                     BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                     PrintWriter output = new PrintWriter(socket.getOutputStream(), true)) {

                    System.out.println("Client connected");

                    String request = input.readLine();
                    System.out.println("Received: " + request);

                    String response = handleRequest(request);

                    output.println(response);
                    System.out.println("Response sent: " + response);


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String handleRequest(String request) {

        if (request.equals("GET_DOCTORS")) {
            return "Doctor YOU, Doctor ME";
        }
        return "Unknown request";
    }
}
