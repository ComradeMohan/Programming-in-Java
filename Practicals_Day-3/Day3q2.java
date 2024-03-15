import java.util.Arrays;
public class Day3q2 {
    public static void main(String[] args) {
        int a[] = {2, 4, 5, 6, 7, 8};
        try {
            for (int i = 0; i <= 6; i++) {
                System.out.println(a[i]);
            }
        } catch (Exception e) {
            System.out.println(" your exception found " + e);
        }
        int b[] = {2, 3, 4, 5, 6};
        try {
            for (int i = 0; i <= b.length; i++) {
                System.out.println(b[i]);
            }
        } catch (Exception e) {
            System.out.println("yours EXception found " + e);
        }
        try {
            int c[][] = {{1, 2}, {3, 4, 5}};
            System.out.println("result: " + c[1][2]);
        } catch (Exception e) {
            System.out.println("Entered exception here" + e);
        }
        try {
            int[] arr4 = {1, 2, 3};
            methodWithArray(arr4, 4);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception occurred: " + e.getMessage());
        }
    }

    public static void methodWithArray(int[] arr, int index) {
        System.out.println("Element at index " + index + ": " + arr[index]);
    }
    }
