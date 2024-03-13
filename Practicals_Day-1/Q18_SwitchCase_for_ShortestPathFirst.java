public class Q18_SwitchCase_for_ShortestPathFirst {
        public static void main(String[] args) {
            int[] loop1 = {1, 2, 3, 4, 5};
            int[] loop2 = {10, 20, 30, 40, 50, 60};
            int loop1Iterations = loop1.length;
            int loop2Iterations = loop2.length;
            switch (Integer.compare(loop1Iterations, loop2Iterations)) {
                case -1:
                    System.out.println("Loop 1 is the shortest path.");
                    break;
                case 0:
                    System.out.println("Both loops have the same number of iterations.");
                    break;
                case 1:
                    System.out.println("Loop 2 is the shortest path.");
                    break;
            }
        }
    }

