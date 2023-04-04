import java.util.*;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar; 
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class McDonalds_Menu 
{
    LinkedHashMap<String,String> breakfast=new LinkedHashMap<String,String>();
    ArrayList<Integer> i=new ArrayList<Integer>();
    LinkedHashMap<String,String> not_breakfast=new LinkedHashMap<String,String>();
    ArrayList<Integer> i2=new ArrayList<Integer>();
    CheckingTime ob;
    String a="FINAL BILL";
    String b="DETAILS";
    public McDonalds_Menu()
    {
        input();
    }

    public void input()
    {
        breakfast.put("Hotcake","Wake up with a warm McMuffin,fluffy scrambled eggs,savory hot Halal sausage,and crispy golden hash browns");
        i.add(13);
        breakfast.put("Big Breakfast",
            "Three Golden Brown,Melt in your Mouth hotcakes with a side of real butter and the sweet flavour of maples Syrup");
        i.add(15);
        breakfast.put("Chicken Sausage McMuffin",
            "It is the perfect mix of hot Halal sausage and American cheese between two muffins");
        i.add(10);
        breakfast.put("Eggs & HashBrowns Wrap","It is a combination of Eggs & Hashbrowns wrapped in tortilla bread");
        i.add(12);

        breakfast.put("Eggs & Sausage Wrap","It is a combination of Eggs & Sausages wrapped in tortilla bread");
        i.add(13);

        breakfast.put("Eggs Mcmuffin","It is a combination of Egg cheese and hollandaise sause enclosed between a pair of McMuffins");
        i.add(11);
        breakfast.put(a,b);

        not_breakfast.put("Big Tasty","3 slices of emmental cheese covering the best halal beef patty");
        i2.add(21);
        not_breakfast.put("Grand Chicken Special","Uncover great taste in McDonald's Grand Chicken Special. Enjoy the crispy taste of our Halal chicken patty, combined with juicy tomates, Emmental cheese and a chicken roll.");
        i2.add(21);
        not_breakfast.put("Grand Chicken Spicy","From the first bite of the McDonald's Grand Chicken Spicy, you will uncover a unique taste of tongue-tingling spices. With Cheese, lettuce, tomato and Dujon mustard sauce, calories will be the last thing on your mind.");
        i2.add(20);
        not_breakfast.put("McArabia Chicken","Two delicious pieces of grilled Halal chicken patties with lettuce tomatoes onions and flavored garlic, wrapped together with an Arabic bread.");
        i2.add(19);
        not_breakfast.put("Chicken Mac"," A chicken burger with two halal chicken patties. The Chicken Mac from McDonald's is an absolute piece of art, with its soft bun, creamy mayo, lettuce, and cheese");
        i2.add(18);
        not_breakfast.put("McRoyale","You are in the presence of his majesty, the Royal burger, king of the burgers and ruler of all, McRoyale. Accompanied with his juicy halal beef patty, lettuce and tomatoes.");
        i2.add(29);
        not_breakfast.put("Spicy McChicken","The Spicy McChicken is a perfect combination of spicy breaded Halal chicken patty, with lettuce, mayonnaise and cheddar cheese.");
        i2.add(25);
        not_breakfast.put(a,b);
        ob=new CheckingTime(breakfast,i,not_breakfast,i2,"McDonalds");
    }
}