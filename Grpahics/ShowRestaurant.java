import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ShowRestaurant implements ItemListener
{
    JFrame frame = new JFrame();
    ImageIcon icon = new ImageIcon("C:\\Users\\Stanford\\Grpahics\\KFCLOGO.jpg");
    JLabel label1= new JLabel(icon);
    ImageIcon MC_icon=new ImageIcon("C:\\Users\\Stanford\\Grpahics\\Mcdonalds1.jpg");
    JLabel MC_LABEL=new JLabel(MC_icon);
    JCheckBox check=new JCheckBox("KFC");
    JCheckBox check_mcdonalds=new JCheckBox("McDonalds");
    McDonalds_Menu ob;
    KFCMenu ob1;
    Sounds ob2=new Sounds();
    public void menu() 
    {
        frame.add(label1);
        frame.add(MC_LABEL);
        frame.add(check_mcdonalds);
        check.addItemListener(this);
        check_mcdonalds.addItemListener(this);
        frame.add(check);
        final JLabel label=new JLabel();
        final JLabel Mc_Label=new JLabel();
        frame.add(label);
        frame.add(Mc_Label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(15000,15000);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(new GridBagLayout());
        frame.setVisible(true);
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource()==check_mcdonalds)
        {
            ob2.Thread_Creation("WelcomeToMcDonalds");
            ob=new McDonalds_Menu();
            frame.dispose();
        }
        else if(e.getSource()==check)
        {
            ob2.Thread_Creation("WelcomeToKFC");
            ob1=new KFCMenu();
            frame.dispose();
        }
        else
        {
        }
    }
    public static void main(String args[])
    {
        ShowRestaurant ob=new ShowRestaurant();
        ob.menu();
    }
}
