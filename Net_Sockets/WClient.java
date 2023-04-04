import java.io.*;
import java.net.*;
public class WClient
{
    public static void main(String args[])
    {
        if(args.length<2)
        {
            System.out.println("Usage WClient<server><path>");
            System.exit(0);
        }
        String server= args[0];
        String path=args[1];
        System.out.println("Loading contents of URL:"+server);
        try
        {
            Socket socket=new Socket(server,80);
            PrintStream out=new PrintStream(socket.getOutputStream());
            BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out.println("GET"+path+"HTTTP\1.0");
            out.println();

            String line=in.readLine();
            while(line!=null)
            {
                System.out.println(line);
                line=in.readLine();
            }
            in.close();
            out.close();
            socket.close();
        }
        catch(Exception e)
        {

        }
    }
}