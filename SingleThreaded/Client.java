import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public void run() throws Exception {
        int port = 8010;
        InetAddress address = InetAddress.getByName("localhost");

        Socket socket = new Socket(address, port);

        PrintWriter toSocket = new PrintWriter(socket.getOutputStream());
        BufferedReader fromSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        toSocket.println("Hello from the client");
        toSocket.flush(); 

        String line = fromSocket.readLine();
        System.out.println("Response from the socket is: " + line);

        socket.close(); 
    }

    public static void main(String[] args) {
        try {
            Client client = new Client(); // Fixed variable name
            client.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}