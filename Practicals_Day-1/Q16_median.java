public class Q16_median {
        public static void main(String[] args) {
            int[] normalOrder = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] reverseOrder = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
            int median = -1; 
            for (int i = 0, j = reverseOrder.length - 1; i < normalOrder.length && j >= 0; i++, j--) {
                if (normalOrder[i] >= reverseOrder[j]) {
                    median = normalOrder[i];
                    break;
                }
            }
            System.out.println("Median at meeting point: " + median);
        }
    }

