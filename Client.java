import java.io.*;
import java.net.*;
public class Client {
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;

    public Client(String address, int port){
        try{
            socket = new Socket(address, port);
            System.out.println("Connected");
            input = new DataInputStream(System.in);
            out = new DataOutputStream(socket.getOutputStream());
        }
        catch(UnknownHostException u){
            System.out.println(u);
            return;
        }
        catch(IOException i){
            System.out.println(i);
            return;
        }
        String line = "";
        while(!line.equals("quit")){
            try{
                line = input.readLine();
                out.writeUTF(line);
            }
            catch(IOException i){
                System.out.println(i);
            }
        }
        try{
            input.close();
            out.close();
            socket.close();
        }
        catch(IOException i){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        Client client = new Client("127.0.1.0", 1000);
        
    }
}
