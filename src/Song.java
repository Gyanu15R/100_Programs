import java.util.HashMap;
import java.util.Iterator;

public class Song {

    static HashMap<String, Integer> contact=new HashMap<String, Integer>();
    public static void main(String[] args)
    {
        contact.put("Sachin", 356);
        contact.put("Lucky", 386);
        contact.put("Arun", 376);
        contact.put("Vaibhav", 326);
        //System.out.println(contact.get("Vaibhav"));
        //contact.remove("Sachin");
        //System.out.println(contact);
        Iterator<String> Sohan=contact.keySet().iterator();
        while(Sohan.hasNext())
        {
           // System.out.println(Sohan.next());
            String y=Sohan.next();

            System.out.println(contact.get(y));
        }
    }
}
