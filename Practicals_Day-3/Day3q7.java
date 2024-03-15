class NonIntegerValueException extends Exception {
    public NonIntegerValueException() {
        super("Non-integer value entered.");
    }
}
class UserInputValidatorss {
    public static void validateIntegerInput(String input) throws NonIntegerValueException {
        try {
            int number = Integer.parseInt(input);
            // Check if the input is a valid integer
            if (number < Integer.MIN_VALUE || number > Integer.MAX_VALUE) {
                throw new NonIntegerValueException();
            }
        } catch (NumberFormatException e) {
            throw new NonIntegerValueException();
        }
    }
}
public class Day3q7 {
    public static void main(String[] args) {
        String userInput = "abc";
        try {
            UserInputValidatorss.validateIntegerInput(userInput);
            System.out.println("User input is valid: " + userInput);
        } catch (NonIntegerValueException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
