public class Day2q11b {
        private int number;
        private String text;
        // Constructor with two parameters
        public Day2q11b(int number, String text) {
            this.number = number;
            this.text = text;
        }
        public Day2q11b(int number) {
            this(number, "Default Text");
        }
        public void displayValues() {
            System.out.println("Number: " + number);
            System.out.println("Text: " + text);
        }
        public static void main(String[] args) {
            Day2q11b obj1 = new Day2q11b(42, "Hello, World!");
            obj1.displayValues();
            Day2q11b obj2 = new Day2q11b(17);
            obj2.displayValues();
        }
    }

