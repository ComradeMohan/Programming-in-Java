import java.util.*;

public class Day4q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> evenList = new ArrayList<>();
        for (int i = 2; i <= 10; i += 2) {
            evenList.add(i);
        }
        System.out.println("Original Even List: " + evenList);
        evenList.remove(evenList.size() - 1);
        System.out.println("Even List after removing last element: " + evenList);
        List<String> arrayList = new ArrayList<>();
        System.out.print("Enter input for ArrayList (space-separated): ");
        String[] arrayInput = scanner.nextLine().split(" ");
        for (String item : arrayInput) {
            arrayList.add(item);
        }
        System.out.println("ArrayList: " + arrayList);
        System.out.print("Enter index to remove element from ArrayList: ");
        int indexToRemove = scanner.nextInt();
        if (indexToRemove >= 0 && indexToRemove < arrayList.size()) {
            arrayList.remove(indexToRemove);
            System.out.println("ArrayList after removing element at index " + indexToRemove + ": " + arrayList);
        } else {
            System.out.println("Invalid index.");
        }
        scanner.nextLine();
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.print("Enter input for LinkedList (space-separated): ");
        String[] linkedListInput = scanner.nextLine().split(" ");
        for (String item : linkedListInput) {
            linkedList.add(item);
        }
        System.out.println("Original LinkedList: " + linkedList);
        Collections.reverse(linkedList);
        System.out.println("Reversed LinkedList: " + linkedList);
        Vector<Character> vector = new Vector<>();
        System.out.print("Enter input for Vector (characters separated by space): ");
        String vectorInput = scanner.nextLine();
        for (char c : vectorInput.toCharArray()) {
            vector.add(c);
        }
        StringBuilder vectorOutput = new StringBuilder();
        for (Character character : vector) {
            vectorOutput.append(character);
        }
        System.out.println("Output from Vector: " + vectorOutput);

        scanner.close();
    }
}
