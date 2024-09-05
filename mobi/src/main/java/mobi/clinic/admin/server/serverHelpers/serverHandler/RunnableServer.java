package mobi.clinic.admin.server.serverHelpers.serverHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;

public class RunnableServer implements Runnable{

    public static int PORT;
    public final BufferedReader in;
    public final PrintStream out;
//    Gson gson = new Gson();
    public static ArrayList<String> petientIDs = new ArrayList<>();
    public Socket socket;


    public RunnableServer(Socket socket) throws IOException {
        this.socket = socket;
        out = new PrintStream(socket.getOutputStream());
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }
    /**
     * Runs this operation.
     */
    @Override
    public void run() {

    }
}
