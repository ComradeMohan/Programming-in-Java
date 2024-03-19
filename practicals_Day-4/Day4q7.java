import java.util.Arrays;
import java.util.TreeSet;

public class Day4q7 {
    public static void main(String[] args) {
        TreeSet<Integer> arr1 = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        TreeSet<Integer> arr2 = new TreeSet<>(Arrays.asList(4, 5, 6, 7, 8, 9, 10));
        TreeSet<Integer> difference = new TreeSet<>(arr1);
        difference.removeAll(arr2);
        System.out.println("Difference between arr1 and arr2: " + difference);
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));
        int threshold = 25;
        Integer smallestGreaterThanThreshold = treeSet.higher(threshold);
        System.out.println("Smallest element greater than " + threshold + ": " + smallestGreaterThanThreshold);
        System.out.println("First element removed: " + treeSet.pollFirst());
        System.out.println("Last element removed: " + treeSet.pollLast());
        System.out.println("TreeSet after removing first and last elements: " + treeSet);
        int specificElement = 35;
        Integer floorValue = treeSet.floor(specificElement);
        Integer ceilValue = treeSet.ceiling(specificElement);
        System.out.println("Floor value of " + specificElement + ": " + floorValue);
        System.out.println("Ceil value of " + specificElement + ": " + ceilValue);
    }
}
