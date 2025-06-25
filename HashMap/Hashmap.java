package HashMap;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hashmap = new HashMap<>();

        hashmap.put("apple", 5);
        hashmap.put("orange", 8);
        hashmap.put("banana", 7);
        hashmap.put("coconut", 10);

        
        // System.err.println(hashmap.containsValue((int)7.7896));

        // System.out.println(hashmap.get("coconut"));

        // System.out.println(hashmap.size());

        // System.out.println(hashmap.keySet());
        // System.out.println(hashmap.values());

        for (String key : hashmap.keySet()) {
            System.out.println(key + ":"+ hashmap.get(key));
        }



        
    }
}
