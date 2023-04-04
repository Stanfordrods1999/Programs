import java.net.*;
import java.io.*;
public class Server extends Thread
{
    private ServerSocket server;
    public Server(int port)throws IOException 
    {
        server=new ServerSocket(port);
    }

    public void run()
    {
        while(true)
        {
            try
            {
                System.out.println("Waiting for Client on port"+server.getLocalPort()+">>>>");
                Socket ser=server.accept();
                System.out.println("Connected to" +ser.getRemoteSocketAddress());
                DataInputStream in=new DataInputStream(ser.getInputStream());
                
                System.out.println(in.readUTF());
                DataOutputStream out= new DataOutputStream(ser.getOutputStream());;
                out.writeUTF("Thank you"+ ser.getLocalSocketAddress()+"SDFAF");
                server.close();
            }
            catch(SocketTimeoutException s)
            {
                
            }
            catch(IOException e)
            {
                
            }
        }
    }
    public static void main(String args[])
    {
        int port = Integer.parseInt(args[0]);
        try
        {
            Thread t= new Server(port);
            t.start();
        }
        catch(IOException e)
        {
        }
        }
    }
