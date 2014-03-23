package Collection;

import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List list = new java.util.ArrayList();
        list.add(new Integer(15));
        list.add(new Long(59L));
        list.add(new Double(58.1));
        list.add("Hello");
        list.add("Hello"); // Duplicate, is added.

        System.out.println("toString()="+list);
        System.out.println("¤¸¯À­Ó¼Æ"+list.size());

        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
