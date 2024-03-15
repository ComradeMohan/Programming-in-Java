import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Scanner;
public class Day3q3 {
    public static void main(String[] args) {
        try {
            String nonNumericString = "abc";
            int parsedNumber = Integer.parseInt(nonNumericString);
            System.out.println("Parsed Number: " + parsedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception occurred: " + e.getMessage());
        }
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int userInput = scanner.nextInt();
            System.out.println("User Input: " + userInput);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception occurred: " + e.getMessage());
        }
        try {
            String pattern = "#,##0.00";
            DecimalFormat decimalFormat = new DecimalFormat(pattern);
            String formattedNumber = decimalFormat.format("123.45");
            System.out.println("Formatted Number: " + formattedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception occurred: " + e.getMessage());
        }
        try {
            String numberString = "1,234.56";
            NumberFormat numberFormat = NumberFormat.getInstance();
            double parsedNumber = numberFormat.parse(numberString).doubleValue();
            System.out.println("Parsed Number: " + parsedNumber);
        } catch (ParseException e) {
            System.out.println("Number Format Exception occurred: " + e.getMessage());
        }
    }
}

