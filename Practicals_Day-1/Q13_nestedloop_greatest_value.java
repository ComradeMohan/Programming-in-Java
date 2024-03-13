public class Q13_nestedloop_greatest_value {
        public static void main(String[] args) {
            int[] loop1 = {10, 20, 30};
            int[] loop2 = {15, 25, 35};

            int maxLoop1 = Integer.MIN_VALUE;
            int maxLoop2 = Integer.MIN_VALUE;

            // Find the maximum value in loop1
            for (int num : loop1) {
                if (num > maxLoop1) {
                    maxLoop1 = num;
                }
            }

            // Find the maximum value in loop2
            for (int num : loop2) {
                if (num > maxLoop2) {
                    maxLoop2 = num;
                }
            }

            // Compare the maximum values
            if (maxLoop1 > maxLoop2) {
                System.out.println("Loop 1 contains the greatest value: " + maxLoop1);
            } else if (maxLoop1 < maxLoop2) {
                System.out.println("Loop 2 contains the greatest value: " + maxLoop2);
            } else {
                System.out.println("Both loops contain the same greatest value: " + maxLoop1);
            }
        }
    }
