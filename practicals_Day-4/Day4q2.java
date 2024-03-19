import java.util.Map;
import java.util.TreeMap;

public class Day4q2 {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Orange", 30);
        treeMap.put("Mango", 40);
        System.out.println("Original TreeMap: " + treeMap);
        Map.Entry<String, Integer> firstEntry = treeMap.pollFirstEntry();
        System.out.println("Removed first entry: " + firstEntry.getKey() + " : " + firstEntry.getValue());
        int n = treeMap.size() - 1;
        for (int i = 0; i < n; i++) {
            Map.Entry<String, Integer> entry = treeMap.pollLastEntry();
            System.out.println("Removed entry: " + entry.getKey() + " : " + entry.getValue());
        }
        TreeMap<String, Integer> emptyTreeMap = new TreeMap<>();
        System.out.println("Empty TreeMap: " + emptyTreeMap);
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Orange", 30);
        treeMap.put("Mango", 40);
        System.out.println("Original TreeMap: " + treeMap);
        TreeMap<String, Integer> subMap = new TreeMap<>(treeMap.subMap("A", true, "D", true));
        System.out.println("SubMap from 'A' to 'D': " + subMap);
        System.out.println("Portion of the map whose keys are strictly less than 'Mango': " + treeMap.headMap("Mango"));
        System.out.println("Portion of the map whose keys are greater than or equal to 'Orange': " + treeMap.tailMap("Orange"));
    }
}
