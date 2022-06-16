package collectionsdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {

        Map m = new HashMap();
        m.put("age", 34);
        m.put(45, 200);
        m.put("marks", 12);
        m.put("phone", 12345);

        System.out.println(m);
        System.out.println(m.get("age"));

        Set entries = (m.entrySet());
        System.out.println(entries);

        for(Object e : entries) {
            Map.Entry entry = (Map.Entry) e;
            String key = (String) entry.getKey();
            int value = (Integer) entry.getValue();
            System.out.println("KEY " + key + "\tVALUE " + value);
        }
    }
}
