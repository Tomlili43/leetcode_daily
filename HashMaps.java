import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("AaAaAa", 1);
        map.put("AaAaBB", 2);
        map.put("AaBBAa", 3);
        map.put("AaBBBB", 4);
        map.put("BBBBAa", 5); 
        System.out.println(map); // 1
        // mock hashmap collision
        
    }
}
