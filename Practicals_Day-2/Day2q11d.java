public class Day2q11d {

        private int number;
        public Day2q11d setNumberAndReturn(int number) {
            this.number = number;
            return this;
        }
        public void displayValue() {
            System.out.println("Number: " + number);
        }
        public static void main(String[] args) {
            Day2q11d obj = new Day2q11d();
            obj.setNumberAndReturn(10).displayValue();
        }
    }

