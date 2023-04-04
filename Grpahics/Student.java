import java.util.*;
import java.io.*;
public class Student extends Merge
{
    String str,str1;
    public Student(String str,String s)throws IOException
    {
        this.str=str;
        str1=s;
    }
    ArrayList<Student> st=new ArrayList<Student>();
    public void Create()throws IOException
    {
        for(int i=0;i<ob.size();i++)
        {
            st.add(new Student(ob.get(i),ob1.get(i)));
        }
    }
    public ArrayList<Student> merger(ArrayList<Student> arr)
    {
        if(arr.size()==1)
        {
            return arr;
        }
        ArrayList<Student> left=new ArrayList<Student>();
        ArrayList<Student> right=new ArrayList<Student>();
        int mid=arr.size()/2;
        for(int i=0;i<mid;i++)
        {
            left.add(arr.get(i));
        }
        for(int i=mid;i<arr.size();i++)
        {
            right.add(arr.get(i));
        }
        left=merger(left);
        right=merger(right);
        arr=merge(left,right);
        return arr;
    }
    public ArrayList<Student> merge(ArrayList<Student> left,ArrayList<Student> right)
    {
}