package dataStructure.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("a", 1);
        hm.put("b", 2);
        hm.put("c", 3);
        hm.put("d", 4);
        hm.put("e", 5);
        hm.put("f", 6);

        int ans = hm.get("a");
        System.out.println(ans);
        hm.remove("c");
        hm.remove("d");
        hm.put("c", 61);

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
