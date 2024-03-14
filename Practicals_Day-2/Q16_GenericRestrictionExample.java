
    public class Q16_GenericRestrictionExample<T extends Number> {
        private T value;
        public Q16_GenericRestrictionExample(T value) {
            this.value = value;
        }
        public T getValue() {
            return value;
        }
        public static void main(String[] args) {
            // Using the generic class with Integer
            Q16_GenericRestrictionExample<Integer> integerExample = new
                    Q16_GenericRestrictionExample<>(42);
            System.out.println("Integer value: " + integerExample.getValue());
            // Using the generic class with Double
            Q16_GenericRestrictionExample<Double> doubleExample = new
                    Q16_GenericRestrictionExample<>(3.14);
            System.out.println("Double value: " + doubleExample.getValue());
        }
    }


