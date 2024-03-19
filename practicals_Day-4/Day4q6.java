import java.util.*;

public class Day4q6 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Do set1 and set2 contain the same elements? " + set1.equals(set2));
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Set<Integer> hashSet = new HashSet<>(list);
        System.out.println("HashSet from ArrayList: " + hashSet);
        int elementToCheck = 6;
        if (!hashSet.contains(elementToCheck)) {
            hashSet.add(elementToCheck);
        }
        System.out.println("HashSet after checking and appending: " + hashSet);

        // d) Create a clone of elements from the original set and return both hash sets
        Set<Integer> cloneSet = new HashSet<>(hashSet);
        System.out.println("Original HashSet: " + hashSet);
        System.out.println("Clone HashSet: " + cloneSet);
    }
}
