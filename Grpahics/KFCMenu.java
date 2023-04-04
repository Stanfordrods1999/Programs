import java.util.*;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar; 
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class KFCMenu
{
    LinkedHashMap<String,String> breakfast=new LinkedHashMap<String,String>();
    ArrayList<Integer> i=new ArrayList<Integer>();
    LinkedHashMap<String,String> not_breakfast=new LinkedHashMap<String,String>();
    ArrayList<Integer> i2=new ArrayList<Integer>();
    CheckingTime ob;
    String a="FINAL BILL";
    String b="DETAILS";
    public KFCMenu()
    {
        input();
    }

    public void input()
    {
        breakfast.put("Zinger Riser","Spicy Zinger fillet topped with a delicious sunny side-up in a freshly toasted sesame seed bun");
        i.add(13);
        breakfast.put("Zinger Porridge","Warm porridge with crunchy Zinger chunks, crispy shallots and sesame oil.");
        i.add(15);
        breakfast.put("Egg Riser",
            "Freshly cracked sunny side-up with a crispy chicken strip, topped with creamy mayonnaise and spicy Jalapeno cheese sauce.");
        i.add(10);
        breakfast.put("Twister Lite","Crunchy Zinger fillet, succulent sliced tomatoes and fluffy scrambled eggs wrapped in a warm tortilla.");
        i.add(12);

        breakfast.put("Classic Rice","Original Recipe chicken with aromatic Colonel Rice and a spicy kick of sambal on the side.");
        i.add(13);

        breakfast.put("Eggs Muffin","It is a combination of Egg cheese and hollandaise sause enclosed between a pair of McMuffins");
        i.add(11);
        breakfast.put(a,b);

        not_breakfast.put("SNACKER BOX","1 piece of chicken, cheezy wedges, fries, drink");
        i2.add(21);
        not_breakfast.put("TWISTER BOX","1 piece of chicken, wrap, fries, drink.");
        i2.add(21);
        not_breakfast.put("HOT & CHEEZY 3-PC COMBO","3 pieces of Hot & Cheezy, whipped potato, coleslaw, drink.");
        i2.add(20);
        not_breakfast.put("POPCORN CHICKEN COMBO","Popcorn chicken, fries, drink.");
        i2.add(19);
        not_breakfast.put("ZINGER BURGER COMBO"," A chicken burger with two halal chicken patties. The Chicken Mac from McDonald's is an absolute piece of art, with its soft bun, creamy mayo, lettuce, and cheese");
        i2.add(18);
        not_breakfast.put("COLONEL BURGER COMBO","You are in the presence of his majesty, the Royal burger, king of the burgers and ruler of all, McRoyale. Accompanied with his juicy halal beef patty, lettuce and tomatoes.");
        i2.add(29);
        not_breakfast.put("SPICY GRILLED CHICKEN","The Spicy McChicken is a perfect combination of spicy breaded Halal chicken patty, with lettuce, mayonnaise and cheddar cheese.");
        i2.add(25);
        not_breakfast.put(a,b);
        ob=new CheckingTime(breakfast,i,not_breakfast,i2,"KFC");
    }
}