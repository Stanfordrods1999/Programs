import java.util.*;
import java.net.*;
import java.io.File;
import javax.sound.sampled.*;
import javax.swing.*;
public class Sounds implements Runnable
{
    String s;
    public void Thread_Creation(String s)
    {
        this.s=s;
        Thread ob=new Thread(new Sounds());
        ob.start();
        ob.setName(s);
    }
    public void run()
    {
        try 
        {
            Clip clip=AudioSystem.getClip();
            File file=new File("C:\\Users\\Stanford\\Grpahics\\"+Thread.currentThread().getName()+".wav");
            AudioInputStream inputstream=AudioSystem.getAudioInputStream(file);
            clip.open(inputstream);
            clip.start();
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage()+"\n");
            e.printStackTrace();
        }
    }
}