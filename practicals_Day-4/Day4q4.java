import java.util.SortedMap;
import java.util.TreeMap;
import java.lang.Integer;


public class Day4q4 {
    public static void main(String[] args) {
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(1, "One");
        sortedMap.put(2, "Two");
        sortedMap.put(3, "Three");
        sortedMap.put(4, "Four");
        sortedMap.put(5, "Five");
        sortedMap.put(6, "Six");
        System.out.println("Original sorted map: " + sortedMap);
        SortedMap<Integer, String> subMap = sortedMap.headMap(sortedMap.size() - 2);
        System.out.println("Sub map with n-2 keys: " + subMap);
        System.out.println("Size of sorted map after getting n-2 keys: " + sortedMap.size());
        SortedMap<Integer, String> inclusiveSubMap = sortedMap.subMap(2, 5);
        SortedMap<Integer, String> exclusiveSubMap = sortedMap.subMap(2, 5);
        System.out.println("Inclusive sub map: " + inclusiveSubMap);
        System.out.println("Exclusive sub map: " + exclusiveSubMap);
        System.out.println("First entry removed: " + sortedMap.pollFirstEntry());
        System.out.println("Last entry removed: " + sortedMap.pollLastEntry());
        System.out.println("Sorted map after removing first and last entries: " + sortedMap);
   for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                sortedMap.put(i, "Armstrong");
            }
        }
        System.out.println("Sorted map with Armstrong numbers: " + sortedMap);
    }
    private static boolean isArmstrong(int num) {
        int originalNumber, remainder, result = 0;
        originalNumber = num;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        return result == num;
    }
}
