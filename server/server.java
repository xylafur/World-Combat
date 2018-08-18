/*  This is the main startup file for the world combat game, it will initialize
 *  the server to start accepting client connections
 *
 */
import java.io.*;
import java.net.*;

class Server {
    public DataInputStream getDataInputStream(int port) throws IOException {
        ServerSocket ss = new ServerSocket(port);
        Socket s = ss.accept(); //establishes connection
        DataInputStream dis = new DataInputStream(s.getInputStream());
        return dis;
    }

    public void readFromClient(DataInputStream dis) throws IOException {
        String str = (String)dis.readUTF();
        System.out.println(str);
    }

}

class Main {
    public static void main(String args []){
        try {
            Server server = new Server();
            DataInputStream dis = server.getDataInputStream(6666);
            server.readFromClient(dis);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
