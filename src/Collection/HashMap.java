package Collection;
import java.util.*;
public class HashMap {
    public static void main(String[] args) {
        Map map = new java.util.HashMap();
        map.put("1", new Integer(109));
        map.put("2", "Two");
        map.put("3", new Float(59.8));

        Set set = map.keySet(); //���X�Ҧ�Key, �]�ˬ� Set ���A

        Iterator it = set.iterator();
        while(it.hasNext()){
            Object myKey = it.next(); //myKey�s��Q���X��Key
            System.out.println(myKey+"="+map.get(myKey));
            //map.get(); ���Xkey ��������
        }
    }
}
