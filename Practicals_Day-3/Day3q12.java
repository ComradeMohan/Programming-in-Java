class MatrixThread extends Thread {
    private int[][] matrix;
    private int totalElements;
    public MatrixThread(String name, int[][] matrix) {
        super(name);
        this.matrix = matrix;
    }
    public void run() {
        totalElements = countElements(matrix);
        System.out.println(getName() + " finished counting elements.");
    }
    public int getTotalElements() {
        return totalElements;
    }
    private int countElements(int[][] matrix) {
        int count = 0;
        for (int[] row : matrix) {
            count += row.length;
        }
        return count;
    }
}
class MatrixAdditionThread extends Thread {
    private int[][] matrix1;
    private int[][] matrix2;
    private int[][] result;

    public MatrixAdditionThread(String name, int[][] matrix1, int[][] matrix2) {
        super(name);
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.result = new int[matrix1.length][matrix1[0].length];
    }
    public void run() {
        System.out.println(getName() + " started...");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println(getName() + " finished matrix addition.");
        printMatrix(result);
    }
    private void printMatrix(int[][] matrix) {
        System.out.println("Resultant Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
public class Day3q12 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        MatrixThread t1 = new MatrixThread("Thread T1", matrix1);
        MatrixThread t2 = new MatrixThread("Thread T2", matrix2);
        MatrixThread t4 = new MatrixThread("Thread T4", matrix1);
        t1.start();
        t2.start();
        t4.start();
        try {
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (t1.getTotalElements() == t2.getTotalElements()) {
            MatrixAdditionThread t3 = new MatrixAdditionThread("Thread T3", matrix1, matrix2);
            t3.start();
        } else {
            System.out.println("Total elements in matrices are not equal. Matrix addition cannot be performed.");
        }
    }
}
