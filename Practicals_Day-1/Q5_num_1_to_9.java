public class Q5_num_1_to_9{
    public static void main(String[] args) {
        int size = 3;
        int[][] matrixA = new int[size][size];
        System.out.println("Matrix A:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrixA[i][j] = i * size + j + 1;
                System.out.printf("%-5d", matrixA[i][j]);
            }
            System.out.println();
        }
        int[][] matrixB = new int[size][size];
        System.out.println("\nMatrix B:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrixB[i][j] = size * (size - i) - j;
                System.out.printf("%-5d", matrixB[i][j]);
            }
            System.out.println();
        }
    }
}