public class Q20_ArrayShift {
        public static void main(String[] args) {
            int[] A = {1, 2, 3, 4, 5};
            int[] B = {6, 7, 8, 9, 10};
            int shiftAmount = A[0] > B[0] ? 1 : -1;
            for (int i = 0; i < A.length; i++) {
                if (i + shiftAmount >= 0 && i + shiftAmount < A.length) {
                    A[i] = A[i + shiftAmount];
                }
            }
            for (int i = B.length - 1; i >= 0; i--) {
                if (i + shiftAmount >= 0 && i + shiftAmount < B.length) {
                    B[i + shiftAmount] = B[i];
                }
            }
            System.out.println("Shifted array A:");
            for (int i = 0; i < A.length; i++) {
                System.out.print(A[i] + " ");
            }

            System.out.println("\nShifted array B:");
            for (int i = 0; i < B.length; i++) {
                System.out.print(B[i] + " ");
            }
        }
    }

