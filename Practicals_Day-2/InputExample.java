import java.util.Scanner;
public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char charInput = scanner.next().charAt(0);
        System.out.print("Enter a string: ");
        String stringInput = scanner.next();
        System.out.print("Enter an integer: ");
        int intInput = scanner.nextInt();
        System.out.print("Enter a float: ");
        float floatInput = scanner.nextFloat();
        System.out.print("Enter a double: ");
        double doubleInput = scanner.nextDouble();
        System.out.println("Character: " + charInput);
        System.out.println("String: " + stringInput);
        System.out.println("Integer: " + intInput);
        System.out.println("Float: " + floatInput);
        System.out.println("Double: " + doubleInput);
        scanner.close();
    }
}
