package dataStructure.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
 
    public static void main(String[] args) {
        Map<String, Integer> tm = new TreeMap<>();
        tm.put("A", 1);
        tm.put("B", 2);
        tm.put("C", 3);
        tm.put("D", 4);
        tm.put("E", 5);
        int ans = tm.get("A");
        System.out.println(ans);
        tm.remove("C");
        tm.remove("D");
        tm.put("C", 6);
        for (Map.Entry<String, Integer> entry : tm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        tm.clear();
        for (Map.Entry<String, Integer> entry : tm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
