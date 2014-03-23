package Collection;

import java.util.*;

public class HashSet {
    public static void main(String[] args) {
        Set set = new java.util.HashSet();
        set.add(new Integer(12));
        set.add(new Long(24L));
        set.add(new Double(5.8));
        set.add("Hello");
        set.add("Hello"); // Duplicate, not add.

        System.out.println("toString()="+set);
        System.out.println("元素個數"+set.size());

        //Collection 子介面 Set 只能用 Iterator 取值
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
