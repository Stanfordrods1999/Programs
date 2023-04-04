import java.io.*;
import java.net.*;
public class EchoSocket
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket server=new ServerSocket(8008);
            while(true)
            {
                Socket incoming = server.accept();
                BufferedReader br =new BufferedReader(new InputStreamReader(incoming.getInputStream()));
                PrintWriter out=new PrintWriter(new OutputStreamWriter(incoming.getOutputStream()));
                out.println("HELLO");
                out.println("ENter BYE to exit");
                out.flush();
                while(true)
                {
                    String str=br.readLine();
                    out.println("ECHO"+str.toUpperCase());
                    out.flush();
                    if(str.trim().equals("BYE"))
                    {
                        break;
                    }
                }
                incoming.close();
            }
        }
            catch(IOException e)
            {
            }
        }
    }
