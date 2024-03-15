class MyThreads extends Thread {
    private int[] numbers;

    public MyThreads(String name, int[] numbers) {
        super(name);
        this.numbers = numbers;
    }
    public void run() {
        System.out.println(getName() + " started...");
        try {
            for (int num : numbers) {
                if (num % 2 == 0) {
                    System.out.println(getName() + ": Even number found: " + num);
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " finished...");
    }
}
public class Day3q11 {
    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbers2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        MyThreads t1 = new MyThreads("Thread T1", numbers1);
        MyThreads t2 = new MyThreads("Thread T2", numbers2);
        t1.start();
        t2.start();
        try {
            if (containsEven(numbers1) || containsEven(numbers2)) {
                t1.join();
                t2.join();
            } else {
                t1.sleep(10000);
                t2.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread finished...");
    }
    private static boolean containsEven(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                return true;
            }
        }
        return false;
    }
}
