import java.util.*;

public class Day4q5 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection of set1 and set2: " + intersection);
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of set1 and set2: " + union);
        int threshold = 3;
        Set<Integer> subset = new HashSet<>();
        for (Integer element : set1) {
            if (element > threshold) {
                subset.add(element);
            }
        }
        System.out.println("Subset of set1 containing elements greater than " + threshold + ": " + subset);
        Integer[] set1Array = set1.toArray(new Integer[0]);
        Integer[] set2Array = set2.toArray(new Integer[0]);
        System.out.println("Elements of set1 as array: " + Arrays.toString(set1Array));
        System.out.println("Elements of set2 as array: " + Arrays.toString(set2Array));
        Set<Integer> retainedSet = new HashSet<>(set1);
        retainedSet.retainAll(set2);
        System.out.println("Elements present in both set1 and set2: " + retainedSet);
    }
}
