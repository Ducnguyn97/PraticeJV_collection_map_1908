import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("John", 20);
        hashMap.put("Jill", 40);
        hashMap.put("Cook", 50);
        System.out.println("Display entries in HashMap: ");
        System.out.println(hashMap+ "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap+ "\n");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("John", 20);
        linkedHashMap.put("Jill", 40);
        linkedHashMap.put("Cook", 50);
        System.out.println("\nThe age for "+ "Jill is "+ linkedHashMap.get("Jill"));
    }
}
