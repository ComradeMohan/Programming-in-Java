import java.util.Arrays;
import java.util.Scanner;

public class Q8_Equal_Mtarix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size1 : ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements for array1:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }
        System.out.print("Enter size2 : ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements for array2:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("\nBefore equalization:");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        if (array1.length != array2.length) {
            // Make them equal according to the smallest array length
            int minSize = Math.min(array1.length, array2.length);
            if (array1.length > minSize) {
                array1 = Arrays.copyOf(array1, minSize);
            } else {
                array2 = Arrays.copyOf(array2, minSize);
            }
        }
        System.out.println("\nAfter equalization:");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
    }
}