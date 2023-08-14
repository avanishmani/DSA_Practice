package Hashing;

import java.util.concurrent.ConcurrentHashMap;

public class CcHashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        System.out.println("Map size: " + map.size());
        int valueA = map.get("A");
        System.out.println("Value of A: " + valueA);
        map.remove("B");
        System.out.println("Map size: " + map.size());
    }
}
