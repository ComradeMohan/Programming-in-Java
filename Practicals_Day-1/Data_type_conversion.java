public class Data_type_conversion {

    public static void main(String[] args) {
        int intValue = 100;
        long longValue = intValue;
        float floatValue = intValue;
        double doubleValue = floatValue;

        System.out.println("Implicit Conversion (Widening):");
        System.out.println("int to long: " + longValue);
        System.out.println("int to float: " + floatValue);
        System.out.println("float to double: " + doubleValue);
        double largeDoubleValue = 123456789.123456789;
        float smallFloatValue = (float) largeDoubleValue;
        long smallLongValue = (long) largeDoubleValue;
        int smallIntValue = (int) largeDoubleValue;

        System.out.println("\nExplicit Conversion (Narrowing):");
        System.out.println("double to float: " + smallFloatValue);
        System.out.println("double to long: " + smallLongValue);
        System.out.println("double to int: " + smallIntValue);

        int maxValue = Integer.MAX_VALUE;
        int overflowValue = maxValue + 1; // Overflow scenario
        byte minValue = Byte.MIN_VALUE;
        byte underflowValue = (byte) (minValue - 1); // Underflow scenario

        System.out.println("\nOverflow and Underflow Scenarios:");
        System.out.println("Overflow Value: " + overflowValue);
        System.out.println("Underflow Value: " + underflowValue);
    }
}