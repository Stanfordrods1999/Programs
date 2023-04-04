import java.util.*;
public class Linked_List
{
    static Node head;
    public static class Node
    {
        String name,ID;
        int age;
        Node next;
        Node(String name,String ID,int age)
        {
            this.name=name;
            this.ID=ID;
            this.age=age;
            Node next=null;
        }
    }
    public void insert(String name,String ID,int age,int index)
    {
        Node new_Node=new Node(name,ID,age);
        if(Linked_List.head==null)
        {
            head=new_Node;
        }
        else
        {
            Node last=Linked_List.head;
            Node keep;
            int counter=index;
            while(last.next!=null&&counter!=0)
            {
                last=last.next;
                counter--;
            }
            keep=last.next;
            last=new_Node;
            last.next=keep;
        }
    }

}