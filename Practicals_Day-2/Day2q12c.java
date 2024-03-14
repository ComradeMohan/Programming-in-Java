
    class Animal3 {
        void eat() {
            System.out.println("Animal is eating");
        }
    }
    class Dogs extends Animal3 {
        void eat() {
            super.eat();
            System.out.println("Dog is eating");
        }
    }
    public class Day2q12c {
        public static void main(String[] args) {
            Dogs myDog = new Dogs();
            myDog.eat();
        }
    }
