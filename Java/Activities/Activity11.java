package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Red");
        hash_map.put(2, "yellow");
        hash_map.put(3, "Talc");
        hash_map.put(4, "Bali Blue");
        hash_map.put(5, "opaline green");

        System.out.println("HashMap values : " + hash_map);

        hash_map.remove(3);
        System.out.println("After removing Talc : " + hash_map);

        if (hash_map.containsValue("Talc")) {
            System.out.println("Talc is still present");
        } else {
            System.out.println("Talc removed successfully");
        }

        System.out.println("Size of the hashMap is : "+ hash_map.size());
    }
}
