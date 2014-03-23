package Collection;
import java.util.*;
public class HashMap {
    public static void main(String[] args) {
        Map map = new java.util.HashMap();
        map.put("1", new Integer(109));
        map.put("2", "Two");
        map.put("3", new Float(59.8));

        Set set = map.keySet(); //取出所有Key, 包裝為 Set 型態

        Iterator it = set.iterator();
        while(it.hasNext()){
            Object myKey = it.next(); //myKey存放被取出的Key
            System.out.println(myKey+"="+map.get(myKey));
            //map.get(); 取出key 對應的值
        }
    }
}
