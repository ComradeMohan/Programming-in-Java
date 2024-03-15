class ValidationException extends Exception {
    public ValidationException(String message) {
        super(message);
    }
}
public class Day3q8 {
    public static void validateInput(int value) throws ValidationException {
        if (value < 0) {
            throw new ValidationException("Negative values are not allowed.");
        }
    }
    public static void main(String[] args) {
        try {
            int userInput = -5;
            validateInput(userInput);
            System.out.println("User input is valid: " + userInput);
        } catch (ValidationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
