import java.util.Arrays;
public class Q6_confusion_matrix {
    public static void main(String[] args) {
        int[] actualValues = {1, 0, 1, 1, 0, 1, 0, 0, 1, 1};
        int[] predictedValues = {1, 1, 1, 1, 0, 0, 0, 1, 0, 1};
        int TP = 0, TN = 0, FP = 0, FN = 0;
        for (int i = 0; i < actualValues.length; i++) {
            if (actualValues[i] == 1 && predictedValues[i] == 1) {
                TP++;
            } else if (actualValues[i] == 0 && predictedValues[i] == 0) {
                TN++;
            } else if (actualValues[i] == 0 && predictedValues[i] == 1) {
                FP++;
            } else if (actualValues[i] == 1 && predictedValues[i] == 0) {
                FN++;
            }
        }
        double precision = (double) TP / (TP + FP);
        double recall = (double) TP / (TP + FN);
        double f1Score = 2 * (precision * recall) / (precision + recall);
        System.out.println("Confusion Matrix:");
        System.out.println("TP: " + TP);
        System.out.println("TN: " + TN);
        System.out.println("FP: " + FP);
        System.out.println("FN: " + FN);
        System.out.println("F1-Score: " + f1Score);
    }
}