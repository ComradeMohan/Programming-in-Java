
class InvalidDecimalException extends Exception {
    public InvalidDecimalException() {
        super("Invalid decimal number entered.");
    }
}
class UserInputValidators{
    public static void validateDecimalInput(String input) throws InvalidDecimalException {
        try {
            double number = Double.parseDouble(input);
            if (Double.isNaN(number)) {
                throw new InvalidDecimalException();
            }
        } catch (NumberFormatException e) {
            throw new InvalidDecimalException();
        }
    }
}
public class Day3q6 {
    public static void main(String[] args) {
        String userInput = "abc";
        try {
            UserInputValidators.validateDecimalInput(userInput);
            System.out.println("User input is valid: " + userInput);
        } catch (InvalidDecimalException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
