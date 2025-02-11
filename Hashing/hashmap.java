package Hashing;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        // Inserting the Elements
        map.put(1, "Geeks");
        map.put(2, "For");
        map.put(3, "Geeks");

        // Accessing the Elements
        System.out.println("The Elements are: " + map);
    }
}
