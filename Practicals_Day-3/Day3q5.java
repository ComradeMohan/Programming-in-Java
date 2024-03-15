
class NegativeValueException extends Exception {
    public NegativeValueException() {
        super("Negative values are not allowed.");
    }
}
class UserInputValidator {
    public static void validateInput(int value) throws NegativeValueException {
        if (value < 0) {
            throw new NegativeValueException();
        }
    }
}
public class Day3q5 {
    public static void main(String[] args) {
             try {
            int userInput = -5;
            UserInputValidator.validateInput(userInput);
            System.out.println("User input is valid: " + userInput);
        } catch (NegativeValueException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
