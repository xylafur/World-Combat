import java.io.*;
import java.net.*;


class Client {
    public void writeToServer(String ip, int port, String message) throws IOException {
        Socket s = new Socket(ip, port);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF(message);
        dout.flush();
        dout.close();
        s.close();
    }
}

class Main {
    public static void main(String args []){
        Client client = new Client();

        try{
            client.writeToServer("localhost", 6666, "Hello Server!");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
