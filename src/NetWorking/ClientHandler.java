package NetWorking;

import java.io.*;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private Socket clientSocket;
    private BufferedReader bufferIn;
    private BufferedWriter bufferOut;

    // Constructor
    public ClientHandler(Socket socket) {
        try {

            this.clientSocket = socket;
            this.bufferIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bufferOut = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }
    }

    private boolean LogIn(){
        boolean res;
        String LoginKey;

        try {
            this.bufferOut.write("Key@\r ");
            this.bufferOut.flush();
            LoginKey = this.bufferIn.readLine();
            res = LoginKey.equals("123");


        } catch (
                IOException e
        ){
            System.out.println(e.getMessage());
            closeConnect();
            res = false;
        }


        return res;
    }

    private void closeConnect(){
        try {
            this.clientSocket.close();
            this.bufferOut.close();
            this.bufferIn.close();
            System.out.println("Close");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void run() {
        if (!LogIn()) {
            closeConnect();
            return;

        }
        try {

            String line;
            while ((line = this.bufferIn.readLine()) != null) {
                // line - get req
                this.bufferOut.write(line);
                this.bufferOut.flush();
            }
        } catch (IOException e) {
            System.out.println(
                    e.getMessage()
            );
        } finally {
            closeConnect();
        }
    }

}