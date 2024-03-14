public class GenericMethodExample {
public static <T extends Comparable<T>> boolean isEqual(T value1, T value2) {
            return value1.compareTo(value2) == 0;
        }
        public static <T extends Comparable<T>> T findMax(T[] array) {
            if (array == null || array.length == 0) {
                return null;
            }
            T max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i].compareTo(max) > 0) {
                    max = array[i];
                }
            }
            return max;
        }
        public static void main(String[] args) {
            int int1 = 5;
            int int2 = 5;
            System.out.println("Are integers equal? " + isEqual(int1, int2));
            String str1 = "Hello";
            String str2 = "World";
            System.out.println("Are strings equal? " + isEqual(str1, str2));
            Double[] doubleArray = {3.14, 2.71, 1.618};
            System.out.println("Maximum double value: " + findMax(doubleArray));
        }
    }

