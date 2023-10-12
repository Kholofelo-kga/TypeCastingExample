import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapsExample {
    public static void main(String[] args) {
        // HashMap example
        Map<String, Integer> hashMap = new HashMap<>();
		
        hashMap.put("Kholo", 25);
        hashMap.put("Kay", 30);
        hashMap.put("Mpho", 22);
        System.out.println("HashMap: " + hashMap);

        // TreeMap example
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Kholo", 25);
        treeMap.put("Kay", 30);
        treeMap.put("Mpho", 22);
        System.out.println("TreeMap: " + treeMap);
    }
}
public class Main {
    public static void main(String[] args) {
		
        MapsExample.main(args);
    }
}
