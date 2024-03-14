
public class Day2q11a {
        private int number;
        public void setNumber(int number) {
            // Use 'this' to refer to the instance variable
            this.number = number;
        }
        public int getNumber() {
            return this.number;
        }
        public static void main(String[] args) {
            Day2q11a obj = new Day2q11a() ;
            obj.setNumber(42);
            System.out.println("Number: " + obj.getNumber());
        }
    }

