import java.util.*;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar; 
import javax.swing.*;
import java.awt.*;
public class CheckingTime
{
    LinkedHashMap<String,String> breakfast;
    ArrayList<Integer> price_breakfast;
    LinkedHashMap<String,String> lunch;
    ArrayList<Integer> price_lunch;
    String s;
    Show_Menu ob1;
    public CheckingTime(LinkedHashMap<String,String> ob,ArrayList<Integer> l,LinkedHashMap<String,String> ob1,ArrayList<Integer> l1,String s)
    {
        breakfast=ob;
        price_breakfast=l;
        lunch=ob1;
        price_lunch=l1;
        this.s=s;
        CheckTime();
    }
    public void CheckTime()
    {
        Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("HH");  
        String strDate = dateFormat.format(date);  
        int hour=Integer.parseInt(strDate);
        System.out.println(s);
        /*if(hour>=0&&hour<6)
        {
        JFrame no_frame=new JFrame();
        no_frame.setVisible(true);
        no_frame.setLayout(new FlowLayout());
        ImageIcon ob=new ImageIcon("C:\\Users\\Stanford\\Grpahics\\SORRY_CLOSED.jpg");
        JLabel label=new JLabel(ob);
        no_frame.add(label);
        no_frame.setBounds(000,000,1000,1000);
        }
        else */if(hour>=6&&hour<11)
        {
            ob1=new Show_Menu(price_breakfast,breakfast,s);
        }
        else
        {
            ob1=new Show_Menu(price_lunch,lunch,s);
        }
    }
}