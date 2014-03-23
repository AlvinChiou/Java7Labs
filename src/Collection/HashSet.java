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
        System.out.println("�����Ӽ�"+set.size());

        //Collection �l���� Set �u��� Iterator ����
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
