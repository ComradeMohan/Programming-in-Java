import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Day4q1 {
    public static void main(String[] args) {
        // a) Create two hash maps and remove keys starting with "B"
        HashMap<String, Integer> super1 = new HashMap<>();
        super1.put("Apple", 10);
        super1.put("Banana", 20);
        super1.put("Orange", 30);
        HashMap<String, Integer> super2 = new HashMap<>();
        super2.put("Berry", 40);
        super2.put("Broccoli", 50);
        super2.put("Carrot", 60);
        removeKeysStartingWithB(super1);
        removeKeysStartingWithB(super2);
        System.out.println("super1 after removing keys starting with 'B': " + super1);
        System.out.println("super2 after removing keys starting with 'B': " + super2);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 5);
        map.put("B", 10);
        map.put("C", 15);
        map.put("D", 20);
        map.put("E", 25);
        displayKeysWhenValueIsProductWith10(map);
        iterateOverEntries(map);
        mergeAndDisplay(map);
    }
    private static void removeKeysStartingWithB(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getKey().startsWith("B")) {
                iterator.remove();
            }
        }
    }
    private static void displayKeysWhenValueIsProductWith10(HashMap<String, Integer> map) {
        System.out.println("Keys whose value is a product with 10:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 10 == 0) {
                System.out.println(entry.getKey());
            }
        }
    }
    private static void iterateOverEntries(HashMap<String, Integer> map) {
        System.out.println("Iterating over entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
    private static void mergeAndDisplay(HashMap<String, Integer> map) {
        map.merge("C", 100, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("Merged map with key 'C': " + map);
    }
}