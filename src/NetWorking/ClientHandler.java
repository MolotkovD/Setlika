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
        String Login, Password;

        try {
            this.bufferOut.write("Login@: ");
            this.bufferOut.flush();
            Login = this.bufferIn.readLine();
            this.bufferOut.write("Password@: ");
            this.bufferOut.flush();
            Password = this.bufferIn.readLine();
            res = Login.equals(Password);

        } catch (
                IOException e
        ){
            System.out.println(e.getMessage());
            res = false;
        }


        return res;
    }

    private void closeConnect(){
        try {
            this.clientSocket.close();
            this.bufferOut.close();
            this.bufferIn.close();
            System.out.println(
                    "Close"
            );
        }catch (IOException e){
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