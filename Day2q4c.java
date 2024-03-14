public class Day2q4c {
    public int sum(int a, int b) {
        return a + b;
    }
    public int sum(double a, double b) {
        return (int)(a + b);
    }
    public static void main(String[] args) {
        Day2q4c main = new Day2q4c();
        int sum1 = main.sum(1, 2);
        System.out.println("Sum of two integers: " + sum1);
        int sum2 = main.sum(1.5, 2.5);
        System.out.println("Sum of two doubles: " + sum2);
    }

}
