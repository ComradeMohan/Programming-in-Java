class ArmstrongThread extends Thread {
    private int start;
    private int end;

    public ArmstrongThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        System.out.println("Thread T1 (Armstrong numbers) started...");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println("Armstrong number found: " + i);
            }
        }
        System.out.println("Thread T1 (Armstrong numbers) finished...");
    }
    private boolean isArmstrong(int num) {
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        return sum == num;
    }
}
class FibonacciThread extends Thread {
    private int n;
    public FibonacciThread(int n) {
        this.n = n;
    }
    public void run() {
        System.out.println("Thread T2 (Fibonacci series) started...");
        int a = 0, b = 1, c;
        System.out.println("Fibonacci series:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("\nThread T2 (Fibonacci series) finished...");
    }
}
public class Day3q9 {
    public static void main(String[] args) {
        ArmstrongThread t1 = new ArmstrongThread(100, 999);
        FibonacciThread t2 = new FibonacciThread(10);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread finished...");
    }
}
