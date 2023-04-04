import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.GregorianCalendar;
public class Show_Menu implements ActionListener
{
    int bill=0;int index=0;
    Sounds ob=new Sounds();
    JFrame frame=new JFrame("MCDONALDS MENU");
    JLabel label1=new JLabel();
    JButton ad=new JButton("+"); 
    JButton subtract=new JButton("-");
    TextArea text=new TextArea();
    JLabel label=new JLabel();
    ArrayList<String> string=new ArrayList<String>();
    ArrayList<Integer> integer=new ArrayList<Integer>();
    ArrayList<Integer> store_price=new ArrayList<Integer>();
    String details[];
    String Menu_McDonalds[]; 
    JComboBox ch;
    int count=0,second_occurance=0;
    String data="";
    int price[];
    int terminate;
    String classname;
    Show_Menu(ArrayList<Integer> ob,LinkedHashMap<String,String> MC_MENU,String classname)
    {
        price=new int[ob.size()+1];
        for(int i=0;i<ob.size();i++)
        {
            price[i]=ob.get(i);
        }
        price[price.length-1]=bill;
        Menu_McDonalds=MC_MENU.keySet().toArray(new String[0]);
        details=MC_MENU.values().toArray(new String[0]);
        ch=new JComboBox(Menu_McDonalds);
        McDonalds_Menu();
        this.classname=classname;
    }

    public void McDonalds_Menu()
    {
        frame.getContentPane().setBackground(Color.black);//Setting BackGround Color
        frame.add(ch);
        frame.add(label);
        ch.addActionListener(this);
        frame.setSize(1000,1000);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
    public void Display()
    {
        for(int a:integer)
        {
            System.out.println(a);
        }
        for(String s:string)
        {
            System.out.println(s);
        }
    }

    public void Mcdonalds_Show_Details(String s[],String data,int price[],String Details[],int termination)
    {
        ImageIcon image;
        text.setEditable(false);
        GregorianCalendar cal=new GregorianCalendar();
        text.setText("-------------WELCOME TO"+classname+"-------------\n---------------------ENOC RETAIL LLC------------\n DUBAI,UAE \n"+cal.getTime());
        ob=new Sounds();
        System.out.println(classname);
        for(int i=0;i<s.length;i++)
        {
            if(s[i].equalsIgnoreCase(data))
            { 
                if(termination==1)
                {
                    ch.removeActionListener(this);
                    frame.remove(ch);
                    String final_Order="";
                    integer.remove(new Integer(0));
                    for(int j=0;j<integer.size();j++)
                    {
                        final_Order+="\n"+string.get(j)+":-"+store_price.get(j)+"Dirhams  (Quantity):-"+integer.get(j)+"\n";
                    }
                    text.appendText(final_Order);
                    text.appendText("SUB-TOTAL BILL:-"+price[price.length-1]);
                    int a=price[price.length-1];
                    double tax=(double)((a*14)/100);
                    double final_price=(double)(a+tax);
                    text.append("\n FINAL BILL(Tax Inclusive):-"+final_price);
                    text.appendText("\n-------------THANK YOU FOR CHOOSING"+classname+"-------------");
                    frame.add(text);
                    ob.Thread_Creation("Thank"+classname);
                    break;
                }

                String detail="Details are \n"+Details[i]+"\n Price:-"+price[i]+"AED";
                text.setText(detail);
                frame.add(text);
                image=new ImageIcon("C:\\Users\\Stanford\\Grpahics\\"+Menu_McDonalds[i]+".jpg");
                ob.Thread_Creation(Menu_McDonalds[i]);
                label1=new JLabel(image);
                frame.add(ad);
                frame.add(subtract);
                index=i;
                ad.addActionListener(this);
                subtract.addActionListener(this);
                frame.add(label1);
                string.add(data);
                store_price.add(price[index]);
            } 
        }
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==ch)
        {
            if(second_occurance!=0)
            {
                integer.add(this.count);
                this.count=0;
            }
            second_occurance++;
            frame.remove(text);
            frame.remove(label1);
            frame.remove(ad);
            frame.remove(subtract);
            frame.revalidate();
            frame.repaint();
            data=""+ch.getItemAt(ch.getSelectedIndex());
            ad.removeActionListener(this);
            subtract.removeActionListener(this);
            if(data.equals("FINAL BILL"))
            {
                terminate=1;
                Mcdonalds_Show_Details(Menu_McDonalds,data,price,details,terminate);
            }
            else
            {
                Mcdonalds_Show_Details(Menu_McDonalds,data,price,details,terminate);
                label.setText(data);
            }
        }
        else if(e.getSource()==ad)
        {
            price[price.length-1]+=price[index];
            this.count++;
        }
        else if(e.getSource()==subtract)
        {
            price[price.length-1]-=price[index];
            this.count--;
        }

    }
}