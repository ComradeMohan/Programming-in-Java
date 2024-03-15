public class Day3q4 {
    public static void main(String[] args) {
        try {
            int radius = -5;
            calculateCircleArea(radius);
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument Exception occurred: " + e.getMessage());
        }
        try {
            String day = "Monday";
            DayOfWeek dayOfWeek = DayOfWeek.valueOf(day);
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument Exception occurred: " + e.getMessage());
        }
        try {
            int age = 150;
            setAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument Exception occurred: " + e.getMessage());
        }
        try {
            String username = null;
            validateUsername(username);
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument Exception occurred: " + e.getMessage());
        }
    }
    public static double calculateCircleArea(int radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return Math.PI * Math.pow(radius, 2);
    }
    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120");
        }
    }
    public static void validateUsername(String username) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
    }
}