package NetWorking;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class SetlikaServer {
    private ServerSocket server;
    public void StartServer(int port) {
        try {

            // server is listening on port 1234
            server = new ServerSocket(port);
            while (true) {
                Socket client = server.accept();
                System.out.println("New client connected "
                        + client.getInetAddress()
                        .getHostAddress());
                ClientHandler clientSock = new ClientHandler(client);
                new Thread(clientSock).start();
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (server != null) {
                try {
                    server.close();
                }
                catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}




