public class Ret
{
    public static String getUserName(String firstName,String lastName)
    {
        firstName=firstletterUppercase(firstName);
        lastName=firstletterUppercase(lastName);
        String s=lastName+","+firstName;
        return s;
    }
    public static String firstletterUppercase(String c)
    {
        char ch[]=c.toCharArray();
        ch[0]=Character.toUpperCase(ch[0]);
        c=c.valueOf(ch);
        return c;
    }
}   