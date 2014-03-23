package Collection;
import java.util.*;
import java.util.Hashtable;
public class HashTable {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("one", new Integer(1));
        ht.put("two", new Float(580.49));
        ht.put("three", "3");

        Integer one = (Integer)ht.get("one");
        Float two = (Float)ht.get("two");
        String three = ht.get("three").toString();

        System.out.println(one+",hashcode="+one.hashCode());
        System.out.println(two+",hashcode="+two.hashCode());
        System.out.println(three+"is String Type ,hashcode="+three.hashCode());

    }
}
