import java.io.*;
import java.net.*;
public class udpBaseServer
{
    public static void main(String args[])throws IOException
    {
        DatagramSocket ds=new DatagramSocket(1234);
        byte[] recieve=new byte[65535];
        
        DatagramPacket DpRecieve=null;
        while(true)
        {DpRecieve=new DatagramPacket(recieve,recieve.length);
            ds.receive(DpRecieve);
            System.out.println("Client:-"+data(recieve));
            if(data(recieve).toString().equals("bye"))
            {
                System.out.println("Client sent bye");
                break;
            }
            recieve=new byte[65535];
        }
    }
    public static StringBuilder data(byte[] a)
    {
        if(a==null)
        return null;
        StringBuilder ret=new StringBuilder();
        int i=0;
        while(a[i]!=0)
        {
            ret.append((char)a[i]);
            i++;
        }
        return ret;
    }
}
