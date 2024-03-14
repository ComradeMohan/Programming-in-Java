public class Day2q11c {
        private int number;
        public Day2q11c(int number) {
            this.number = number;
        }
        public void processData(Day2q11c anotherObject) {
            int sum = this.number + anotherObject.number;
            System.out.println("Sum: " + sum);
        }
        public static void main(String[] args) {
            Day2q11c obj1 = new
                    Day2q11c(30);
           Day2q11c obj2 = new
                    Day2q11c(15);
            obj1.processData(obj2);
        }
    }
