package mobi.clinic.admin.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static String petientID = "";


    public static void main(String[] args) throws IOException {

        // Initialize user input.
        Scanner sc = new Scanner(System.in);
//        Gson gson = new Gson(); // Much better than JSON, easy to handle and automatic mapping of objects than manually with JSON


        try (Socket socket = new Socket("localhost", 3000);
             PrintStream out = new PrintStream(socket.getOutputStream());
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            System.out.println("Connected to the server...");

            System.out.println("Enter request: ");
            String request = in.readLine();
            out.println(request);

            String response = in.readLine();
            System.out.println("Server response: " + response);
            // Handling user input via threading since I'll be having multiple users
//             Thread userThread = new Thread();
//             userThread.start();

//            userThread.interrupt();
        } catch (IOException e) {
            if (e instanceof ConnectException) {
                System.out.println("No Server found... ");
            } else {
                e.printStackTrace();
            }
        }
    }
}
