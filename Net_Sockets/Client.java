import java.net.*;
import java.io.*;
public class Client extends Thread 
{
    public static void main(String args[])
    {
        String servername= "6060";
        int port = 6061;
        try
        {
            System.out.println("Connecting to"+servername+"on port" +port);
            Socket client= new Socket(servername,port);
            
            System.out.println("Just connected to " +client.getRemoteSocketAddress());
            OutputStream outserver=client.getOutputStream();
            DataOutputStream out= new DataOutputStream(outserver);
            
            out.writeUTF("Hello from"+client.getLocalSocketAddress());
            InputStream infromserver=client.getInputStream();
            DataInputStream in= new DataInputStream(infromserver);
            client.close();
        }
        catch(IOException e)
        {
            
        }
    }
}