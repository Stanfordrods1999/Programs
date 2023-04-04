import java.util.*;
public class Quick_Sort
{
    ArrayList<Integer> sort;
    int start,end;
    int pivot;
    int index=0;
    ArrayList<Integer> first=new ArrayList<Integer>();
    ArrayList<Integer> second=new ArrayList<Integer>();
    public Quick_Sort(ArrayList<Integer> ob)
    {
        sort=ob;
        
    }
    public ArrayList<Integer> Sort(ArrayList<Integer> ob)
    {
        start=0;
        end=ob.size()-1;
        pivot=ob.get(index);
        while(start<end)
        {
        while(ob.get(start)<pivot)
        {
            start++;
        }
        while(ob.get(end)>pivot)
        {
            end--;
        }
        if(start<end)
        {
            int temp;
            temp=ob.get(start);
            ob.set(start,ob.get(end));
            ob.set(end,temp);
        }
        else
        {
            int temp;
            temp=ob.get(index);
            ob.set(index,sort.get(end));
            ob.set(end,temp);
        }
        for(int i=0;i<end;i++)
        {
            first.add(ob.get(i));
        }
        for(int j=end;j<ob.size();j++)
        {
            second.add(ob.get(j));
        }
        if(first.size()!=0)
        {
        Sort(first);
    }
    if(second.size()!=0)
    {
        Sort(second);
    }
        first.addAll(second);
    }
    
        return first;
    }
    public static void main(String args[])
    {
        ArrayList<Integer> a=new ArrayList<Integer>();
        int n;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            n=sc.nextInt();
            a.add(n);
        }
        Quick_Sort a1=new Quick_Sort(a);
        a1.Sort(a);
    }
}
