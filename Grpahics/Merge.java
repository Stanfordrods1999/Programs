import java.util.*;
import java.io.*;
public class Merge 
{
    ArrayList<String> ob=new ArrayList<String>();
    ArrayList<String> ob1=new ArrayList<String>();
    String s[];
    public Merge()throws IOException
    {
        File file=new File("C:\\Users\\Stanford\\Downloads\\Test.txt");
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null)
        {
            s=line.split(",");
            ob.add(s[0]);
            ob1.add((s[1]+s[2]+s[3]).trim());
        }
    }
}