package Advance.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class MapEx {
    public static void main(String[] args) {
        Map<String,Integer> users = new HashMap<>();
        users.put("Alice", 30);
        users.put("Bob", 25);
        users.put("Charlie", 35);

//        users.remove("Alice");

        System.out.println(users.get("Bob"));

        System.out.println(users.containsKey("Bob"));

        System.out.println(users);

        for(String k:users.keySet()){
            System.out.println(k+" : "+users.get(k));
        }

//        System.out.println(users);
    }
}
