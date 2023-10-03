package NetWorking;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class SetlikaServer {
    private ServerSocket server;
    private boolean WorkServer = true;
    public void StartServer(int port) {
        try {
            server = new ServerSocket(port);
            while (this.WorkServer) {
                Socket client = server.accept();
                System.out.println("New client connected " + client.getInetAddress().getHostAddress());
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

    public void StopServer(){
        this.WorkServer = false;
    }

}




